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
		}
	};
	
	var proxy = function(target) {
		return function() {
			var obj = {
				wI: this.openingHours
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
		}
	}; 
	
	/**
	 * HELPER
	 */
	var todayHelper = function(offer) {
		var interval = offer.getInterval(weekday.getCurrent());
		
		var tmplData = {
			tI: interval.tI,
			isClosedToday: model.isClosedToday(),
			offerId: offerId,
			note: offer.note,
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
	
	var templates = {};

	rc.serviceHours = {
		today: proxy(todayHelper),
		compactOffer: proxy(compactOfferHelper),
		weekMinutes: weekMinutes,
		weekday: weekday,
		modelHandler: modelHandler,
		init: function() {
			Handlebars.registerPartial('timeIntervals', Handlebars.compile(document.getElementById('timeintervals-template').innerHTML));
			templates.serviceHoursToday = Handlebars.compile(document.getElementById('service-hours-today-template').innerHTML);
			templates.compactOffer = Handlebars.compile(document.getElementById('compact-offer-template').innerHTML);
		}
	};
	
	Handlebars.registerHelper('serviceHoursToday', rc.serviceHours.today);
	Handlebars.registerHelper('compactOffer', rc.serviceHours.compactOffer);
}(rc, _, Handlebars));
