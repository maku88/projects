'use strict';

/* Controllers */

var firstAngularUIControllers = angular.module('firstAngularUIControllers', []);

firstAngularUIControllers.controller('TagListCtrl', ['$scope', '$http',
  function($scope, $http) {
      $scope.tags = [
          {'name': 'ABC',
              'id': '1'},
          {'name': 'DEF',
              'id': '2'},
          {'name': 'GHI',
              'id': '3'}
      ];
  }]);



firstAngularUIControllers.controller('TagDetailCtrl', ['$scope', '$routeParams',
  function($scope, $routeParams) {
    $scope.tagId = $routeParams.tagId;
  }]);

firstAngularUIControllers.controller('ActionListCtrl', ['$scope', '$http',
    function($scope, $http) {
        $scope.actions = [
            {'name': 'Akcja 1',
                'id': '1'},
            {'name': 'Akcja 2',
                'id': '2'},
            {'name': 'Akcja 3',
                'id': '3'}
        ];
    }]);



firstAngularUIControllers.controller('ActionDetailCtrl', ['$scope', '$routeParams',
    function($scope, $routeParams) {
        $scope.actionId = $routeParams.actionId;
    }]);


firstAngularUIControllers.controller('HomeCtrl', ['$scope',
    function($scope) {
        $scope.helloMsg = 'Witaj';
    }]);

