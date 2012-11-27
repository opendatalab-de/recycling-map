(function(rc) {
	"use strict";
	
	rc.map = {
		init: function() {
			L.Icon.Default.imagePath = 'css/images';
			
			this.map = L.map('map', {
				maxZoom: 18,
				attributionControl: false
			}).setView([49.15, 9.22], 11);
			
			this.map.addLayer(new L.TileLayer('http://{s}.tile.openstreetmap.de/tiles/osmde/{z}/{x}/{y}.png', {
                maxZoom: 18
			}));
			
			new L.Control.Attribution({
				position: 'bottomleft'
			}).addTo(this.map);
			
			var data = rc.filteredData(this.map.getCenter());
			for (var index in data) {
				var amenity = data[index];
				var marker = new L.Marker(amenity.pos);
				marker.amenity = amenity;
				marker.on("mouseover", function() {
					var elem = document.getElementById(this.amenity.id);
					elem.classList.add("highlight");
				});
				marker.on("mouseout", function() {
					var elem = document.getElementById(this.amenity.id);
					elem.classList.remove("highlight");
				});
				marker.addTo(this.map);
			}
		},
		getCenter : function() {
			return this.map.getCenter();
		},
		on : function(eventName, handler) {
			this.map.on(eventName, handler);
		}
	};
}(rc));