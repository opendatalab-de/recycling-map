(function () {
    'use strict';

    angular.module('rc').directive('amenityList', function ($http) {
        return {
            restrict: 'E',
            template: '',
            link: function (scope) {

                function Broad(){
                    scope.$root.$broadcast("locateMe", "TEST");
                }

               scope.Broad = Broad;
            }
        }
    });
})();