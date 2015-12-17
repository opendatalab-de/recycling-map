(function () {
    'use strict';

    function convertDayMinute(dayMinute, momentOfDay) {
        var dayMinuteMoment = moment(momentOfDay);
        dayMinuteMoment.hour(Math.floor(dayMinute / 60));
        dayMinuteMoment.minute(dayMinute % 60);
        dayMinuteMoment.seconds(0);
        return dayMinuteMoment;
    }

    function getWeekday(currentMoment) {
        return currentMoment.format('dddd').toLowerCase() + 's';
    }

    function calculateOpeningHours(openingHours) {
        var result = {};
        var currentMoment = moment();
        var currentDay = getWeekday(currentMoment);

        // loop weekdays, starting with current day
        // * check for each week minute if it is in the future
        // * when this time is a "to" time (closing time), then display "gerade geöffnet, schließt in x Stunden"
        // * when this time is a "from" time (opening time), then display "öffnet in x Stunden"
        // * when no time is in the future, then:
        //   * add one day
        //   * when month changed then request next month
        //   * check if day is in object
        //   * -- no: loop to next day and start over
        //   * -- yes: take the first time

        var momentInFuture = null;
        if (openingHours[currentDay]) {
            var segmentsOfCurrentDay = openingHours[currentDay];
            var isCurrentlyOpen = false;
            for (var i = 0; i < segmentsOfCurrentDay.length; i++) {
                var segment = segmentsOfCurrentDay[i];
                var fromMoment = convertDayMinute(segment.from, currentMoment);
                var toMoment = convertDayMinute(segment.to, currentMoment);
                if (fromMoment.isAfter(currentMoment)) {
                    momentInFuture = fromMoment;
                    break;
                } else if (toMoment.isAfter(currentMoment)) {
                    momentInFuture = toMoment;
                    isCurrentlyOpen = true;
                    break;
                }
            }

            result.isCurrentlyOpen = isCurrentlyOpen;
        }
        if (!momentInFuture) {
            for (i = 1; i <= 6; i++) {
                var nextMoment = moment(currentMoment).add(i, 'days');
                var nextWeekday = getWeekday(nextMoment);
                if (openingHours[nextWeekday]) {
                    momentInFuture = openingHours[nextWeekday][0].from;
                    momentInFuture = convertDayMinute(momentInFuture, nextMoment);
                    break;
                }
            }
        }
        result.opensIn = currentMoment.to(momentInFuture);
        return result;
    }

    function getCurrentMonth() {
        return (new Date()).getMonth() + 1;
    }

    angular.module('rc').directive('map', function ($http, $compile) {
        return {
            restrict: 'E',
            link: function (scope, element) {
                var cloudmadeLayer = L.tileLayer('https://{s}.tiles.mapbox.com/v3/codeforheilbronn.i4fciif2/{z}/{x}/{y}.png', {
                    'maxZoom': 18
                });

                var map = L.map(element[0], {
                    maxZoom: 18,
                    attributionControl: false,
                    layers: [cloudmadeLayer]
                }).setView([49.15, 9.22], 11);

                var MarkerClosed = L.AwesomeMarkers.icon({
                    icon: 'trash',
                    markerColor: 'red'
                });
                var MarkerOpened = L.AwesomeMarkers.icon({
                    icon: 'trash',
                    markerColor: 'green'
                });

                $http.get('http://api.grundid.de/recycling?month=' + getCurrentMonth()).success(function (data) {
                    L.geoJson(data, {
                        pointToLayer: function (feature, latlng) {
                            var OpeningHours = calculateOpeningHours(feature.properties.openingHours)
                            var icon;
                            if (OpeningHours.isCurrentlyOpen) {
                                icon = MarkerOpened
                            }
                            else {
                                icon = MarkerClosed
                            }
                            var marker = new L.Marker(latlng, {
                                "icon": icon
                            });
                            return marker;
                        },

                        onEachFeature: function (feature, layer) {
                            var OpeningHours = calculateOpeningHours(feature.properties.openingHours)
                            var prefix;
                            if (OpeningHours.isCurrentlyOpen) {
                                prefix = "Schließt "
                            }
                            else {
                                prefix = "Öffnet "
                            }
                            layer.bindPopup("<p><strong>Recyclinghof " + feature.properties.name +
                                "</strong></p>" + feature.properties.address.street+
                            "<br>"+prefix+OpeningHours.opensIn);
                        }
                    }).addTo(map);
                });
            }
        }
    });
})();