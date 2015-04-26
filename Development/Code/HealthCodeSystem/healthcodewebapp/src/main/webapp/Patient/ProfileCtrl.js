Patientapp.controller('ProfileCtrl', [
    '$scope', function($scope) {
        //call a service that retrieving the Patient  details and set here
//        $scope.PatientDetails = [{ name: , email: , mobile: "9701444011", gender: "Male", address: "Kphb colony", city: "Hyderabad" }];
    	
    	var response=patientService.getUserInfo();
    	if(response.result){
    		
    		$scope.firstName=response.result.firstName;
        	$scope.lastName=response.result.lastName;
//        	$scope.healthCode=response.result.healthCode;
        	$scope.userName=response.result.userName;
        	$scope.email=response.result.contactInfo.email;
        	$scope.mobile=response.result.contactInfo.mobile;
        	$scope.gender=response.result.gender;
        	$scope.age=response.result.age;
        	$scope.city=response.result.address.city;
        	$scope.address=response.result.address;
        	
        	$scope.EditMode=false;
        	$scope.DisplayMode=true;
        	$scope.ShowEditButton=true;
        	$scope.ShowCancelButton=false;
        	$scope.ShowUpdateButton=false;
    	}
    	
//    	$scope.firstName="Neeraja";
//    	$scope.lastName="Srilakshmi";
//    	$scope.healthCode="101";
//    	$scope.userName="neeraja201";
//    	$scope.email="neeraja.gmail@com";
//    	$scope.mobile="9701444011";
//    	$scope.gender="Female";
//    	$scope.age="25";
//    	$scope.city="Hyderabad";
//    	$scope.address="nijampet";
    	
    	
    	$scope.editUser=function(){
    		
    		$scope.EditMode=true;
    		$scope.DisplayMode=false;
    		$scope.ShowCancelButton=true;
        	$scope.ShowUpdateButton=true;
        	$scope.ShowEditButton=false;
        	
        	
        	
    	}
    	
    	$scope.updateUser=function(){
    		
    		var user=$scope.createUserObject();
    		patientService.updateUser(user);
			
			console.log(user);
    	}
    	
    	 $scope.createUserObject = function () {

    		 var user = new Object();

 			user.firstName = $scope.firstname;
 			user.lastName = $scope.lastname;
 			user.gender = $scope.gender;
// 			user.UserName = $scope.user.username;
 			user.contacts = {
 				email : $scope.email,
 				contactNo : $scope.mobile
 			};
 			user.address = {
 				City : $scope.city,
 				Address : $scope.address
 			};
 			
 			return user;
    	 }
    }
]);