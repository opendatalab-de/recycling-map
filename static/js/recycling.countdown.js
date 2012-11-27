(function(oh, _, Handlebars) {
	'use strict';
	
	var template;
	var renderTemplate = function(data) {
		if(!template) {
			Handlebars.registerPartial('countdownMinutes', Handlebars.compile(document.getElementById('countdown-minutes-template').innerHTML));
			template = Handlebars.compile(document.getElementById('countdown-template').innerHTML);
		}
		return template(data);
	};
	
	var Countdown = function(offer, compact) {
		// private variables
		var that = this;
		
		// public functions
		this.getNextWeekMinutes = function(current) {
			var nonstop = false;
			var undefinedMinute = 24*60*60; 
			var next = {
				from: {
					label: '',
					value: undefinedMinute
				},
				to: {
					label: '',
					value: undefinedMinute
				},
				isLower: function(key, interval) {
					return interval[key] > current && interval[key] < this[key].value;
				},
				set: function(key, interval, timeInterval) {
					if(this.isLower(key, interval)) {
						this[key] = {
							label: timeInterval[key],
							value: interval[key]
						};
					}
					return this;
				}
			};
			var lowest = _.extend({}, next, {
				isLower: function(key, interval) {
					return interval[key] < this[key].value;
				}
			});
			
			_.each(offer.wI, function(weeklyInterval) {
				_.each(weeklyInterval.tI, function(timeInterval) {
					if(timeInterval.wM) {
						_.each(timeInterval.wM, function(interval) {
							interval = { from: interval[0], to: interval[1] };
							if(interval.from === 0 && interval.to >= oh.weekMinutes.max) {
								nonstop = true;
							}
							lowest.set('to', interval, timeInterval).set('from', interval, timeInterval);
							next.set('to', interval, timeInterval).set('from', interval, timeInterval);
						});
					}
				});
			});
			
			if(next.from.value === undefinedMinute && next.to.value === undefinedMinute) {
				return null;
			}
			else {
				var result = next.from.value <= next.to.value ? next.from : next.to;
				if(result.value > oh.weekMinutes.max) {
					result = lowest.from.value <= lowest.to.value ? lowest.from : lowest.to;
				}
				return {
					'value': result.value,
					'label': result.label,
					'inInterval': (result.value === next.to.value || result.value === lowest.to.value),
					'nonstop': nonstop
				};
			}
		};
		
		this.update = function() {
			var current = oh.weekMinutes.getCurrent();
			var next = that.getNextWeekMinutes(current);
			if(next === null) {
				return false;
			}
			
			var diff = oh.weekMinutes.getDiff(current, next.value);
			var nonstop = next.nonStop || diff > 60*24;
			var isActive = next.inInterval ? true : false;

			var hours = Math.floor(diff / 60);
			var minutes = Math.floor(diff - (hours * 60));
			var tmplData = {
				'compact': compact,
				'hours': hours,
				'minutes': minutes,
				'nonstop': nonstop,
				'isActive': isActive
			};
			
			if(!isActive) {
				var daysBetweenNext = oh.weekMinutes.getDaysBetween(current, next.value);
				tmplData = _.extend({
					'getsActiveToday': daysBetweenNext < 1,
					'getsActiveTomorrow': daysBetweenNext === 1,
					'getsActiveDayAfterTomorrow': daysBetweenNext === 2,
					'getsActiveInDays': daysBetweenNext,
					'getsActiveAt': next.label
				}, tmplData);
			}
			
			return renderTemplate(tmplData);
		};
	};
	
	rc.countdown = function(wI, compact) {
		var offer = _.extend({'wI': wI}, oh.offerHandler);
		if(offer.hasData()) {
			return new Countdown(offer, compact).update();
		}
	};
	Handlebars.registerHelper('countdown', rc.countdown);
}(rc.openingHours, _, Handlebars));
