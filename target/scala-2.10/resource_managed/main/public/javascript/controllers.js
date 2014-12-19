/**
 * Controller that handle the logic of a spezifig Site
 */
towerdefenceApp.controller('GameContextCtrl', function ($scope, $http, $routeParams, gameContextFactory){
	
	$scope.uiState = "setTower";
	$scope.message = "Debug Messages";
	
	
	/**
	 * Loads a gameContext Json Object from the Server
	 * TODO Erstetzen durch Post Methode
	 */
	gameContextFactory.updateNewGameContext(function(gameContext) {
		$scope.gameContext = gameContext;
     });
	
	
	// ------------------------------- Click Methods ------------------------------------------
	
	/**
	 * Click on a spezific Field on the Playingfield 
	 */
	$scope.clickOnField = function(columID,rowID) {
		if($scope.uiState == "setTower") {
			$scope.message = 'setTower to ' + columID + ', ' + rowID;
			var response = $http.post('/settower/columID/rowID', $scope.gameContext);
	    	response.success(function(dataFromServer, status, headers, config) {
	    		$scope.message = dataFromServer;
	    	});
	        response.error(function(data, status, headers, config) {
	        	alert("Submitting GameContext failed!");
	        });
		} else {
			// TODO Show Information about Field
		}
	};
	
	/**
	 * Post Function that send the current GameContex and get a new one
	 * TODO In GameContextFactory verschieben
	 */
	$scope.postFunction = function() {
		var response = $http.post('/post', $scope.gameContext);
	    	response.success(function(dataFromServer, status, headers, config) {
	    		$scope.message = dataFromServer;
	       });
	        response.error(function(data, status, headers, config) {
	        	alert("Submitting GameContext failed!");
	       });
	};
});
