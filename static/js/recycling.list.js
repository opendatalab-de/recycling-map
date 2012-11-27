(function(rc) {
	"use strict";
	
	var timelineHelper = {
		factor: 288 / rc.weekMinutes.max,
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
			var current = rc.weekMinutes.getCurrent();
			if(current <= rc.weekMinutes.max) {
				var left = Math.round(current * this.factor);
				return '<div class="timeline-current" style="left:' + left + 'px;"></div>';
			}
			return '';
		}
	};
	Handlebars.registerHelper('timelineWeeklyIntervals', rc.proxy(timelineHelper.weeklyIntervals, timelineHelper));
	Handlebars.registerHelper('timelineHighlightCurrent', rc.proxy(timelineHelper.currentTime, timelineHelper));
	
	var filterData = function(data) {
		var filtered = [];
		for (var index in data) {
			if(data[index].openingHours && data[index].openingHours.length > 0) {
				filtered.push(data[index]);
			}
		}
		return filtered;
	};
	
	rc.list = {
		init: function() {
			var template = Handlebars.compile(document.getElementById('list-template').innerHTML);
			document.getElementsByClassName('amenity-list')[0].innerHTML = template({ amenities: filterData(rc.data) });
		}
	};
}(rc));