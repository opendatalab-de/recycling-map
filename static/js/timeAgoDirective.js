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

    angular.module('rc').directive('timeAgo', function () {
        return {
            restrict: 'E',
            scope: {
                openingHours: "=",
                name: '='
            },
            template: "<span ng-if='isCurrentlyOpen'>Schließt {{opensIn}}</span>" +
            "<span ng-if='!isCurrentlyOpen'>Öffnet {{opensIn}}</span>  ",
            link: function (scope) {
                var currentMoment = moment().subtract(4, 'hours');
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
                if (scope.openingHours[currentDay]) {
                    var segmentsOfCurrentDay = scope.openingHours[currentDay];
                    var isCurrentlyOpen = false;
                    for(var i = 0; i < segmentsOfCurrentDay.length; i++) {
                        var segment = segmentsOfCurrentDay[i];
                        var fromMoment = convertDayMinute(segment.from, currentMoment);
                        var toMoment = convertDayMinute(segment.to, currentMoment);
                        if(fromMoment.isAfter(currentMoment)) {
                            momentInFuture = fromMoment;
                            break;
                        } else if(toMoment.isAfter(currentMoment)) {
                            momentInFuture = toMoment;
                            isCurrentlyOpen = true;
                            break;
                        }
                    }

                    scope.isCurrentlyOpen = isCurrentlyOpen;
                }
                if(!momentInFuture){
                    for(i=1; i<=6; i++) {
                        var nextMoment = moment(currentMoment).add(i, 'days');
                        var nextWeekday = getWeekday(nextMoment);
                        if (scope.openingHours[nextWeekday]) {
                            momentInFuture = scope.openingHours[nextWeekday][0].from;
                            momentInFuture = convertDayMinute(momentInFuture, nextMoment);
                            break;
                        }
                    }
                }
                scope.opensIn = currentMoment.to(momentInFuture);
            }
        }
    });
})();