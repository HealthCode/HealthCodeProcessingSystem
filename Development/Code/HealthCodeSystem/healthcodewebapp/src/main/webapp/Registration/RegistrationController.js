app.controller('RegistrationCtrl', ['$scope', '$rootScope','$timeout','$location', 'RegistrationService',function ($scope, $rootScope, $timeout,$location, RegistrationService) {

	$scope.user={};
	
//    formValidation();
//	$timeout( function(){	
//		$(document).ready(function() {
//		    $('#patientsignupform').formValidation({
//		    	 framework: 'bootstrap',
//		        icon: {
//		            valid: 'glyphicon glyphicon-ok',
//		            invalid: 'glyphicon glyphicon-remove',
//		            validating: 'glyphicon glyphicon-refresh'
//		        },
//		        fields: {
//		            firstName: {
//		            
//		               validators: {
//		                    notEmpty: {
//		                        message: 'The first name is required and cannot be empty'
//		                    },
//		                   regexp: {
//		                        regexp: /^[A-Z\s]+$/i,
//		                        message: 'The first name can only consist of alphabetical characters and spaces'
//		                    }
//		                }
//		              },
//		               lastName: {
//		               
//		  	                validators: {
//		                    notEmpty: {
//		                        message: 'The last name is required and cannot be empty'
//		                    },
//		                     regexp: {
//		                        regexp: /^[A-Z\s]+$/i,
//		                        message: 'The last name can only consist of alphabetical characters and spaces'
//		                    }
//		                }
//		            },
//		              
//		            username: {
//		            
//		                message: 'The username is not valid',
//		                validators: {
//		                    notEmpty: {
//		                        message: 'The username is required and cannot be empty'
//		                    },
//		                    stringLength: {
//		                        min: 6,
//		                        max: 30,
//		                        message: 'The username must be more than 6 and less than 30 characters long'
//		                    },
//		                    regexp: {
//		                        regexp: /^[a-zA-Z0-9_\.]+$/,
//		                        message: 'The username can only consist of alphabetical, number, dot and underscore'
//		                    }
//		                }
//		            },
//		            
//		             email: {
//		                validators: {
//		                    emailAddress: {
//		                        message: 'The input is not a valid email address'
//		                    },
//		                     notEmpty: {
//		                        message: 'The email is required and cannot be empty'
//		                    }
//		                }
//		            },
//		            
//		             mobile: {
//		                validators: {
//		                       notEmpty: {
//		                        message: 'The mobile is required and cannot be empty'
//		                    },
//		                     digits: {
//		                        message: 'The value can contain only digits'
//		                    }
//		                   
//		                }
//		            },
//		            
//		             password: {
//		                validators: {
//		                    notEmpty: {
//		                        message: 'The password is required and cannot be empty'
//		                    },
//		                    different: {
//		                        field: 'username',
//		                        message: 'The password cannot be the same as username'
//		                    }
//		                 }
//		            },
//		            
//		            confirmPassword:{
//		                 validators: {
//		                    notEmpty: {
//		                        message: 'The Cconfirmpassword is required and cannot be empty'
//		                    },
//		                    identical:{
//		                        field: 'password',
//		                        message: 'The password and its confirm are not the same'
//		                }
//		            }
//		          },
//		          
//		           gender: {
//		                validators: {
//		                    notEmpty: {
//		                        message: 'The gender is required and cannot be empty'
//		                    }
//		                }
//		            },
//		            
//		            city: {
//		                validators: {
//		                    notEmpty: {
//		                        message: 'The city is required and cannot be empty'
//		                    }
//		                }
//		            },
//		            
//		           address:{
//		         
//		                   validators: {
//		                    notEmpty: {
//		                        message: 'The address is required and cannot be empty'
//		                    }
//		                }  
//		           },
//		           
//		           acceptTerms: {
//		                validators: {
//		                    notEmpty: {
//		                        message: 'You have to accept the terms and policies'
//		                    }
//		                }
//		            }
//		       }
//		    });
//		});
//		},10);

    
	$scope.SubmitForm = function (data) {
  	
  RegistrationService.Register($scope.user).then(function (response) {
            	if (response.type == "success") {
            		console.log('success');
            		$rootScope.message="Registration Succesfull";
            		//$scope.message="Registration Succesfull";
//            		 window.location.href = '/Login';
            		 $location.path('/loginafterRegis');
                    }
                else {
                	console.log('Error saving userinfo');
                }
                               
            });
 
 }
 
}]);
