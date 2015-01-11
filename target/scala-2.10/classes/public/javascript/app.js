/**
 * Root Object that holds all Modules for this app
 */
var towerdefenceApp = angular.module('towerdefenceApp', ['ngRoute']);

towerdefenceApp.run(function($rootScope) {
	$rootScope.login = false;
	$rootScope.playername = "Player";
	$rootScope.playeremail = "player@123.de";
	$rootScope.playerlife = 10;
	$rootScope.playermoney = 1000;
	$rootScope.playingfieldsize = 5;
 });

/**
 * Routing Table to get new Site behind the #
 */
towerdefenceApp.config( function($routeProvider) {

  $routeProvider.
    when('/', {
    	templateUrl: '/login.html',
        controller: 'LoginCtrl'
    }).
    when('/game', {
    	templateUrl: '/game.html',
        controller: 'GameContextCtrl'
      }).
    when('/test', {
        templateUrl: '/html/test.html',
        controller: 'GameContextCtrl'
      }).
    otherwise({
      redirectTo: '/game'
    });
});