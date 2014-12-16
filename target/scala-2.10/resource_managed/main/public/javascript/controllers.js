/**
 * Controller that handle the logic of a spezifig Site
 */
towerdefenceApp.controller('GameContextCtrl', function ($scope, $http, $routeParams, gameContextFactory){
	
	// Loads a gameContext Json Object from the Server
	gameContextFactory.updateNewGameContext(function(gameContextData) {
		$scope.gameContext = gameContextData;
        console.info(gameContextData);
      });
});
