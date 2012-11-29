(function(rc, _) {
	"use strict";
	
	var defaultIcon = new L.Icon.Default();
	var disabledIcon = new L.Icon(_.extend({iconUrl: 'css/images/marker-icon-disabled.png'}, defaultIcon.options));
	
	rc.map = {
		init: function() {
			rc.openingHours.init();
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
				var marker = new L.Marker(amenity.pos, {
					icon: rc.openingHours.isOpen(amenity.openingHours) ? defaultIcon : disabledIcon
				});
				marker.amenity = amenity;
				marker.bindPopup(rc.openingHours.today(amenity.openingHours));
				marker.on("mouseover", function() {
					this.openPopup();
					var elem = document.getElementById(this.amenity.id);
					elem.classList.add("highlight");
				});
				marker.on("mouseout", function() {
					this.closePopup();
					var elem = document.getElementById(this.amenity.id);
					elem.classList.remove("highlight");
				});
				marker.on("click", function() {
					rc.map.map.setView(this.amenity.pos, 14);
				});
				marker.addTo(this.map);
			}
		},
		getCenter : function() {
			return this.map.getCenter();
		},
		setCenter : function(latlng) {
			return this.map.setView(latlng, 14);
		},
		on : function(eventName, handler) {
			this.map.on(eventName, handler);
		}
	};
}(rc, _));