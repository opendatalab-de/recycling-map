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
			var current = rc.openingHours.weekMinutes.getCurrent();
			if(current <= (24*60*6-1)) {
				var left = Math.round(current * this.factor);
				return '<div class="timeline-current" style="left:' + left + 'px;"></div>';
			}
			return '';
		}
	};
	Handlebars.registerHelper('timelineWeeklyIntervals', rc.proxy(timelineHelper.weeklyIntervals, timelineHelper));
	Handlebars.registerHelper('timelineHighlightCurrent', rc.proxy(timelineHelper.currentTime, timelineHelper));
	
	var template;
	var render = function(center) {
		document.getElementsByClassName('amenity-list')[0].innerHTML = template({ amenities: rc.filteredData(rc.map.getCenter()) });
	};
	
	rc.list = {
		init: function() {
			rc.openingHours.init();
			template = Handlebars.compile(document.getElementById('list-template').innerHTML);
			
			if (L.Browser.mobile) {
				this.locateMe();
			}
			
			render();
			rc.map.on("moveend", function(event) {
				render(rc.map.getCenter());
			});
		},
		locateMe : function() {
			var onSuccessHandler = function(position) {
				render(new L.LatLng(position.coords.latitude, position.coords.longitude));
			};

			var onErrorHandler = function(error) {
				if (error.code == 1) {
					alert("Zugriff auf die Position nicht erlaubt.");
				} else if (error.code == 2) {
					alert("Position konnte vom Browser nicht ermittelt werden. "
							+ "Bitte prüfen Sie, ob Sie den Zugriff auf das GPS aktiviert haben.");
				} else if (error.core == 3) {
					alert("Der Browser hat nach 120 Sekunden keine Position geliefert.");
				}
			};
			
			navigator.geolocation.getCurrentPosition(onSuccessHandler, onErrorHandler, {
				timeout : 120000,
				maximumAge : 600000,
				enableHighAccuracy : true
			});			
		}
	};
}(rc));