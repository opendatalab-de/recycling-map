(function(rc, _, Handlebars) {
	'use strict';
	
	var offerHandler = {
		getInterval: function(weekday) {
			var interval = {};
			if(this.wI) {
				_.each(this.wI, function(currentInterval) {
					if(_.indexOf(currentInterval.wD, weekday) > -1) {
						interval = currentInterval;
					}
				});
			}
			return interval;
		},
		highlightWeekday: function(weekday) {
			var interval = this.getInterval(weekday);
			interval.highlight = true;
		},
		setPrintMicrodata: function(doPrint) {
			if(this.wI) {
				_.each(this.wI, function(currentInterval) {
					currentInterval.printMicrodata = doPrint;
				});
			}
		},
		isOffer: true,
		hasData: function() {
			return this.wI && this.wI.length > 0;
		},
		isClosedToday: function() {
			if(this.wI) {
				var interval = this.getInterval(weekday.getCurrent());
				return !interval || !interval.tI;
			}
			return true;
		}
	};
	
	var proxy = function(target) {
		return function() {
			var obj = {
				wI: this.openingHours ? this.openingHours : arguments[0]
			};
			arguments[0] = _.extend({}, obj, offerHandler);
			return target.apply(this, arguments);
		};
	};
	
	var weekday = {
		weekMinuteMap: [1440*6, 0, 1440, 1440*2, 1440*3, 1440*4, 1440*5],
		getCurrent: function() {
			return new Date().getDay();
		},
		forWeekMinute: function(weekMinute) {
			for(var key = 0; key < this.weekMinuteMap.length; key++) {
				var boundaryStart = this.weekMinuteMap[key];
				var boundaryEnd = this.weekMinuteMap[key] + 1440;
				if(weekMinute >= boundaryStart && weekMinute < boundaryEnd) {
					break;
				}
			}
			
			return key;
		}
	};
	
	var weekMinutes = {
		max: 24*60*7-1,
		getCurrent: function() {
			var date = new Date();
			var dayMultiplier = date.getDay() === 0 ? 6 : date.getDay() - 1;
			return (dayMultiplier * 1440) + (date.getHours() * 60) + date.getMinutes();
		},
		getDiff: function(from, to) {
			if(to >= from) {
				return to - from;
			} else {
				return this.max + 1 - from + to;
			}
		},
		getDaysBetween: function(from, to) {
			var fromDayIndex = weekday.forWeekMinute(from);
			var toDayIndex = weekday.forWeekMinute(to);
			
			if(fromDayIndex <= toDayIndex) {
				return toDayIndex - fromDayIndex; 
			} else {
				return 7 - fromDayIndex + toDayIndex;
			}
		},
		getNextWeekMinutes: function(offer, current) {
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
							if(interval.from === 0 && interval.to >= weekMinutes.max) {
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
				if(result.value > weekMinutes.max) {
					result = lowest.from.value <= lowest.to.value ? lowest.from : lowest.to;
				}
				return {
					'value': result.value,
					'label': result.label,
					'inInterval': (result.value === next.to.value || result.value === lowest.to.value),
					'nonstop': nonstop
				};
			}
		},
		isActive: function(offer) {
			var next = weekMinutes.getNextWeekMinutes(offer, weekMinutes.getCurrent());
			return next && next.inInterval ? true : false;
		}
	}; 
	
	/**
	 * HELPER
	 */
	var templates;
	var todayHelper = function(offer) {
		var interval = offer.getInterval(weekday.getCurrent());
		
		var tmplData = {
			tI: interval.tI,
			isClosedToday: offer.isClosedToday(),
			hasData: offer.hasData()
		};
		tmplData.hasDataForToday = (tmplData.tI || tmplData.isClosedToday) ? true : false;
		return templates.serviceHoursToday(tmplData);
	};
	
	var compactOfferHelper = function(offer) {
		offer.highlightWeekday(weekday.getCurrent());
		offer.setPrintMicrodata(true);
		
		var tmplData = _.extend({}, offer, { printMicrodata: true });
		return templates.compactOffer(tmplData);
	};
	
	rc.openingHours = {
		today: proxy(todayHelper),
		compactOffer: proxy(compactOfferHelper),
		isOpen: proxy(weekMinutes.isActive),
		offerHandler: offerHandler,
		weekMinutes: weekMinutes,
		weekday: weekday,
		init: function() {
			if(!templates) {
				Handlebars.registerPartial('timeIntervals', Handlebars.compile(document.getElementById('timeintervals-template').innerHTML));
				templates = {
					serviceHoursToday: Handlebars.compile(document.getElementById('service-hours-today-template').innerHTML),
					compactOffer: Handlebars.compile(document.getElementById('compact-offer-template').innerHTML)
				}
			}
		}
	};
	
	Handlebars.registerHelper('serviceHoursToday', rc.openingHours.today);
	Handlebars.registerHelper('compactOffer', rc.openingHours.compactOffer);
}(rc, _, Handlebars));
