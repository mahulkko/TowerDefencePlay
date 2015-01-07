/**
 * Controller that handle the logic of the playing Game LoginCtrl
 */
towerdefenceApp.controller('GameContextCtrl', function ($scope, $http, $routeParams, $timeout, gameContextFactory){
	
	$scope.message = "Debug Messages";
	$scope.uiState = "setTower";
	
	var actionHappen = false;
	var actionUrl = "";
	
	var updateTime = 500;
	var updateTimer;
	var pause = false;
	var stop = false;
	
	$scope.fieldType;
	$scope.fieldProperties;
	$scope.position = {};
	
	$scope.gameContext = {};
	
	
	// ------------------------------- Click Methods ------------------------------------------
	
	/**
	 * Click on a spezific Field on the Playingfield 
	 */
	$scope.clickOnField = function(columID, rowID, fieldContent) {
		
		if($scope.uiState == "setTower") {
			setTowerToPosition(columID, rowID);
		} else {
			$scope.position.x = columID;
			$scope.position.y = rowID;
			showFieldInformation(fieldContent);
		}
	};
	
	/**
	 * The Table field check witch Content is on it
	 */
	$scope.getFieldContent = function(columID, rowID, fieldContent) {
		return checkFieldContent(columID, rowID, fieldContent);
	}
	
	$scope.sendMob = function() {
		$scope.message = "Send Mob from Start";
		actionURL = '/sendMob';
		actionHappen = true;
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
	 
	 /**
	  * Upgrade a spezific Tower
	  */
	 $scope.upgradeTower = function() {
		$scope.message = 'upgrade Tower on Position ' + $scope.position.x + ', ' + $scope.position.y;
		actionURL = '/upgradetower/' + $scope.position.x + '/' + $scope.position.y;
		$scope.message = actionURL;
		actionHappen = true;
		var fieldContent = getFieldContentByPosition($scope.position.x, $scope.position.y);
		showFieldInformation(fieldContent);
	 }
	
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
		actionURL = '/settower/' + columID + '/' + rowID;
		$scope.message = actionURL;
		actionHappen = true;
	}
	
	/**
	 * Save and Show Informations about the selected Field in the Properties Tag
	 */
	function showFieldInformation(fieldContent) {
		$scope.message = "Show Field Infomations: " + fieldContent;
		
		$scope.fieldType = compareFieldKeyString(fieldContent);
	
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
	function checkFieldContent(x, y, fieldContent) {
		var fieldTypeString = compareFieldKeyString(fieldContent);
		
		var found = false;
		angular.forEach($scope.gameContext.ShortestWay, function(item) {
			if(!found) {
				if(x == item.x && y == item.y) {
					if(fieldTypeString != "mob") {
						fieldTypeString = "way";
						found = true;
					}
				}
			} 
		});
		return fieldTypeString;
	}
	
	
	function compareFieldKeyString(fieldContent) {
		var fieldKey = Object.keys(fieldContent);
		var fieldKeyString = fieldKey.toString();
		
		switch(fieldKeyString) {
		case "tower":
			return "tower";
		case "mobList,sizeMobList":
			return "mob";
		default:
			return "";
		}
	}
	
	function getFieldContentByPosition(x, y) {
		var row = $scope.gameContext.playingField.fieldArray["row"+y];
		var fieldContent = row[x];
		return fieldContent;
	}
	  
	// ------------------------------- Post/Update Methods ------------------------------------------
	  
	 /**
	 * Post Function that send the current GameContex and get a new one
	 */
	 function updateFunction(url) {
		 if(!stop) {
			 
			 if(actionHappen) {
				 url = actionURL;
				 actionHappen = false;
			 }
			 
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

/**
 * Controller that handle the logic of the playing Game
 */
towerdefenceApp.controller('LoginCtrl', function ($scope, $http, $routeParams) {
	
	$scope.playername = "Player";
	$scope.playerlife = 10;
	$scope.playermoney = 1000;
	$scope.playingfieldsize = 5;
	
	$scope.sendLogginInformation = function() {
		alert("Loggin Infos: " + 
				$scope.playername + "\n" +
				$scope.playerlife + "\n" +
				$scope.playermoney + "\n" +
				$scope.playingfieldsize
		);
	}
	
});
