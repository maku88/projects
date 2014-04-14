'use strict';

/* App Module */

var firstAngularUIapp = angular.module('firstAngularUI', [
  'ngRoute',
  'firstAngularUIControllers'
]);

firstAngularUIapp.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/home', {
        templateUrl: 'partials/Home.html',
        controller: 'HomeCtrl'
      }).
        when('/tags', {
            templateUrl: 'partials/tag-list.html',
            controller: 'TagListCtrl'
        }).
        when('/tags/:tagId', {
        templateUrl: 'partials/tag-detail.html',
        controller: 'TagDetailCtrl'
      }).
      when('/actions', {
            templateUrl: 'partials/action-list.html',
            controller: 'ActionListCtrl'
        }).
        when('/actions/:actionId', {
            templateUrl: 'partials/action-detail.html',
            controller: 'ActionDetailCtrl'
        }).
      otherwise({
        redirectTo: '/home'
      });
  }]);
