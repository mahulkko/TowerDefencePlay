towerdefenceApp.factory('gameContextFactory', function($http){
	return { 
		updateNewGameContext: function(callback){
			$http.get('/update').success(callback);
			console.log(callback);
		}
	};
});