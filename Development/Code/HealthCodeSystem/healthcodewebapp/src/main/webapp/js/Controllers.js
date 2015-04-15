﻿app.controller('Homectrl', ['$scope', function ($scope) {
    //call a service that retrieving the details of user..depends on the user role we will add list to menu
    $scope.MenuItems = [
        { Description: "View History", route: "dashboard.PatientHistory" },
        { Description: "View Profile", route: "dashboard.PatientProfile" },
        { Description: "Book appointment", route: "dashboard.Bookappointment" },
        { Description: "View Reports", route: "dashboard.ViewReports" },
        { Description: "View Prescription", route: "dashboard.Prescription" }
    ];
   }]);

app.controller('Loginctrl', ['$scope', '$rootScope', '$location', 'authenticationService', function ($scope, $rootScope, $location, authenticationService) {

    $scope.credentials = {};

    $scope.login = function () {
        var username = $scope.credentials.username;
        var password = $scope.credentials.password;
        authenticationService.Login(username, password, function (response) {
            if (response.success) {

                window.location.href = 'Dashboard.html#/dashboard/PatientHistory';
                console.log("correct");
            } else {
                $scope.error = response.message;
                console.log(response.message);
            }
        });

    }

}]);

app.controller('RegistrationCtrl', function ($scope) {
    $(document).ready(function() {
        $("#Iagree").hide();
        $("#btn-register").hide();
    });
 $scope.changeFormbyRole = function () {
     $("#Iagree").show();
     $("#btn-register").show();
      };

});

app.controller('PatientHistoryCtrl', ['$scope', function ($scope) {
    //call a service that retrieving the visit details and set here
    $scope.VisitDetails = [
    {Id:1, Doctor: "Bipin seth", Time: "1:00Am", Hospital: "care Hospitals" },
    { Id: 2, Doctor: "Bipin seth", Time: "1:00Am", Hospital: "care Hospitals" },
    { Id: 3, Doctor: "Murthy", Time: "2:00Am", Hospital: "care Hospitals" },
    { Id: 4, Doctor: "Arun", Time: "3:00pm", Hospital: "Apollo" },
    { Id: 5, Doctor: "Sailaja", Time: "4:00Am", Hospital: "Lotus" },
    { Id: 6, Doctor: "Aswini", Time: "5:00Am", Hospital: "Apollo" },
    { Id: 7, Doctor: "Bipin seth", Time: "1:00Am", Hospital: "care Hospitals" },
    { Id: 8, Doctor: "Murthy", Time: "2:00Am", Hospital: "care Hospitals" },
    { Id: 9, Doctor: "Arun", Time: "3:00pm", Hospital: "Apollo" },
    { Id: 10, Doctor: "Sailaja", Time: "4:00Am", Hospital: "Lotus" },
    { Id: 11, Doctor: "Aswini", Time: "5:00Am", Hospital: "Apollo" },
    { Id: 12, Doctor: "Bipin seth", Time: "1:00Am", Hospital: "care Hospitals" },
    { Id: 13, Doctor: "Murthy", Time: "2:00Am", Hospital: "care Hospitals" },
    { Id: 14, Doctor: "Arun", Time: "3:00pm", Hospital: "Apollo" },
    { Id: 15, Doctor: "Sailaja", Time: "4:00Am", Hospital: "Lotus" },
    { Id: 16, Doctor: "Aswini", Time: "5:00Am", Hospital: "Apollo" }
    ];


}]);

//app.controller('PatientProfileCtrl', [
//    '$scope', function($scope) {
//        //call a service that retrieving the Patient  details and set here
//        $scope.PatientDetails = [{ name: "Neeraja", email: "neeraja.gmail@com", mobile: "9701444011", gender: "Male", address: "Kphb colony", city: "Hyderabad" }];
//    }
//]);