app.service('patientService', ['$rootScope','$location','httpService','$window',function($rootScope,$location,httpService,$window) {

	
		this.getUserInfo= function() {
			
			var params = sessionStorage.getItem("healthCode");			
			httpService.GetData('/patientdetails.do?healthcode='+params).then(function (response) {
				return{
            	       if (response.type == "success") {
            		   console.log('success');
            		   return response;
                    }
                      else 
                      {
                	   console.log('Error saving userinfo');
                	   
                	   }
                
				}
                               
            });
		};
		
		this.updateUser=function(){
			
			
			
		};
}]);