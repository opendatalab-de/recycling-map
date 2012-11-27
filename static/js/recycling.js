var rc = {};

(function(rc) {
	rc.weekMinutes = {
        max: 24*60*6-1,
        getCurrent: function() {
            var date = new Date();
            var dayMultiplier = date.getDay() === 0 ? 6 : date.getDay() - 1;
            return (dayMultiplier * 1440) + (date.getHours() * 60) + date.getMinutes();
        }
    };
	
	rc.proxy = function(fn, context) {
		return function() {
			return fn.apply(context, arguments);
		};
	};
	
	"use strict";
}(rc));