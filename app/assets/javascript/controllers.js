/**
 * Controller that handle the logic of a spezifig Site
 */
towerdefenceApp.controller('GameContextCtrl', function ($scope, $http, $routeParams, gameContextFactory){
	
	$scope.message = "Debug Messages";
	
	$scope.uiState = "setTower";
	$scope.fieldType;
	$scope.fieldProperties;
	
	/**
	 * Loads a gameContext Json Object from the Server
	 * TODO Erstetzen durch Post Methode
	 */
	gameContextFactory.updateNewGameContext(function(gameContext) {
		$scope.gameContext = gameContext;
     });
	
	/**
	 * Post Function that send the current GameContex and get a new one
	 * TODO In GameContextFactory verschieben
	 */
	 function postFunction(url) {
		var response = $http.post(url, $scope.gameContext);
	    	response.success(function(dataFromServer, status, headers, config) {
	    		$scope.gameContext = dataFromServer;
	       });
	        response.error(function(data, status, headers, config) {
	        	alert("Submitting GameContext failed!");
	       });
	};
	
	// ------------------------------- Helper Methods ------------------------------------------
	
	/**
	 * DEPRECATE
	 */
	function getFieldByColumAndRow(columID, rowID) {
		var countRow = 0;
		var countColum = 0;
		var fieldArray = $scope.gameContext.playingField.fieldArray;
		
		angular.forEach(fieldArray, function(value,index) {
			if(countRow == rowID) {
				alert(index);
				angular.forEach(value, function(value,index) {
					if(countColum == columID) {
						alert(index);
						$scope.message = value;
					}
					countColum++;
				})
			}
			countRow++;
        })
	}
	
	
	function checkFieldContentFunction(fieldContent) {
		var fieldKey = Object.keys(fieldContent);
		var fieldKeyString = fieldKey.toString();
		
		switch(fieldKeyString) {
			case "tower":
				return "tower";
			case "mob":
				return "mob";
			default:
				return "";
		}
	}
	
	
	// ------------------------------- Click Methods ------------------------------------------
	
	/**
	 * Click on a spezific Field on the Playingfield 
	 */
	$scope.clickOnField = function(columID, rowID, fieldContent) {
		if($scope.uiState == "setTower") {
			$scope.message = 'setTower to ' + columID + ', ' + rowID;
			var setTowerUrl = '/settower/' + columID + '/' + rowID;
			postFunction(setTowerUrl);

		} else {
			$scope.fieldType = checkFieldContentFunction(fieldContent);
			$scope.fieldProperties = fieldContent[$scope.fieldType];
			
			$scope.message = $scope.fieldProperties;
		}
	};
	
	$scope.checkFieldContent = function(fieldContent) {
		return checkFieldContentFunction(fieldContent);
	}
	
});
