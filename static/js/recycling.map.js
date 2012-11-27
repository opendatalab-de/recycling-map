(function(rc) {
	"use strict";
	
	rc.map = {
		init: function() {
			L.Icon.Default.imagePath = 'css/images';
			
			var map = L.map('map', {
				maxZoom: 18
			}).setView([49.15, 9.22], 11);
			
			map.addLayer(new L.TileLayer('http://{s}.tile.openstreetmap.de/tiles/osmde/{z}/{x}/{y}.png', {
                maxZoom: 18
			}));
			
			var data = rc.filteredData();
			for (var index in data) {
				var amenity = data[index];
				L.marker([amenity.lat, amenity.lon]).addTo(map);
			}
		}
	};
}(rc));