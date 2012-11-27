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
		
		this.update = function() {
			var current = oh.weekMinutes.getCurrent();
			var next = oh.weekMinutes.getNextWeekMinutes(offer, current);
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
