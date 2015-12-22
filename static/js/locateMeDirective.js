(function () {
    'use strict';

    angular.module('rc').directive('locateMe', function () {
        return {
            restrict: 'A',
            scope: true,
            link: function (scope, element) {

                element.on('click', function () {

                    var onSuccessHandler = function (position) {
                        scope.$root.$broadcast("locateMe", {
                            latitude: position.coords.latitude,
                            longitude: position.coords.longitude
                        });
                        scope.$apply();
                    };

                    var onErrorHandler = function (error) {
                        if (error.code == 1) {
                            alert("Zugriff auf die Position nicht erlaubt.");
                        } else if (error.code == 2) {
                            alert("Position konnte vom Browser nicht ermittelt werden. " + "Bitte prüfen Sie, ob Sie den Zugriff auf das GPS aktiviert haben.");
                        } else if (error.core == 3) {
                            alert("Der Browser hat nach 120 Sekunden keine Position geliefert.");
                        }
                    };

                    navigator.geolocation.getCurrentPosition(onSuccessHandler, onErrorHandler, {
                        timeout: 120000,
                        maximumAge: 600000
                    });
                });
            }
        }
    });
})();