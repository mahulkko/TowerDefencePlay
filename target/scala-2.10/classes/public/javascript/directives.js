/**
 * Menu Directive
 */
towerdefenceApp.directive('menu', function(){
	return {
		restrict: 'E',
		transclude: true,
		templateUrl: '/html/menu.html'
	};
});

/**
 * Playingfield Directive
 */
towerdefenceApp.directive('playingfield', function(){
	return {
		restrict: 'E',
		transclude: true,
		templateUrl: '/html/playingfield.html'
	};
});

/**
 * Player Properties Directive
 */
towerdefenceApp.directive('player', function(){
	return {
		restrict: 'E',
		transclude: true,
		templateUrl: '/html/playerproperties.html'
	};
});