app.controller('RegistrationCtrl', [ '$scope', 'usermanagementService',
		function($scope, usermanagementService) {

			

			$scope.SubmitForm = function(data) {
				
				var user = $scope.createUser();
				console.log(user);
				usermanagementService.RegisterUser(user);

			}

			$scope.createUser = function() {

				var user = new Object();

				user.firstName = $scope.user.firstname;
				user.lastName = $scope.user.lastname;
				user.gender = $scope.user.gender;
//				user.UserName = $scope.user.username;
				user.contactInfo = {
					email : $scope.user.email,
					contactNo : $scope.user.mobile
				};
				user.address = {
					City : $scope.user.city,
					Address : $scope.user.address
				};

//				user.Password = $scope.user.password;
//				user.PasswordConfirmation = $scope.user.confirmpassword;

				return user;

			}

		} ]);
