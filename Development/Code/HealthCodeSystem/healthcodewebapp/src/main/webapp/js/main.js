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
                $location.path('/dashboard');
            }
            
           
           
            
        });
    }
]);
app.config([
    '$stateProvider', '$urlRouterProvider', function ($stateProvider, $urlRouterProvider) {
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
                'content@': { templateUrl: 'Views/Login.html' },
                'footer@': { templateUrl: 'templates/partials/Footer.html' }
            }
        }).state('dashboard', {
            url: '/dashboard',
            views: {
                'header@': { templateUrl: 'templates/partials/Header.html' },
                'footer@': { templateUrl: 'templates/partials/Footer.html' }
            }
        }).state('dashboard.PatientHistory', {
            url: '/PatientHistory',
            views: {
                'header@': { templateUrl: 'templates/partials/Header.html' },
                'content@': {
                    templateUrl: 'templates/partials/PatientHistory.html'
                },
                'footer@': { templateUrl: 'templates/partials/Footer.html' }
            }
        }).state('dashboard.PatientProfile', {
            url: '/PatientProfile',
            views: {
                'header@': { templateUrl: 'templates/partials/Header.html' },
                'content@': {
                    templateUrl: 'templates/partials/Patientprofile.html'
                },
                'footer@': { templateUrl: 'templates/partials/Footer.html' }
            }

        }).state('dashboard.Bookappointment', {
            url: '/Bookappointment',
            views: {
                'header@': { templateUrl: 'templates/partials/Header.html' },
                'content@': {
                    templateUrl: 'templates/partials/Bookappointment.html'
                },
                'footer@': { templateUrl: 'templates/partials/Footer.html' }
            }
        }).state('dashboard.ViewReports', {
            url: '/ViewReports',
            views: {
                'header@': { templateUrl: 'templates/partials/Header.html' },
                'content@': {
                    templateUrl: 'templates/partials/ViewReports.html'
                },
                'footer@': { templateUrl: 'templates/partials/Footer.html' }
            }
        }).state('dashboard.Prescription', {
            url: '/Prescription',
            views: {
                'header@': { templateUrl: 'templates/partials/Header.html' },
                'content@': {
                    templateUrl: 'templates/partials/Prescription.html'
                },
                'footer@': { templateUrl: 'templates/partials/Footer.html' }
            }
        });
    }
]);





