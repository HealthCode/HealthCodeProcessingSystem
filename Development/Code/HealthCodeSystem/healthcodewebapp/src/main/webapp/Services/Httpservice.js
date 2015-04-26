app.factory('httpService', [
		'$http',
		'$q',
		function($http, $q) {

			return {

				PostData : function(url, data) {

					var deferred = $q.defer();

					$http.post(url, data).success(
							function(response, status, headers, config) {

								deferred.resolve(response);
								console.log("Success Posting Data");

							}).error(function(error) {

						deferred.reject("Error Posting Data");
						console.log("Error Posting Data");
					});

					return deferred.promise;

				},
				

				 GetData : function(url) {
				
				 var deferred = $q.defer();
				
				 $http.get(url).success(function(response, status, headers,
				 config) {
				
				 deferred.resolve(response);
				 console.log("Success Getting Data");
										
				 }).error(function(error) {
				 deferred.reject("Error Getting Data");
									
				 });
				
				 return deferred.promise;
				
				 },

				}

		} ]);
