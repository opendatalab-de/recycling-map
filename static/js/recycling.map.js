(function(rc, _, L) {
	"use strict";

	var defaultIcon = new L.Icon.Default();
	var disabledIcon = new L.Icon(_.extend({
		iconUrl: 'css/images/marker-icon-disabled.png'
	}, defaultIcon.options));

	var weekdayColors = {
		"Mo": "#BE3030",
		"Di": "#849E71",
		"Mi": "#DF8430",
		"Do": "#488C13",
		"Fr": "#4A6D87",
		"Sa": "#1B55C0",
		"So": "#E9B104"
	};

	rc.map = {
		markerMap: {},
		init: function() {
			rc.openingHours.init();
			L.Icon.Default.imagePath = 'css/images';

			var APIKey = "036a729cf53d4388a8ec345e1543ef53";
			var cloudmadeLayer = L.tileLayer('http://{s}.tile.cloudmade.com/' + APIKey + '/44094/256/{z}/{x}/{y}.png', {
				'maxZoom': 18
			});

			this.map = L.map('map', {
				maxZoom: 18,
				attributionControl: false,
				layers: [cloudmadeLayer]
			}).setView([49.15, 9.22], 11);

			new L.Control.Attribution({
				position: 'bottomleft'
			}).addTo(this.map);

			var gemeindenLayer = this.createGemeindenLayer();
			var recyclingLayer = this.createRecyclingLayer();
			recyclingLayer.addTo(this.map);
			gemeindenLayer.addTo(this.map);

			var baseMaps = {
				"Standard": cloudmadeLayer
			};

			var overlayMaps = {
				"Recycling-Höfe": recyclingLayer,
				"Abfahrtstermine": gemeindenLayer
			};

			L.control.layers(baseMaps, overlayMaps).addTo(this.map);

		},
		createRecyclingLayer: function() {
			var data = rc.filteredData(this.map.getCenter());
			var markers = [];
			for ( var index in data) {
				var amenity = data[index];
				var marker = new L.Marker(amenity.pos, {
					icon: rc.openingHours.isOpen(amenity.openingHours) ? defaultIcon : disabledIcon
				});
				marker.amenity = amenity;
				marker.bindPopup("<p><strong>" + amenity.keyValues.name + "</strong></p>" + rc.openingHours.today(amenity.openingHours));
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
				markers.push(marker);

				this.markerMap[amenity.id] = marker;
			}

			return L.layerGroup(markers);
		},
		findGemeindeGarbage: function(name) {
			for ( var x = 0; x < garbage.length; x++) {
				if (garbage[x].name == name) {
					return garbage[x];
				}
			}
		},
		createGemeindenLayer: function() {
			var that = this;
			return L.geoJson(gemeinden, {
				style: function(feature) {
					var garbage = that.findGemeindeGarbage(feature.properties.Name);
					if (garbage) {
						return {
							color: weekdayColors[garbage.rm],
							weight: 1
						};
					} else
						return {
							color: '#000000',
							stroke: false
						};
				},
				onEachFeature: function(feature, layer) {
					var garbage = that.findGemeindeGarbage(feature.properties.Name);
					var popup = "<h3>" + feature.properties.Name + "</h3>";
					if (garbage) {
						popup += "<div>Restmüll: <b>" + garbage.rm + "</b> Biomüll: <b>" + garbage.bm + "</b></div>";
						popup += "<div>Genaue Abfuhrtermine entnehmen Sie bitte Ihrem " + "<a href='http://www.landkreis-heilbronn.de/sixcms/media.php/103/"
								+ garbage.download + "'>" + "Müllabfuhrkalender</a>";
					}

					layer.bindPopup(popup);
				}
			});
		},
		getCenter: function() {
			return this.map.getCenter();
		},
		getZoom: function() {
			return this.map.getZoom();
		},
		getBounds: function() {
			return this.map.getBounds();
		},
		setCenter: function(latlng) {
			return this.map.setView(latlng, 14);
		},
		focusOnMarker: function(amenityId) {
			this.setCenter(this.markerMap[amenityId].getLatLng());
		},
		on: function(eventName, handler) {
			this.map.on(eventName, handler);
		}
	};
}(rc, _, L));
