(function () {
    'use strict';

    angular.module('rc').directive('kartenansicht', function ($http) {
        return {
            restrict: 'A',
            scope: true,
            link: function (scope, element) {
                element.on('click', function() {
                    $('.amenity-list').css("display", "none");
                    $('nav').css("display", "none");
                    $('map').css("right", "0px");
                    $('map').css("top", "0px");
                    $('map').css("display", "inline");
                    $('.mapNavbarIcon').css("display", "block");
                    scope.$root.$broadcast("reposition");
                });
            }
        }
    });
})();