app.factory('authenticationService', ['$rootScope', '$timeout', function ($rootScope, $timeout) {
    return {
        Login: function (username, password, callback) {
            $timeout(function () {
                var response = { success: username === 'test' && password === 'test' };
                if (!response.success) {
                    response.message = 'Username or password is incorrect';
                    $rootScope.authenticated = false;
                }
                else { $rootScope.authenticated = true; }
                callback(response);
            }, 1000);
        }

    }
}]);

app.service('RegistrationService', function($http, $q) {

	return {
		Register : function(userinfo) {

			var deferred = $q.defer();
			$http.post('new/savepatientdetails.do', userinfo)
					.success(function(userinfo) {
						if (userinfo != null) {
						deferred.resolve(userinfo);
						} else {
							deferred.reject("Error saving userinfo");
						}
					}).error(function(error) {
						console.log("Error saving userinfo")
						deferred.reject("Error saving userinfo");
					});
			return deferred.promise;
		}

	}
});

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




