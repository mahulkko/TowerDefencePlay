/**
 * Root Object that holds all Modules for this app
 */
var towerdefenceApp = angular.module('towerdefenceApp', ['ngRoute']);

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