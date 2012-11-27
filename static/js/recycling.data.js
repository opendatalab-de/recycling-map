(function(rc) {
	"use strict";
	
	rc.data = [
		{
			name: 'Recyclinghof Heilbronn',
			openingHours: [{
			   "cW": [
			      {
			         "weekday":"Mo",
			         "range":false
			      },
			      {
			         "weekday":"So",
			         "range":true
			      }
			   ],
			   "wD": [
			      1,
			      2,
			      3,
			      4,
			      5,
			      6,
			      0
			   ],
			   "tI": [
			      {
			         "microdata":"Mo-Su 12:00-21:00",
			         "from":"12:00",
			         "to":"21:00",
			         "wM":[
			            [
			               720,
			               1260
			            ],
			            [
			               2160,
			               2700
			            ],
			            [
			               3600,
			               4140
			            ],
			            [
			               5040,
			               5580
			            ],
			            [
			               6480,
			               7020
			            ],
			            [
			               7920,
			               8460
			            ]
			         ]
			      }
			   ]
			}]
		}
	];
}(rc));