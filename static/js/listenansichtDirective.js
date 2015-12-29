(function () {
    'use strict';

    angular.module('rc').directive('listenansicht', function ($http) {
        return {
            restrict: 'A',
            scope: true,
            link: function (scope, element) {
                element.on('click', function () {
                    $('.amenity-list').css("display", "inline");
                    $('nav').css("display", "inline");
                    $('map').css("display", "none");
                    $('.mapNavbarIcon').css("display", "none");
                    scope.$root.$broadcast("reposition");
                });
            }
        }
    });
})();