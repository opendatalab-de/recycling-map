'use strict';

var gc = {};

(function(angular, gc) {
	var appModule = angular.module('gcMain', [ 'ngRoute' ]);

	appModule.config(function($routeProvider) {

		$routeProvider.when('/community/:communityId', {
			templateUrl : 'community.html',
			controller : 'CommunityCtrl'
		});
		$routeProvider.otherwise({
			templateUrl : 'overview.html',
			controller : 'OverviewCtrl'
		});
	});

	appModule.controller('CommunityCtrl', [ "$scope", "$routeParams",
			function($scope, $routeParams) {
				var selectedCommunity = $routeParams['communityId'];
				angular.forEach(garbage, function(value, key) {
					if (selectedCommunity == value.community) {
						$scope.garbage = value;
					}
				});
			} ]);

	appModule.controller('OverviewCtrl', [ "$scope", "$rootScope",
			"$routeParams", function($scope, $rootScope, $routeParams) {
				$scope.garbage = garbage;
				$rootScope.title = garbage.community;
			} ]);

})(angular, gc);
