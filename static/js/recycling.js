var rc = {};

(function(rc) {
	rc.proxy = function(fn, context) {
		return function() {
			return fn.apply(context, arguments);
		};
	};
	
	Handlebars.registerHelper('foreach', function(context, options) {
		var fn = options.fn;
		var ret = "";
		
		if (context && context.length > 0) {
			for (var i = 0, j = context.length; i < j; i++) {
				if(typeof context[i] === "string") {
					context[i] = new String(context[i]);
				}
				context[i].hasNext = (i+1 < j);
				context[i].isFirst = (i === 0);
				context[i].index = i;
				context[i].count = i+1;
				ret = ret + fn(context[i]);
			}
		}
		return ret;
	});
	
	"use strict";
}(rc));