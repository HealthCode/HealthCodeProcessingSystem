app.service('usermanagementService', ['$rootScope','$location','httpService','$window',function($rootScope,$location,httpService,$window) {

	
		this.RegisterUser= function(User) {
			
			httpService.PostData('patientdetails.do', User).then(function (response) {
            	if (response.type == "success") {
            		console.log('success');
            		$rootScope.message=response.text;
            	    $location.path('/loginafterRegis');
                    }
                else {
                	 console.log('Error saving userinfo');
                }
                               
            });
		};
		
//		this.Login=function(Credentials){
//			
//			httpService.PostData('.do', Credentails).then(function(response,headers){
//				
//				if(response.type=="success"){
//					var userInfo={
//							
//							accessToken: headers('access_token'),
//							username   : response.result.username,
//							healthcode : response.result.healthcode,
//							role       : response.result.role
//							
//					};
//							
//					
//					$window.sessionStorage["userinfo"]=JSON.stringify(userinfo);
//					console.log('success');
//					$rootScope.authenticated=true;
//					$rootScope.message=response.text;
//					if(role=="patient"){
//						 window.location.href = 'PatientDashboard.html#/patientDashboard';
//					}
//				
//				}
//				
//				else{
//					 console.log('Not authenticated');
//					 $rootScope.message=response.text;
//					 $location.path('/');
//				}
//				
//			});
//		}
			

				
}]);	

app.factory('authenticationService', ['$rootScope', '$timeout', function ($rootScope, $timeout) {
    return {
        Login: function (username, password, callback) {
            $timeout(function () {
                var response = { success: username === 'test' && password === 'test' };
                if (!response.success) {
                    response.message = 'Username or password is incorrect';
                    $rootScope.authenticated = false;
                }
                else { 
                	$rootScope.authenticated = true; }
                callback(response);
            }, 1000);
        }

    }
}]);
	

// app.service('authenticationService', [
// '$http', '$timeout', '$q', function ($http, $timeout, $q) {
//        var authenticatedUser = null;
//        return {
//            requestUser: function () {
//                var deferred = $q.defer;
//                $http.get('/api/user.json').success(function (user) {
//                    authenticatedUser = user;
//                    deferred.resolve(user);
//                }).error(function (error) {
//                    deferred.reject(error);
//                });
//                return deferred.promise;
//            },
//            getUser: function () {
//                return authenticatedUser;
//            },
//            exists: function () {
//                return authenticatedUser != null;
//            },
//            login: function (credentials) {
//                var deferred = $q.defer;
//                $http.post('/auth/login', credentials).success(function (user) {
//                    if (user != null) {
//                        authenticatedUser = user;
//                        deferred.resolve(user);
//                    } else {
//                        deferred.reject('Given credentials are not correct');
//                    }
//                }).error(function (error) {
//                    deferred.reject(error);
//                });
//                return deferred.promise;
//            },
//            logout: function () {
//                authenticatedUser = null;
//            },
//            ispatient: function () {
//                return this.exists() && authenticatedUser.role == 'Patient';
//            }
//        }
//    }
//]);




