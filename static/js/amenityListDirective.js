(function () {
    'use strict';

    function getCurrentMonth() {
        return (new Date()).getMonth() + 1;
    }

    angular.module('rc').directive('amenityList', function ($http) {
        return {
            restrict: 'E',
            template: '<div class="amenity panel" ng-repeat="amenity in amenities.features" ng-class="{\'panel-default\':!amenity.openingHours.isCurrentlyOpen, \'panel-success\':amenity.openingHours.isCurrentlyOpen}">' +
            '<div class="panel-heading">' +
            '<h3 class="panel-title">{{amenity.properties.name}}</h3>' +
            '</div><div class="panel-body">' +
            '<ul class="compact-offer list-unstyled"><li ng-repeat="(day,segments) in amenity.properties.openingHours"><span class="uppercase">{{day | limitTo:2}}</span> von <span class="opening-time" ng-repeat="segment in segments"><span ng-if="$index !== 0"> und von </span>{{segment.from | time}} - {{segment.to | time}} Uhr</span></li>' +
            '</ul><time-ago opening-hours="amenity.properties.openingHours" name="amenity.properties.name"></time-ago></div></div>',
            link: function (scope) {
                $http.get('http://api.grundid.de/recycling?month=' + getCurrentMonth()).success(function(data) {
                    scope.amenities = data;
                    scope.amenities.features.forEach(function(amenity){
                        amenity.openingHours = rc.calculateOpeningHours(amenity.properties.openingHours);
                    })
                });
            }
        }
    });
})();