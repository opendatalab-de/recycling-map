(function () {
    'use strict';

    var days = {
        montags: 1,
        dienstags: 2,
        mittwochs: 3,
        donnerstags: 4,
        freitags: 5,
        samstags: 6,
        sonntags: 7
    }

    var openingHours;

    function getCurrentMonth() {
        return (new Date()).getMonth() + 1;
    }

    //Returns the current distance of the red Timeline pointer of the div element
    function currentWidth(){
        var widthPerMin = 41/(24*60);
        var currentDay = moment().day();
        if(currentDay < 7)
            return widthPerMin * minutesSinceMid() + (widthPerMin * 1440 * (moment().day() - 1));
        else
            //TODO: Bessere Lösung überlegen, außerhalb des sichtbaren Bereichs zu schicken ist nicht das beste
            return 1000;
    }

    //Returns the time since midnight in minutes
    function minutesSinceMid(){
        return moment().diff(moment().startOf('day'), 'minutes');
    }

    function calcuateWidth(minutes){
         var widthPerMin = 41/(24*60);
         return widthPerMin * minutes;
    }

    //Iterate through all days of the opening hours
    function iterateOpeningHours(){
        var result = [];
        for (var property in openingHours) {
             if (openingHours.hasOwnProperty(property)) {
                   openingHours[property].forEach(function (Array) {
                       result += '<div class="timeline-durationBox" style="left:' + Math.round(calcuateWidth(Array.from) + (days[property] - 1) *  41) + 'px;width:' + Math.round(calcuateWidth(Array.to - Array.from)) + 'px;"></div>';
                       console.log(property);
                       console.log(days[property]);
                       console.log((calcuateWidth(Array.from) + (days[property] - 1) *  41));
                   });
             }
        }

        console.log(result);
        return result;
    }

    angular.module('rc').directive('timeline', function () {
        return {
            restrict: 'E',
            scope: {
                  openingHours: "=",
            },
            template: '<div class="timeline-container">' +
                       		'<div class="timeline-mo">Mo</div>' +
                       		'<div class="timeline-tu">Di</div>' +
                       		'<div class="timeline-tu-bar"></div>' +
                       		'<div class="timeline-we">Mi</div>' +
                       		'<div class="timeline-th">Do</div>' +
                       		'<div class="timeline-th-bar"></div>' +
                       		'<div class="timeline-fr">Fr</div>' +
                       		'<div class="timeline-sa">Sa</div>' +
                       		'<div class="timeline-sa-bar"></div>' +
                       		iterateOpeningHours() +
                       		'<div class="timeline-current" style="left:' + currentWidth() + 'px;"></div>' +
                       	'</div>',

            link: function (scope) {
                openingHours = scope.openingHours;
                iterateOpeningHours();
            }
        }
    });
})();