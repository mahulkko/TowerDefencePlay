var towerdefence = angular.module('towerdefence', ['ngRoute']);

towerdefence.config(function($routeProvider) {
  $routeProvider.
    when('/', {
      templateUrl: '/index2',
      controller: 'CountryDetailCtrl'
    }).
    otherwise({
      redirectTo: '/'
    });
});