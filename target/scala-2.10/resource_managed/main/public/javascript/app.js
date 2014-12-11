var towerdefence = angular.module('towerdefence', ['ngRoute']);

towerdefence.config( function($routeProvider) {
  $routeProvider.
    when('/', {
      templateUrl: '/public/html/test.html',
      controller: 'Ctrl'
    }).
    when('/tower', {
        templateUrl: '/public/html/towerproperties.html',
        controller: 'Ctrl'
      }).
    otherwise({
      redirectTo: '/'
    });
});