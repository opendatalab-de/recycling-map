(function () {
    'use strict';

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
                            var OpeningHours = rc.calculateOpeningHours(feature.properties.openingHours)
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
                            var OpeningHours = rc.calculateOpeningHours(feature.properties.openingHours)
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