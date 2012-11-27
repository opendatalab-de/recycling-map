(function(rc) {
	"use strict";
	
	var timelineHelper = {
		factor: 288 / (24*60*6-1),
		weeklyIntervals: function(weeklyIntervals) {
			if(!weeklyIntervals) {
				return "";
			}
			
			var weekMinuteIntervals = [];
			for (var wIndex in weeklyIntervals) {
				var timeIntervals = weeklyIntervals[wIndex].tI;
				for (var tIndex in timeIntervals) {
					weekMinuteIntervals = weekMinuteIntervals.concat(timeIntervals[tIndex].wM);
				}
			}
			return this.weekMinuteIntervals(weekMinuteIntervals);
		},
		weekMinuteIntervals: function(weekMinuteIntervals) {
			var elements = "";
			for (var index in weekMinuteIntervals) {
				var left = Math.round(weekMinuteIntervals[index][0] * this.factor);
				var width = Math.round(weekMinuteIntervals[index][1] * this.factor) - left;
				elements += '<div style="left:' + left + 'px;width:' + width + 'px;"></div>';
			}
			return elements;
		},
		currentTime: function() {
			var current = rc.serviceHours.weekMinutes.getCurrent();
			if(current <= (24*60*6-1)) {
				var left = Math.round(current * this.factor);
				return '<div class="timeline-current" style="left:' + left + 'px;"></div>';
			}
			return '';
		}
	};
	Handlebars.registerHelper('timelineWeeklyIntervals', rc.proxy(timelineHelper.weeklyIntervals, timelineHelper));
	Handlebars.registerHelper('timelineHighlightCurrent', rc.proxy(timelineHelper.currentTime, timelineHelper));
	
	rc.list = {
		init: function() {
			rc.serviceHours.init();
			
			var template = Handlebars.compile(document.getElementById('list-template').innerHTML);
			document.getElementsByClassName('amenity-list')[0].innerHTML = template({ amenities: rc.filteredData() });
			
			rc.map.on("moveend", function(event) {
				document.getElementsByClassName('amenity-list')[0].innerHTML = template({ amenities: rc.filteredData(rc.map.getCenter()) });
			});
		}
	};
}(rc));