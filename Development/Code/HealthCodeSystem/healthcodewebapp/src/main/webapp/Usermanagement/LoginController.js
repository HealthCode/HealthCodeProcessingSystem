app.controller('Loginctrl', ['$scope', 'authenticationService', function ($scope,authenticationService) {

	
    $scope.credentials = {};
    
//    $scope.formValidation();

    $scope.login = function () {
        var username = $scope.credentials.username;
        var password = $scope.credentials.password;
        authenticationService.Login(username, password, function (response) {
            if (response.success) {

                window.location.href = 'PatientDashboard.html#/patientDashboard/PatientHistory';
                console.log("correct");
            } else {
                $scope.error = response.message;
                console.log(response.message);
            }
        });

    }
    
//  $scope.formValidation=function (){
//	  	$(document).ready(function() {
//	  		$('#loginform').formValidation({
//	  		 	 framework: 'bootstrap',
//	  		     icon: {
//	  		         valid: 'glyphicon glyphicon-ok',
//	  		         invalid: 'glyphicon glyphicon-remove',
//	  		         validating: 'glyphicon glyphicon-refresh'
//	  		     },
//	  		     fields: { username: {
//	  		         
//	  		         message: 'The username is not valid',
//	  		         validators: {
//	  		             notEmpty: {
//	  		                 message: 'The username is required and cannot be empty'
//	  		             }
//	  		          
//	  		         }
//	  		     },
//	  		     
//	  		     password: {
//	  		         validators: {
//	  		             notEmpty: {
//	  		                 message: 'The password is required and cannot be empty'
//	  		             }
//	  		          }
//	  		     }
//	  		  }
//	  		 });
//	  	});
//  }
//
//	  
//    
    

  }]);