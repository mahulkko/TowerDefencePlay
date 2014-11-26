'use strict';

/* Services */

var phonecatServices = angular.module('phonecatServices', ['ngResource']);

phonecatServices.factory('BoatData', ['$resource',
  function($resource){
    return $resource('data/', {}, {query: {method:'GET', params:{phoneId:'phones'}, isArray:false}});
  }]);
