//Written by GityUpNow
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

    //Checks if it is Sunday
    function cursorVisible(){
        var currentDay = moment().day();
        if(currentDay > 0)
            return 'visible';
        else
            return 'hidden';
    }

    function getCurrentMonth() {
        return (new Date()).getMonth() + 1;
    }

    //Returns the current distance of the red Timeline pointer of the div element
    function currentWidth(){
        var widthPerMin = 41/(24*60);
        var currentDay = moment().day();
        if(currentDay < 7)
            return widthPerMin * minutesSinceMid() + (widthPerMin * 1440 * (moment().day() - 1));
    }

    //Returns the time since midnight in minutes
    function minutesSinceMid(){
        return moment().diff(moment().startOf('day'), 'minutes');
    }

    function calcuateWidth(minutes){
         var widthPerMin = 41/(24*60);
         return widthPerMin * minutes;
    }

    function timelineBox(left, width){
        this.left = left;
        this.width = width;
    }

    //Iterate through all days of the opening hours
    function iterateOpeningHours(){
        var temp = [];
        for (var property in openingHours) {
             if (openingHours.hasOwnProperty(property)) {
                   openingHours[property].forEach(function (Array) {
                        var tempBox = new timelineBox(Math.round(calcuateWidth(Array.from) + (days[property] - 1) *  41) ,Math.round(calcuateWidth(Array.to - Array.from)));
                        temp.push(tempBox);
                   });
             }
        }

        return temp;
    }

    angular.module('rc').directive('timeline', function ($compile) {
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
                       		'<div ng-repeat="x in result" class ="timeline-durationBox" style="left:{{x.left}}px;width:{{x.width}}px;"></div>' +
                       		'<div class="timeline-current" style="left:' + currentWidth() + 'px;visibility:' + cursorVisible() + '"></div>' +
                       	'</div>',

            link: function (scope) {
                openingHours = scope.openingHours;
                var temp = [];
                temp = iterateOpeningHours();
                scope.result = temp;
            }
        }
    });
})();