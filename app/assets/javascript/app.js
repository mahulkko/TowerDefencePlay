var towerdefenceApp = angular.module('towerdefenceApp', ['ngRoute']);

towerdefenceApp.config( function($routeProvider) {
  $routeProvider.
    when('/', {
      templateUrl: '/public/html/test.html',
      controller: 'GameContextCtrl'
    }).
    when('/tower', {
        templateUrl: '/public/html/towerproperties.html',
        controller: 'GameContextCtrl'
      }).
    otherwise({
      redirectTo: '/'
    });
});