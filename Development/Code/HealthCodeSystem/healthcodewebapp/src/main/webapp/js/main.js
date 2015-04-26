var app = angular.module('Healthcodeapp', ['ui.router']);

var roles = { patient: 0, doctor: 1 };
var routeForUnauthorizedAccess = '/';
app.run([
    '$rootScope', '$state', '$stateParams', '$location', function ($rootScope, $state, $stateParams, $location) {
        // It's very handy to add references to $state and $stateParams to the $rootScope
        // so that you can access them from any scope within your applications.
        $rootScope.$state = $state;
        $rootScope.$stateParams = $stateParams;
        $rootScope.$on('$locationChangeStart', function (event, next, current) {
            // redirect to login page if not logged in
            if ($rootScope.authenticated) {
                $location.path('/patientDashboard');
            }
              
        });
    }
]);
app.config(['$stateProvider', '$urlRouterProvider', function ($stateProvider, $urlRouterProvider) {
        $urlRouterProvider.otherwise('/');
        $stateProvider.state('home', {
            url: '/',
            views: {
                'header@': { templateUrl: 'templates/partials/Header.html' },
                'content@': { templateUrl: 'templates/partials/Content.html' },
                'footer@': { templateUrl: 'templates/partials/Footer.html' }
            }
        }).state('loginafterRegis', {
            url: '/loginafterRegis',
            views: {
                'header@': { templateUrl: 'templates/partials/Header.html' },
                'content@': { templateUrl: 'Usermanagement/Login.html',
                	           controller: 'Loginctrl'},
                'footer@': { templateUrl: 'templates/partials/Footer.html'
                	}
            }
        });
    }
]);

var Patientapp=angular.module('Patientapp',['ui.router' ,'Healthcodeapp' ]);
Patientapp.config((['$stateProvider', '$urlRouterProvider', function ($stateProvider, $urlRouterProvider) { 
    	
	    $urlRouterProvider.otherwise('/patientDashboard.PatientHistory');

			$stateProvider.state('patientDashboard', {
				url : '/patientDashboard',
				views : {
					
					'sidenav@': { 
						templateUrl: 'templates/partials/SideNav.html'
						},
					'footer@' : {
						templateUrl : 'templates/partials/Footer.html'
					}
				}
			}).state('patientDashboard.PatientHistory', {
				url : '/PatientHistory',
				views : {
					'sidenav@': { 
						templateUrl: 'templates/partials/SideNav.html'
						},
					'content@' : {
						templateUrl : 'Patient/History.html',
						controller: 'HistoryCtrl'
					}
				}
			}).state('patientDashboard.PatientProfile', {
				url : '/PatientProfile',
				views : {
					
					'content@' : {
						templateUrl : 'Patient/Profile.html',
						controller: 'ProfileCtrl'
					}
				}

			}).state('patientDashboard.Bookappointment', {
				url : '/Bookappointment', 
				views : {
					
					'content@' : {
						templateUrl : 'Patient/Bookappointment.html'
					}
				}
			}).state('patientDashboard.ViewReports', {
				url : '/ViewReports',
				views : {
				
					'content@' : {
						templateUrl : 'Patient/ViewReports.html'
					}
				}
			}).state('patientDashboard.Prescription', {
				url : '/Prescription',
				views : {
					
					'content@' : {
						templateUrl : 'Patient/Prescription.html'
					}
				}
			});
        
    }]));

Patientapp.controller('Sidenavctrl', ['$scope', function ($scope){
		
 $scope.MenuItems = [ {
		Description : "View History",
		route : "patientDashboard.PatientHistory"
	}, {
		Description : "View Profile",
		route : "patientDashboard.PatientProfile"
	}, {
		Description : "Book appointment",
		route : "patientDashboard.Bookappointment"
	}, {
		Description : "View Reports",
		route : "patientDashboard.ViewReports"
	}, {
		Description : "View Prescription",
		route : "patientDashboard.Prescription"
	} ];
	
}]);



//app.controller('Homectrl', ['$scope', function ($scope) {
//    //call a service that retrieving the details of user..depends on the user role we will add list to menu
//    $scope.MenuItems = [
//        { Description: "View History", route: "patientDashboard.PatientHistory" },
//        { Description: "View Profile", route: "patientDashboard.PatientProfile" },
//        { Description: "Book appointment", route: "patientDashboard.Bookappointment" },
//        { Description: "View Reports", route: "patientDashboard.ViewReports" },
//        { Description: "View Prescription", route: "patientDashboard.Prescription" }
//    ];
//    
//   
//   }]);




