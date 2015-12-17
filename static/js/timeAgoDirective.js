(function () {
    'use strict';

    angular.module('rc').directive('timeAgo', function () {
        return {
            restrict: 'E',
            scope: {
                openingHours: "=",
                name: '='
            },
            template: "<span class='opens-in' ng-if='isCurrentlyOpen'>Schließt {{opensIn}}</span>" +
            "<span class='opens-in' ng-if='!isCurrentlyOpen'>Öffnet {{opensIn}}</span>  ",
            link: function (scope) {
                var calculatedResult = rc.calculateOpeningHours(scope.openingHours);
                scope.isCurrentlyOpen = calculatedResult.isCurrentlyOpen;
                scope.opensIn = calculatedResult.opensIn;
            }
        }
    });
})();