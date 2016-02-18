function Hello($scope, $http) {
    $http.get('http://localhost:8080/api/user/9/account').
        success(function(data) {
        	alert(JSON.stringify(data));
            $scope.greeting = data;
        });
}