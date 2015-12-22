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

                //Icons über den Recycling Höfen
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


                //Unsicher ob ich das brauchen werde
                var weekdayColors = {
                     "Mo": "#BE3030",
                     "Di": "#849E71",
                     "Mi": "#DF8430",
                     "Do": "#488C13",
                     "Fr": "#4A6D87",
                     "Sa": "#1B55C0",
                     "So": "#E9B104"
                };

                function findGemeindeGarbage(name){
                    for ( var x = 0; x < garbage.length; x++) {
                    	if (garbage[x].name == name) {
                    		return garbage[x];
                    	}
                    }
                }

                //Das hier ist der zu übernehmende Code
                function createGemeindenLayer(){
                    return L.geoJson(gemeinden, {
                    style: function(feature) {
                    	var garbage = findGemeindeGarbage(feature.properties.Name);
                    	if (garbage) {
                    		return {
                    			color: weekdayColors[garbage.rm],
                    			weight: 1
                    		};
                    		} else
                    		    return {
                    				color: '#000000',
                    				stroke: false
                    				};
                    			},
                    			onEachFeature: function(feature, layer) {
                    			var garbage = findGemeindeGarbage(feature.properties.Name);
                    			var popup = "<p><strong>" + feature.properties.Name + "</p></strong>";
                    			if (garbage) {
                    				popup += "<p><a href='http://www.landkreis-heilbronn.de/sixcms/media.php/103/" + garbage.download
                    						+ "' class='btn btn-primary' target='_blank'><span class='glyphicon glyphicon-time'></span> " + "Müllabfuhrkalender</a></p>";
                    				}

                    				layer.bindPopup(popup);
                    			}
                    }).addTo(map);
                }

                scope.$on("locateMe", function(event, position){
                    console.log("TEST");
                    map.setView(new L.LatLng(position.latitude, position.longitude));
                });

                createGemeindenLayer();
            }
        }
    });
})();