(function () {
    'use strict';


    angular.module('rc').directive('currentYear', function ($http) {
        return {
            restrict: 'A',
            scope:true,
            link: function (scope) {
                scope.currentYear = moment().year();
            }
        }
    });
})();