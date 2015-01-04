/**
 * Controller that handle the logic of the playing Game
 */
towerdefenceApp.controller('GameContextCtrl', function ($scope, $http, $routeParams, $timeout, gameContextFactory){
	
	$scope.message = "Debug Messages";
	
	$scope.uiState = "setTower";
	var updateTime = 500;
	var updateTimer;
	var pause = false;
	var stop = false;
	
	$scope.fieldType;
	$scope.fieldProperties;
	$scope.gameContext = {};
	
	
	// ------------------------------- Click Methods ------------------------------------------
	
	/**
	 * Click on a spezific Field on the Playingfield 
	 */
	$scope.clickOnField = function(columID, rowID, fieldContent) {
		if($scope.uiState == "setTower") {
			setTowerToPosition(columID, rowID);
		} else {
			showFieldInformation(fieldContent);
		}
	};
	
	/**
	 * The Table field check witch Content is on it
	 */
	$scope.getFieldContent = function(fieldContent) {
		return checkFieldContent(fieldContent);
	}
	
	$scope.sendMob = function() {
		$scope.message = "Send Mob from Start";
		var sendMobURL = '/sendMob';
		updateFunction(sendMobURL)
	}
	
	/**
	 * Pause or restart Game
	 */
	$scope.pause = function(){
		  if(pause) {
			  $scope.intervalFunction();
		  } else {
			  $timeout.cancel(updateTimer);
		  }
		  pause = !pause;
	  };
	
	// ------------------------------- Fillter Mehtod ------------------------------------------
	
	$scope.filterProperties = function(key) {
		switch(key) {
		case "controllable":
			return false;
		case "lastTime":
			return false;
		case "tmpSpeed":
			return false;
		case "tmpCoord":
			return false;
		case "position":
			return false;
		case "coord":
			return false;
		default:
			return true;
		}
	}
	
	// ------------------------------- Helper Methods ------------------------------------------
	
	/**
	 * Set the Tower to the selected Field
	 */
	function setTowerToPosition(columID, rowID) {
		$scope.message = 'setTower to ' + columID + ', ' + rowID;
		var setTowerUrl = '/settower/' + columID + '/' + rowID;
		updateFunction(setTowerUrl);
	}
	
	/**
	 * Save and Show Informations about the selected Field in the Properties Tag
	 */
	function showFieldInformation(fieldContent) {
		$scope.message = fieldContent;
		
		var fieldKey = Object.keys(fieldContent);
		var fieldKeyString = fieldKey.toString();
		
		$scope.fieldType = checkFieldContent(fieldContent);
		if($scope.fieldType == "mob") {
			$scope.message = fieldContent.mobList[0];
			$scope.fieldProperties = fieldContent.mobList[0];
		}  else  {
			$scope.message = fieldContent[$scope.fieldType];
			$scope.fieldProperties = fieldContent[$scope.fieldType];
		}
	}
	
	/**
	 * Check the Key of the Content on the Field
	 */
	function checkFieldContent(fieldContent) {
		var fieldKey = Object.keys(fieldContent);
		var fieldKeyString = fieldKey.toString();
		
		switch(fieldKeyString) {
			case "tower":
				return "tower";
			case "mobList,sizeMobList":
				return "mob";checkIfGameOver();
			default:
				return "";
		}
	}
	  
	// ------------------------------- Post/Update Methods ------------------------------------------
	  
	 /**
	 * Post Function that send the current GameContex and get a new one
	 */
	 function updateFunction(url) {
		 if(!stop) {
			 var response = $http.post(url, $scope.gameContext);
				response.success(function(dataFromServer, status, headers, config) {
					$scope.gameContext = dataFromServer;
					checkIfGameOver($scope.gameContext);
			   });
			    response.error(function(data, status, headers, config) {
			    	alert("Submitting GameContext failed!");
			   })
		 }
	};
	
	/**
	 * Timer that calls the update Function every Second
	 */
	  $scope.intervalFunction = function(){
	    updateTimer = $timeout(function() { 
	    	updateFunction('/update');
	    	$scope.intervalFunction();
	    }, updateTime)
	  };
	  
	  /**
	   * Starts the update Intervall Function
	   */
	  $scope.intervalFunction();
	  
	  // Debug Single Update 
//	  updateFunction('/update');
	 
	  
	  // ----------------------------------- Close Methode ----------------------------------------
	  
	  function checkIfGameOver(gameContext) {
		  if(gameContext.player.life <= 0) {
			  alert("Game Over !");
			  stop = true;
		  }
	  }
	  
	  $scope.$on('$destroy', function(){
		  $timeout.cancel(updateTimer);
		  alert("Stop Controller");
	  });
});
