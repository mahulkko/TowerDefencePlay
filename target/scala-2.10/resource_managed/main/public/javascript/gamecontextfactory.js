/**
 * Factory that handle all Request to the Server.
 */
towerdefenceApp.factory('gameContextFactory', function($http){
	return { 
		
		// GET JsonString with Game Context from the Server via /update URL
		updateNewGameContext: function(gameContext){
			$http.get('/update').success(gameContext);
			console.log(gameContext);
		}
	};
});