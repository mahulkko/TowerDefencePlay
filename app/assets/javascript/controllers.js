towerdefenceApp.controller('GameContextCtrl', function ($scope, $http, $routeParams, gameContextFactory){
	
	gameContextFactory.updateNewGameContext(function(gameContextData) {
		$scope.gameContext = gameContextData;
        console.info(gameContextData);
      });
});