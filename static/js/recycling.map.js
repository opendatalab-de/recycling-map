(function(rc) {
	"use strict";
	
	rc.map = {
		init: function() {
			L.Icon.Default.imagePath = 'css/images';
			
			var map = L.map('map', {
				maxZoom: 18,
				attributionControl: false
			}).setView([49.15, 9.22], 11);
			
			map.addLayer(new L.TileLayer('http://{s}.tile.openstreetmap.de/tiles/osmde/{z}/{x}/{y}.png', {
                maxZoom: 18
			}));
			
			new L.Control.Attribution({
				position: 'bottomleft'
			}).addTo(map);
			
			var data = rc.filteredData();
			for (var index in data) {
				var amenity = data[index];
				new L.Marker([amenity.lat, amenity.lon]).addTo(map);
			}
		}
	};
}(rc));