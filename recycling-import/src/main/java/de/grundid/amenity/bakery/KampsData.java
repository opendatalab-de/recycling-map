package de.grundid.amenity.bakery;

import java.util.ArrayList;
import java.util.List;

public class KampsData {

	private List<Address> shops = new ArrayList<Address>();

	public KampsData() {
		shops.add(new Address(1, 53.55293, 9.9342, new Contact(" Scheel-Plessen-Str. 17", "22765", "Hamburg",
				"040 29812890", "Hamburg-Altona Bahnhof "), new OpeningHours("06:00", "22:00", "06:00", "22:00",
				"06:00", "22:00", "06:00", "22:00", "06:00", "22:00", "06:00", "22:00", "06:00", "22:00"),
				new AboutShop(5, 0)));
		shops.add(new Address(3, 53.6849095, 9.9844738, new Contact("Berliner Allee 38-44a", "22850", "Norderstedt",
				"040 5235643", "Herold-Center"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"06:30", "20:00", "08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(5, 2)));
		shops.add(new Address(4, 48.80136, 9.21916, new Contact("Bahnhofstraße 30", "70372", "Stuttgart-Bad Cannstatt",
				"0711 55049416", "Bahnhof "), new OpeningHours("05:00", "22:00", "05:00", "22:00", "05:00", "22:00",
				"05:00", "22:00", "05:00", "22:00", "06:00", "22:00", "07:00", "22:00"), new AboutShop(5, 0)));
		shops.add(new Address(5, 48.7827027, 9.182863, new Contact("Arnulf-Klett-Platz 2/ Kopfbahnsteighalle ",
				"70173", "Stuttgart", "0711 1872112", ""), new OpeningHours("04:30", "21:00", "04:30", "21:00",
				"04:30", "21:00", "04:30", "21:00", "04:30", "21:00", "05:30", "21:00", "07:30", "18:00"),
				new AboutShop(5, 1)));
		shops.add(new Address(6, 49.48757, 8.46813, new Contact(" P2, 12", "68161", "Mannheim", "0621 1256969", ""),
				new OpeningHours("05:30", "20:00", "05:30", "20:00", "05:30", "20:00", "05:30", "20:00", "05:30",
						"20:00", "05:30", "19:00", "", ""), new AboutShop(5, 1)));
		shops.add(new Address(7, 49.00963, 8.40066, new Contact(" Kaiserstr. 165", "76133", "Karlsruhe",
				"0721 9204151", ""), new OpeningHours("06:00", "20:00:", "06:00", "20:00:", "06:00", "20:00:", "06:00",
				"20:00:", "06:00", "20:00:", "06:00", "20:00", "", ""), new AboutShop(5, 0)));
		shops.add(new Address(8, 49.00949, 8.40948, new Contact(" Kronenplatz / Kaiserstr. 24", "76133", "Karlsruhe",
				"0721 9377684", ""), new OpeningHours("05:30", "20:00", "05:30", "20:00", "05:30", "20:00", "05:30",
				"20:00", "05:30", "20:00", "05:30", "18:00", "08:30", "11:30"), new AboutShop(5, 3)));
		shops.add(new Address(9, 49.14076, 9.21698, new Contact(" Deutschhofstraße 19", "74072", "Heilbronn",
				"07131 2059692", "Stadtgalerie Heilbronn "), new OpeningHours("08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(5, 0)));
		shops.add(new Address(10, 50.1133, 8.68047, new Contact(" Liebfrauenstr. 5", "60313", "Frankfurt am Main",
				"069 21655781", ""), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00",
				"20:00", "08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(5, 1)));
		shops.add(new Address(11, 48.92089, 9.1489, new Contact(" Heinkelstr. 1-11", "71634", "Ludwigsburg",
				"07141 918262", "Breuningerland Einkaufzentrum "), new OpeningHours("08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "22:00", "08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(5, 3)));
		shops.add(new Address(12, 50.0726721, 8.2570237, new Contact(" Bahnhofsvorplatz 3", "65189", "Wiesbaden",
				"0611 3085951", "Lilien-Carré Shoppingcenter "), new OpeningHours("07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(5, 0)));
		shops.add(new Address(13, 51.30251, 9.48165, new Contact(" Frankfurter Strasse 114-120", "34121", "Kassel",
				"0561 2076502", "Edeka Markt"), new OpeningHours("06:00", "24:00", "06:00", "24:00", "06:00", "24:00",
				"06:00", "24:00", "06:00", "24:00", "06:00", "24:00", "07:00", "18:00"), new AboutShop(5, 3)));
		shops.add(new Address(14, 52.50763, 13.33306, new Contact(" Hardenbergplatz 9-11", "10623", "Berlin",
				"030 315914-0", "Berlin Zoologischer Garten "), new OpeningHours("04:00", "01:00", "04:00", "01:00",
				"04:00", "01:00", "04:00", "01:00", "04:00", "01:00", "04:00", "01:00", "04:00", "01:00"),
				new AboutShop(5, 3)));
		shops.add(new Address(16, 51.23133, 6.76053, new Contact(" Luegallee 3", "40545", "Düsseldorf",
				"0211 17185561", "Freestander "), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "18:30", "08:00", "18:00", "08:00", "18:00"), new AboutShop(5, 3)));
		shops.add(new Address(17, 49.89057, 8.606544, new Contact(" Gutenbergstraße 3-15", "64331", "Weiterstadt",
				"06151 9069957", "LOOP Einkaufzentrum "), new OpeningHours("10:00", "20:00", "10:00", "20:00", "10:00",
				"20:00", "10:00", "20:00", "10:00", "21:00", "10:00", "21:00", "", ""), new AboutShop(5, 3)));
		shops.add(new Address(18, 49.99423, 8.27688, new Contact(" Holzhofstraße 5", "55116", "Mainz", "06131 1432037",
				""), new OpeningHours("06:00", "19:00", "06:00", "19:00", "06:00", "19:00", "06:00", "19:00", "06:00",
				"19:00", "08:00", "14:00", "09:00", "17:00"), new AboutShop(5, 3)));
		shops.add(new Address(19, 50.00041, 8.2722, new Contact(" Schusterstraße. 26 / 28", "55116", "Mainz",
				"06131 210730", ""), new OpeningHours("07:00", "19:00", "07:00", "19:00", "07:00", "19:00", "07:00",
				"19:00", "07:00", "19:00", "07:00", "18:00", "", ""), new AboutShop(5, 3)));
		shops.add(new Address(20, 50.04695, 8.21657, new Contact(" Äppelallee 69", "65203", "Wiesbaden",
				"0611 5324943", "Äppelallee-Center "), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00",
				"20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(5, 3)));
		shops.add(new Address(21, 50.224974, 8.6211991, new Contact(" Louisen Straße. 86 - 90", "61348", "Bad Homburg",
				"06172 1710097", "Louisen-Shoppingcenter "), new OpeningHours("08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "09:00", "14:00"),
				new AboutShop(5, 0)));
		shops.add(new Address(22, 50.06016, 8.25809, new Contact(" Hasengartenstraße 25", "65189", "Wiesbaden",
				"0611 721633", "HIT Markt "), new OpeningHours("08:00", "22:00", "08:00", "22:00", "08:00", "22:00",
				"08:00", "22:00", "08:00", "22:00", "08:00", "22:00", "", ""), new AboutShop(5, 0)));
		shops.add(new Address(23, 51.3134, 9.4463, new Contact(" Wilhelmshöher Allee. 253", "34131", "Kassel",
				"0561 3103208", "HauptBahnhof "), new OpeningHours("05:00", "22:00", "05:00", "22:00", "05:00",
				"22:00", "05:00", "22:00", "05:00", "22:00", "06:00", "22:00", "06:00", "22:00"), new AboutShop(5, 3)));
		shops.add(new Address(24, 48.13393, 11.56835, new Contact(" Sendlingerstr. 47", "80331", "München",
				"089 23077955", ""), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00",
				"20:00", "07:00", "20:00", "08:00", "18:00", "09:00", "12:00"), new AboutShop(5, 3)));
		shops.add(new Address(25, 51.05024, 13.73612, new Contact(" Altmarkt 25", "01067", "Dresden", "0351 48484914",
				"Altmarkt - Galerie Dresden "), new OpeningHours("06:00", "20:00", "06:00", "20:00", "06:00", "20:00",
				"06:00", "20:00", "06:00", "20:00", "06:00", "20:00", "", ""), new AboutShop(5, 3)));
		shops.add(new Address(26, 51.51712, 7.45989, new Contact(" Königswall 15", "44137", "Dortmund",
				"0231 95256202", "Dortmund-Hauptbahnhof "), new OpeningHours("05:00", "21:00", "05:00", "21:00",
				"05:00", "21:00", "05:00", "21:00", "05:00", "21:00", "05:00", "21:00", "05:00", "21:00"),
				new AboutShop(5, 3)));
		shops.add(new Address(27, 53.61191, 10.07566, new Contact(" Bramfelder Chaussee 230", "22177", "Hamburg",
				"040 63648025", "Marktplatz-Galerie Bramfeld "), new OpeningHours("07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(5, 3)));
		shops.add(new Address(28, 50.94188, 6.95577, new Contact(" Marzellenstraße 1", "50667", "Köln", "0221 1394432",
				""), new OpeningHours("06:30", "20:00", "06:30", "20:00", "06:30", "20:00", "06:30", "20:00", "06:30",
				"20:00", "08:00", "18:00", "09:00", "15:00"), new AboutShop(5, 3)));
		shops.add(new Address(29, 52.50622, 13.33316, new Contact(" Hardenbergplatz 2", "10623", "Berlin",
				"03023005137", "Bikini-Haus"), new OpeningHours("06:00", "20:00", "06:00", "20:00", "06:00", "20:00",
				"06:00", "20:00", "06:00", "20:00", "06:00", "20:00", "07:00", "20:30"), new AboutShop(5, 0)));
		shops.add(new Address(30, 51.3038374, 12.165469, new Contact(" Merseburger Str. 17a", "06237",
				"Leipzig Günthersdorf", "034638-36105", "Nova Eventis Einkaufszentrum "), new OpeningHours("10:00",
				"20:00", "10:00", "20:00", "10:00", "20:00", "10:00", "20:00", "10:00", "22:00", "10:00", "20:00", "",
				""), new AboutShop(5, 3)));
		shops.add(new Address(31, 52.52269, 13.40389, new Contact("  An der Spandauer Brücke 10", "10178", "Berlin",
				"030 23456883", "Hackesches Quartier "), new OpeningHours("05:30", "20:00", "05:30", "20:00", "05:30",
				"20:00", "05:30", "20:00", "05:30", "20:00", "05:30", "19:00", "07:00", "18:00"), new AboutShop(5, 0)));
		shops.add(new Address(32, 49.41031, 8.69627, new Contact(" Hauptstraße 35", "69117", "Heidelberg",
				"06221 4332359", ""), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00",
				"20:00", "07:00", "20:00", "07:00", "19:00", "", ""), new AboutShop(5, 1)));
		shops.add(new Address(33, 50.12453, 8.70494, new Contact(" Berger Straße 162", "60385", "Frankfurt am Main",
				"069 40353770", ""), new OpeningHours("06:00", "19:00", "06:00", "19:00", "06:00", "19:00", "06:00",
				"19:00", "06:00", "19:00", "06:00", "18:00", "08:00", "14:00"), new AboutShop(5, 3)));
		shops.add(new Address(34, 50.10786, 8.66106, new Contact(" Düsseldorfer Str. 1-7/Poststr. 2-4", "60329",
				"Frankfurt am Main", "069 24007680", ""), new OpeningHours("06:00", "19:00", "06:00", "19:00", "06:00",
				"19:00", "06:00", "19:00", "06:00", "19:00", "06:00", "13:00", "", ""), new AboutShop(5, 3)));
		shops.add(new Address(35, 50.041381, 8.5800547, new Contact("Hugo-Eckener-Ring 1", "60549",
				"Frankfurt am Main", "0157 83048885", "Flughafen Terminal 1 Ankunft B"), new OpeningHours("06:00",
				"22:00", "06:00", "22:00", "06:00", "22:00", "06:00", "22:00", "06:00", "22:00", "06:00", "22:00",
				"06:00", "22:00"), new AboutShop(5, 3)));
		shops.add(new Address(36, 49.48565, 8.4472, new Contact("Im Zollhof 4", "67061", "Ludwigshafen",
				"0621 54543900", "Rhein-Galerie Ludwigshafen"), new OpeningHours("08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(5, 3)));
		shops.add(new Address(37, 53.0547, 8.78566, new Contact(" Flughafenallee.18-21", "28199", "Bremen",
				"0421 555866", "Bremen-Flughafen"), new OpeningHours("03:00", "01:00", "03:00", "01:00", "03:00",
				"01:00", "03:00", "01:00", "03:00", "01:00", "03:00", "01:00", "03:00", "01:00"), new AboutShop(5, 3)));
		shops.add(new Address(38, 53.08317, 8.81264, new Contact(" Bahnhofsplatz 15", "28195", "Bremen",
				"0421 1632946", "Bremen-Hauptbahnhof "), new OpeningHours("04:30", "22:00", "04:30", "22:00", "04:30",
				"22:00", "04:30", "22:00", "04:30", "22:00", "04:30", "22:00", "04:30", "22:00"), new AboutShop(5, 3)));
		shops.add(new Address(39, 53.57189, 10.02906, new Contact(" Hamburger Strasse 19-47", "22083", "Hamburg",
				"040 22693984", "Hamburger Meile Shoppingcenter "), new OpeningHours("08:00", "20:00", "08:00",
				"20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "", ""),
				new AboutShop(5, 0)));
		shops.add(new Address(40, 49.21291309999999, 9.47239970, new Contact(" Sichhauswiesen / Austr. 5", "74613",
				"Öhringen", "07941 61228", "REWE Markt "), new OpeningHours("08:00", "22:00", "08:00", "22:00",
				"08:00", "22:00", "08:00", "22:00", "08:00", "22:00", "08:00", "22:00", "", ""), new AboutShop(5, 3)));
		shops.add(new Address(41, 50.03038, 8.70391, new Contact(" Robert-Bosch-Straße 15", "63303", "Dreieich",
				"06103 2029299", "Real Markt "), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(5, 2)));
		shops.add(new Address(42, 52.56338, 13.32819, new Contact(" Kurt-Schumacher-Platz 1-15", "13405", "Berlin",
				"030 49871063", "Der Clou-Shoppingcenter "), new OpeningHours("07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(5, 3)));
		shops.add(new Address(43, 49.00975, 8.39606, new Contact(" Europaplatz / Kaiserstr. 142/144", "76133",
				"Karlsruhe", "0721 20047", ""), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(5, 3)));
		shops.add(new Address(44, 49.45122, 11.07326, new Contact(" Färberstr. 2", "90402", "Nürnberg", "0911 2004947",
				""), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00",
				"20:00", "07:00", "20:00", "", ""), new AboutShop(5, 0)));
		shops.add(new Address(45, 49.41147, 8.70368, new Contact(" Hauptstr. 109", "69117", "Heidelberg",
				"06221 165966", ""), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00",
				"20:00", "07:00", "20:00", "08:00", "20:00", "09:00", "12:00"), new AboutShop(5, 1)));
		shops.add(new Address(46, 50.02584, 8.58478, new Contact("Frankfurt-Cargo City ", "60549", "Frankfurt am Main",
				"069 69715848", "Flughafen Terminal 1 Abflug A "), new OpeningHours("05:30:", "22:00:", "05:30",
				"22:00", "05:30", "22:00", "05:30", "22:00", "05:30", "22:00", "05:30", "22:00", "05:30", "22:00"),
				new AboutShop(5, 3)));
		shops.add(new Address(47, 52.5517268, 13.4123013, new Contact("Schönhauser Allee Arcaden", "10439", "Berlin",
				"030 44652424", "Schönhauser Allee Arcaden "), new OpeningHours("07:00", "21:00", "07:00", "21:00",
				"07:00", "21:00", "07:00", "21:00", "07:00", "21:00", "07:00", "21:00", "", ""), new AboutShop(5, 1)));
		shops.add(new Address(48, 48.78216, 9.18213, new Contact("Königstr. 1 b", "70173", "Stuttgart", "0711 221371",
				""), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00",
				"20:00", "08:00", "20:00", "", ""), new AboutShop(5, 0)));
		shops.add(new Address(49, 48.89155, 8.69736, new Contact(" Westliche Karl-Friedrich-Straße 45", "75172",
				"Pforzheim", "07231 316606", ""), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00",
				"20:00", "07:00", "20:00", "07:00", "20:00", "07:30", "18:00", "", ""), new AboutShop(5, 0)));
		shops.add(new Address(50, 52.43005, 13.45761, new Contact("Johannisthaler Chaussee 295a", "12351", "Berlin",
				"030 6022094", "Gropius-Passagen "), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00",
				"20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "24:00", "", ""), new AboutShop(5, 1)));
		shops.add(new Address(51, 52.5026, 13.34158, new Contact(" Tauentzienstr. 2 ", "10789", "Berlin",
				"030 21473133", ""), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00",
				"20:00", "07:00", "20:00", "07:00", "20:00", "08:00", "17:00"), new AboutShop(5, 0)));
		shops.add(new Address(52, 52.5119, 13.38969, new Contact(" Friedrichstr. 186 ", "10117", "Berlin",
				"030 20452817", ""), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00",
				"20:00", "07:00", "20:00", "07:00", "20:00", "08:00", "18:00"), new AboutShop(5, 0)));
		shops.add(new Address(54, 52.525219, 13.3683981, new Contact(" Europaplatz 1", "10557", "Berlin",
				"030 20077213", "Berlin-Hauptbahnhof "), new OpeningHours("04:30", "23:00", "04:30", "23:00", "04:30",
				"23:00", "04:30", "23:00", "04:30", "23:00", "05:30", "24:00", "05:30", "24:00"), new AboutShop(5, 0)));
		shops.add(new Address(55, 52.522629, 13.402038, new Contact(" Hackescher Markt 0, Bogen 15", "10119", "Berlin",
				"030 24045936", "Berlin S-Bahnhof "), new OpeningHours("05:30", "20:00", "05:30", "20:00", "05:30",
				"20:00", "05:30", "20:00", "05:30", "20:00", "05:30", "19:00", "07:00", "18:00"), new AboutShop(5, 0)));
		shops.add(new Address(56, 52.50657, 13.39076, new Contact("Friedrichstr. 41 / Rudi-Dutschke-Straße 29/27",
				"10969", "Berlin", "030 25291617", ""), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00",
				"20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "18:00", "07:00", "18:00"), new AboutShop(5, 0)));
		shops.add(new Address(57, 51.5928, 7.66319, new Contact(" Willy-Brandt-Platz 10 ", "59174", "Kamen",
				"02307 15199", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "14:00", "08:00", "13:00"), new AboutShop(3, 0)));
		shops.add(new Address(58, 51.5081979, 7.4416173, new Contact("Hauptbahnhof", "44137", "Dortmund",
				"0231 1206925", "Bahnhof"), new OpeningHours("06:00", "21:00", "06:00", "21:00", "06:00", "21:00",
				"06:00", "21:00", "06:00", "21:00", "06:00", "21:00", "06:00", "21:00"), new AboutShop(3, 1)));
		shops.add(new Address(59, 51.4918, 7.55589, new Contact(" Aplerbecker Marktplatz 2 ", "44287", "Dortmund",
				"0231 445696", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "14:00", "08:00", "12:00"), new AboutShop(3, 0)));
		shops.add(new Address(60, 51.372904, 7.6927247, new Contact(" Bahnhofsplatz 2 ", "58644", "Iserlohn",
				"02371 12330", "Hauptbahnhof "), new OpeningHours("06:00", "19:00", "06:00", "19:00", "06:00", "19:00",
				"06:00", "19:00", "06:00", "19:00", "06:00", "18:00", "06:00", "18:00"), new AboutShop(3, 1)));
		shops.add(new Address(61, 51.55359, 7.91401, new Contact(" Walburgisstr. 46 ", "59457", "Werl", "02922 84778",
				""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "16:00", "07:00", "16:00"), new AboutShop(3, 0)));
		shops.add(new Address(62, 51.53629, 7.69125,
				new Contact(" Bahnhofstr.23 ", "59423", "Unna", "02303 15825", ""), new OpeningHours("07:00", "19:00",
						"07:00", "19:00", "07:00", "19:00", "07:00", "19:00", "07:00", "19:00", "07:00", "16:00", "",
						""), new AboutShop(3, 1)));
		shops.add(new Address(63, 51.3743809, 7.6978338, new Contact(" Alter Rathausplatz 12 ", "58636", "Iserlohn",
				"02371 12469", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "16:00", "07:00", "16:00"), new AboutShop(3, 1)));
		shops.add(new Address(64, 51.51455, 7.46947, new Contact(" Ostenhellweg 26 ", "44135", "Dortmund",
				"0231 1385281", ""), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00",
				"20:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(3, 3)));
		shops.add(new Address(65, 51.48952, 7.50148, new Contact(" Hermannstr.49 ", "44263", "Dortmund", "0231 416623",
				""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "07:00", "14:00", "08:00", "11:00"), new AboutShop(3, 0)));
		shops.add(new Address(66, 51.4412459, 7.5679901, new Contact(" Hüsingstr.9 ", "58239", "Schwerte",
				"02304 16261", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "14:00", "", ""), new AboutShop(3, 0)));
		shops.add(new Address(67, 51.5160964, 7.4598493, new Contact(" Königswall ", "44137", "Dortmund",
				"0231 1206926", "Hauptbahnhof "), new OpeningHours("05:00", "21:00", "05:00", "21:00", "05:00",
				"21:00", "05:00", "21:00", "05:00", "21:00", "05:45", "20:00", "08:00", "20:00"), new AboutShop(3, 2)));
		shops.add(new Address(68, 51.51424, 7.46093, new Contact(" Westenhellweg 69 ", "44135", "Dortmund",
				"0231 144051", ""), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00",
				"20:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(69, 51.43758, 7.79538,
				new Contact(" Hauptstr.37 ", "58706", "Menden", "02373 15449", ""), new OpeningHours("06:30", "18:30",
						"06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "07:00", "15:00",
						"08:00", "16:00"), new AboutShop(3, 0)));
		shops.add(new Address(70, 51.4879773, 7.3855172, new Contact(" Wulfshofstr.6-8/Indupark ", "44149", "Dortmund",
				"0231 7265515", "REAL Markt "), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(71, 51.37384, 7.70186, new Contact(" Wermingser Str.46 ", "58636", "Iserlohn",
				"02371 20394", ""), new OpeningHours("06:30", "18:00", "06:30", "18:00", "06:30", "18:00", "06:30",
				"18:00", "06:30", "18:00", "06:30", "16:00", "06:30", "14:00"), new AboutShop(3, 0)));
		shops.add(new Address(73, 51.5235495, 7.5466529, new Contact(" Brackeler Hellweg 135 a ", "44309", "Dortmund",
				"0231 7225692", ""), new OpeningHours("06:00", "19:00", "06:00", "19:00", "06:00", "19:00", "06:00",
				"19:00", "06:00", "19:00", "06:00", "16:00", "08:00", "17:00"), new AboutShop(3, 0)));
		shops.add(new Address(74, 51.47623, 7.44402, new Contact(" Harkortstr.25-27 ", "44225", "Dortmund",
				"0231 718662", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "14:00", "08:00", "18:00"), new AboutShop(3, 0)));
		shops.add(new Address(75, 51.5160964, 7.4598493, new Contact(" Königswall ", "44137", "Dortmund",
				"0231 162426", "Hauptbahnhof "), new OpeningHours("05:00", "21:00", "05:00", "21:00", "05:00", "21:00",
				"05:00", "21:00", "05:00", "21:00", "05:00", "20:00", "05:00", "20:00"), new AboutShop(3, 2)));
		shops.add(new Address(76, 51.76332, 7.89421, new Contact(" Oststr. 26 ", "59227", "Ahlen", "02382 4234", ""),
				new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
						"18:30", "07:00", "14:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(77, 51.4424773, 7.5606516, new Contact(" Bahnhofstr. 35 ", "58239", "Schwerte",
				"02304 17444", "Hauptbahnhof "), new OpeningHours("06:00", "19:00", "06:00", "19:00", "06:00", "19:00",
				"06:00", "19:00", "06:00", "19:00", "06:00", "17:00", "07:30", "17:00"), new AboutShop(3, 1)));
		shops.add(new Address(78, 51.67979, 7.81237, new Contact(" Bahnhofstr. 4 ", "59065", "Hamm", "02381 13852",
				"Kaufhof "), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "18:00", "", ""), new AboutShop(3, 0)));
		shops.add(new Address(79, 51.51202, 7.46411,
				new Contact(" Wißstr. 9 ", "44137", "Dortmund", "0231 1897935", ""), new OpeningHours("07:00", "18:30",
						"07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00", "18:00", "",
						""), new AboutShop(3, 1)));
		shops.add(new Address(80, 51.49767, 7.53824, new Contact(" Markscheider Str. 1 ", "44269", "Dortmund",
				"0231 458424", "REWE Markt "), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(81, 51.43604, 7.79425, new Contact(" Walramstr. 5 ", "58706", "Menden", "02373 2009",
				"REWE Markt "), new OpeningHours("07:30", "20:00", "07:30", "20:00", "07:30", "20:00", "07:30",
				"20:00", "07:30", "20:00", "07:30", "18:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(82, 51.52449, 7.51075, new Contact(" Hannöversche Str.52a ", "44143", "Dortmund",
				"0231 5313585", "Hellweg Baumarkt "), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00",
				"20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "16:00", "", ""), new AboutShop(3, 0)));
		shops.add(new Address(83, 51.57326, 8.10585,
				new Contact(" Brüderstr.1 ", "59494", "Soest", "02921 943051", ""), new OpeningHours("07:00", "18:30",
						"07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00", "16:00",
						"07:30", "17:00"), new AboutShop(3, 0)));
		shops.add(new Address(84, 51.4165104, 7.8294056, new Contact(" Lendringser Hauptstr. 57 ", "58710",
				"Menden-Lendringsen", "02373 984131", "REWE Markt "), new OpeningHours("07:30", "19:00", "07:30",
				"19:00", "07:30", "19:00", "07:30", "19:00", "07:30", "19:00", "07:30", "16:00", "", ""),
				new AboutShop(3, 1)));
		shops.add(new Address(85, 51.51624, 7.46349, new Contact(" Kampstr. 35-37 / Hansastr. 5 ", "44137", "Dortmund",
				"0231 1654174", "Westfalenforum Shoppingcenter "), new OpeningHours("07:00", "19:00", "07:00", "19:00",
				"07:00", "19:00", "07:00", "19:00", "07:00", "19:00", "07:00", "16:00", "08:00", "18:00"),
				new AboutShop(3, 0)));
		shops.add(new Address(86, 51.50277, 7.46103, new Contact(" Landgrafenstr.153 ", "44139", "Dortmund",
				"0231 1061700", "REWE Markt "), new OpeningHours("08:00", "19:00", "08:00", "19:00", "08:00", "19:00",
				"08:00", "19:00", "08:00", "19:00", "07:00", "18:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(87, 51.544447, 7.217595, new Contact(" Bahnhofsplatz ", "44629", "Herne", "02323 917730",
				"Hauptbahnhof "), new OpeningHours("05:30", "19:00", "05:30", "19:00", "05:30", "19:00", "05:30",
				"19:00", "05:30", "19:00", "05:30", "18:00", "07:00", "17:00"), new AboutShop(3, 1)));
		shops.add(new Address(88, 51.61437, 7.63085, new Contact(" Töddinghauser Str.150, 1.OG ", "59192", "Bergkamen",
				"02307 558956", "Einkaufzentrum "), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00",
				"20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(89, 51.38663, 7.72746, new Contact(" Reiterweg 2 ", "58636", "Iserlohn", "02371 689598",
				"Hagebaumarkt "), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00",
				"20:00", "08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(3, 0)));
		shops.add(new Address(91, 51.49162, 7.30634, new Contact(" Werner Hellweg 489 ", "44894", "Bochum",
				"0234 235470", ""), new OpeningHours("05:00", "18:00", "05:00", "18:00", "05:00", "18:00", "05:00",
				"18:00", "05:00", "18:00", "06:00", "13:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(92, 51.49548, 7.2802, new Contact(" Am Einkaufszentrum 7 ", "44791", "Bochum",
				"0234 263594", " Ruhrpark Einkaufszentrum "), new OpeningHours("07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "21:30", "07:00", "20:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(93, 51.4936413, 7.28119, new Contact(" Am Einkaufszentrum 12 ", "44791", "Bochum",
				"0234 235155", " Ruhrpark Einkaufszentrum "), new OpeningHours("08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "21:30", "08:00", "20:00", "", ""), new AboutShop(3, 0)));
		shops.add(new Address(94, 51.51961, 7.27739, new Contact(" Lothringer Str. 9 ", "44805", "Bochum",
				"0234 853491", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "13:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(95, 51.54905, 7.31051, new Contact(" Münster Straße 16 ", "44575", "Castrop-Rauxel",
				"02305 542993", ""), new OpeningHours("07:30", "18:30", "07:30", "18:30", "07:30", "18:30", "07:30",
				"18:30", "07:30", "18:30", "07:30", "14:00", "08:00", "13:00"), new AboutShop(3, 0)));
		shops.add(new Address(96, 51.57479, 8.10492, new Contact(" Brüderstr.25 ", "59494", "Soest", "02921 769332",
				"Tchibo "), new OpeningHours("07:00", "19:00", "07:00", "18:30", "07:00", "18:30", "07:00", "18:30",
				"07:00", "18:30", "07:30", "16:00", "12:00", "18:00"), new AboutShop(3, 1)));
		shops.add(new Address(98, 51.21572, 7.63163, new Contact(" Wilhelmstraße 33 ", "58511", "Lüdenscheid",
				"02351 4327454", "Stern Center "), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00",
				"20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "18:30", "", ""), new AboutShop(3, 0)));
		shops.add(new Address(101, 50.96608, 9.79579, new Contact(" Hersfelder Straße 11 ", "36179", "Bebra",
				"06622 42425", "Lidl "), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30",
				"06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(102, 50.58514, 8.67411, new Contact(" Kreuzplatz 6 ", "35390", "Gießen", "0641 3011007",
				""), new OpeningHours("06:00", "19:00", "06:00", "19:00", "06:00", "19:00", "06:00", "19:00", "06:00",
				"19:00", "06:00", "18:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(104, 51.15352, 7.08728, new Contact(" Unnersbergerallee 17 ", "42659", "Solingen",
				"0212 2474146", "REWE Markt "), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(3, 0)));
		shops.add(new Address(105, 50.90989, 9.24338, new Contact(" Ernst-Ihle-Straße 8 ", "34613", "Schwalmstadt",
				"06691 710634", ""), new OpeningHours("07:00", "19:00", "07:00", "19:00", "07:00", "19:00", "07:00",
				"19:00", "07:00", "19:00", "07:00", "19:00", "", ""), new AboutShop(3, 0)));
		shops.add(new Address(106, 51.577536, 8.102755, new Contact(" Am Bahnhof 2 ", "59494", "Soest",
				"02921 3441106", "HIT "), new OpeningHours("08:00", "22:00", "08:00", "22:00", "08:00", "22:00",
				"08:00", "22:00", "08:00", "22:00", "08:00", "22:00", "", ""), new AboutShop(3, 0)));
		shops.add(new Address(107, 51.67549, 8.34689, new Contact(" Lange Straße 16 - 18 ", "59555", "Lippstadt",
				"02941 9689585", ""), new OpeningHours("07:00", "19:00", "07:00", "19:00", "07:00", "19:00", "07:00",
				"19:00", "07:00", "19:00", "07:00", "17:00", "07:00", "14:00"), new AboutShop(3, 0)));
		shops.add(new Address(108, 51.3948427, 7.1860493, new Contact("August-Bebel-Straße/Martin-Luther-Straße",
				"45525", "Hattingen", "02324 5919950", "Reschop Carré"), new OpeningHours("07:00", "20:00", "07:00",
				"20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "", ""),
				new AboutShop(3, 3)));
		shops.add(new Address(109, 50.58048, 8.64665, new Contact(" Gottlieb-Daimler-Straße 27 ", "35398", "Gießen",
				"0641 9607257", "Einkaufscenter Gießen "), new OpeningHours("07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(3, 0)));
		shops.add(new Address(110, 50.5375765, 8.537046, new Contact(" Hörnsheimer Eck ", "35578", "Wetzlar",
				"06441 9740172", "Real Markt "), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(111, 51.00353, 7.58782, new Contact(" Kölner Str. 223 ", "51645", "Gummersbach",
				"02261 2907523", "HIT "), new OpeningHours("08:00", "22:00", "08:00", "22:00", "08:00", "22:00",
				"08:00", "22:00", "08:00", "22:00", "08:00", "22:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(112, 51.1654556, 7.0906113, new Contact(" Rathausplatz 1 ", "42651", "Solingen",
				"0212 2210 254", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "08:00", "16:00", "08:00", "11:00"), new AboutShop(3, 0)));
		shops.add(new Address(113, 51.0328259, 6.9861889, new Contact(" Friedrich-Ebert-Platz 1 ", "51373",
				"Leverkusen", "0214 - 8405121", "Rathaus-Galerie "), new OpeningHours("08:00", "20:00", "08:00",
				"20:00", "08:00", "20:00", "08:00", "22:00", "08:00", "20:00", "08:00", "20:00", "", ""),
				new AboutShop(3, 1)));
		shops.add(new Address(114, 51.4756198, 7.4392303, new Contact(" Harkortstr. 55a ", "44225", "Dortmund",
				"0231-1896022", ""), new OpeningHours("07:00", "19:00", "07:00", "19:00", "07:00", "19:00", "07:00",
				"19:00", "07:00", "19:00", "07:00", "19:00", "08:00", "18:00"), new AboutShop(3, 0)));
		shops.add(new Address(115, 51.45288, 7.01329, new Contact(" Willy-Brandt-Platz 16 ", "45127", "Essen",
				"0201 43759775", ""), new OpeningHours("05:00", "20:00", "05:00", "20:00", "05:00", "20:00", "05:00",
				"20:00", "05:00", "20:00", "06:30", "20:00", "", ""), new AboutShop(3, 0)));
		shops.add(new Address(116, 51.45612, 7.00694, new Contact(" Limbecker Platz 13 ", "45127", "Essen",
				"0201 2488 407", "Limbecker-Platz Einkaufszentrum "), new OpeningHours("08:00", "20:00", "08:00",
				"20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "", ""),
				new AboutShop(3, 0)));
		shops.add(new Address(117, 51.45288, 7.01329, new Contact(" Willy-Brandt-Platz 16 ", "45127", "Essen",
				"0201 4786 7401", ""), new OpeningHours("04:00", "20:00", "04:00", "20:00", "04:00", "20:00", "04:00",
				"20:00", "04:00", "20:00", "04:00", "20:00", "06:00", "19:00"), new AboutShop(3, 0)));
		shops.add(new Address(118, 51.5155, 7.46593, new Contact(" Brückstraße 20-26 ", "44135", "Dortmund",
				"0231-129 75 17", ""), new OpeningHours("08:00", "19:00", "08:00", "19:00", "08:00", "19:00", "08:00",
				"19:00", "08:00", "19:00", "08:00", "16:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(119, 51.4520594, 7.0138291, new Contact(" Am Hauptbahnhof 5/ Ladenzeile West ", "45127",
				"Essen", "0201 10228 441", "Hauptbahnhof "), new OpeningHours("06:00", "20:00", "06:00", "20:00",
				"06:00", "20:00", "06:00", "20:00", "06:00", "20:00", "", "", "", ""), new AboutShop(3, 3)));
		shops.add(new Address(122, 51.44835, 7.25882, new Contact(" Hustadtring / Querenburger Höhe 234 ", "44801",
				"Bochum", "0234 5887390", "Uni-Center Querenburg "), new OpeningHours("07:30", "20:00", "07:30",
				"20:00", "07:30", "20:00", "07:30", "20:00", "07:30", "20:00", "07:30", "18:00", "11:00", "17:00"),
				new AboutShop(3, 0)));
		shops.add(new Address(123, 51.4817642, 7.2163338, new Contact("Bongardstr. 2 ", "44787", "Bochum",
				"0234 5889967", ""), new OpeningHours("06:30", "18:00", "06:30", "18:00", "06:30", "18:00", "07:00",
				"18:00", "06:30", "18:00", "08:00", "14:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(124, 51.4799, 7.22254, new Contact("Kurt-Schumacher-Platz 11-12 ", "44787", "Bochum",
				"0234 5889966", ""), new OpeningHours("06:00", "20:00", "06:00", "20:00", "06:00", "20:00", "06:00",
				"20:00", "06:00", "19:00", "06:00", "16:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(125, 51.40003, 7.18302, new Contact("Hegger Str.20 / Augustastraße ", "45525",
				"Hattingen/Ruhr", "02324 51992", ""), new OpeningHours("08:00", "18:30", "08:00", "18:30", "08:00",
				"18:30", "08:00", "18:30", "08:00", "18:30", "08:00", "16:00", "", ""), new AboutShop(3, 0)));
		shops.add(new Address(126, 51.47934, 7.222846, new Contact("Kurt -Schumacher-Platz 13 ", "44785", "Bochum",
				"0234 9128995", "Hauptbahnhof "), new OpeningHours("04:30", "22:00", "04:30", "22:00", "04:30",
				"22:00", "04:30", "22:00", "04:30", "22:00", "05:00", "22:00", "06:00", "22:00"), new AboutShop(3, 0)));
		shops.add(new Address(127, 51.44152, 7.21371, new Contact("Markstr. 408 ", "44795", "Bochum", "0234 4769724",
				""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "13:00", "", ""), new AboutShop(3, 0)));
		shops.add(new Address(128, 51.48233, 7.21665, new Contact("Kortumstrasse 89 ", "44787", "Bochum", "0234 67461",
				"City-Point Bochum "), new OpeningHours("07:30", "20:00", "07:30", "20:00", "07:30", "20:00", "07:30",
				"20:00", "07:30", "20:00", "07:30", "18:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(130, 51.40288, 7.13245, new Contact("Essener Str. 44 ", "45529", "Hattingen/Ruhr",
				"02324 43138", "REWE Markt "), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(131, 51.5084358, 7.097707, new Contact("Bahnhofsplatz ", "45879", "Gelsenkirchen",
				"0209 29546", "Hauptbahnhof "), new OpeningHours("05:00", "20:00", "05:00", "20:00", "05:00", "20:00",
				"05:00", "20:00", "05:00", "20:00", "06:00", "18:00", "07:30", "16:00"), new AboutShop(3, 1)));
		shops.add(new Address(132, 51.4839383, 7.2175488, new Contact("Kortumstr. 89/Drehscheibe ", "44787", "Bochum",
				"0234 67645", "Einkaufszentrum Drehscheibe Bochum "), new OpeningHours("08:00", "20:00", "08:00",
				"20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "18:00", "", ""),
				new AboutShop(3, 1)));
		shops.add(new Address(133, 51.30829, 9.42353, new Contact("Hunrodstr. 1 ", "34131", "Kassel", "0561 3161596",
				"Edeka Markt "), new OpeningHours("07:30", "19:00", "07:30", "19:00", "07:30", "19:00", "07:30",
				"19:00", "07:30", "19:00", "07:30", "14:00", "", ""), new AboutShop(3, 2)));
		shops.add(new Address(134, 51.29046, 9.47346, new Contact("Frankfurter Str. 225 ", "34134", "Kassel",
				"0561 41619", "DEZ-Einkaufszentrum Kassel "), new OpeningHours("09:30", "20:00", "09:30", "20:00",
				"09:30", "20:00", "09:30", "20:00", "09:30", "22:00", "09:30", "20:00", "", ""), new AboutShop(3, 0)));
		shops.add(new Address(135, 51.0476543, 9.2788674, new Contact("Bahnhofstraße 30 ", "34582", "Borken",
				"05682 733633", ""), new OpeningHours("05:00", "18:00", "05:00", "18:00", "05:00", "18:00", "05:00",
				"18:00", "05:00", "18:00", "05:00", "13:00", "07:00", "10:30"), new AboutShop(3, 0)));
		shops.add(new Address(136, 51.11848, 9.12297, new Contact("Brunnenstraße 51 ", "34537", "Bad Wildungen",
				"05621 72984", ""), new OpeningHours("05:00", "18:00", "05:00", "18:00", "05:00", "18:00", "05:00",
				"18:00", "05:00", "18:00", "06:00", "13:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(137, 51.13319, 9.27498, new Contact("Busbahnhof / Kasseler Str. 22-25 ", "34560",
				"Fritzlar", "05622 6730", ""), new OpeningHours("06:30", "18:00", "06:30", "18:00", "06:30", "18:00",
				"06:30", "18:00", "06:30", "18:00", "06:30", "13:00", "07:30", "10:00"), new AboutShop(3, 0)));
		shops.add(new Address(138, 51.53715, 9.93452, new Contact("Weender Straße 94 ", "37073", "Göttingen",
				"0551 4888990", ""), new OpeningHours("06:00", "19:00", "06:00", "19:00", "06:00", "19:00", "06:00",
				"19:00", "06:00", "19:00", "07:00", "15:00", "", ""), new AboutShop(3, 2)));
		shops.add(new Address(140, 51.28025, 9.54761, new Contact("Hauptstr. 67-69 ", "34253", "Lohfelden",
				"0561 5101396", "REWE Markt "), new OpeningHours("06:00", "20:00", "06:00", "20:00", "06:00", "20:00",
				"06:00", "20:00", "06:00", "20:00", "06:00", "18:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(141, 51.31234, 9.49176, new Contact("Obere Königsstr. 9 ", "34117", "Kassel",
				"0561 12354", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "07:00", "18:00", "", ""), new AboutShop(3, 0)));
		shops.add(new Address(142, 51.3154341, 9.4969299, new Contact("Königsplatz 53 ", "34117", "Kassel",
				"0561 7004677", ""), new OpeningHours("07:00", "19:00", "07:00", "19:00", "07:00", "19:00", "07:00",
				"19:00", "07:00", "19:00", "07:30", "19:00", "11:00", "18:00"), new AboutShop(3, 1)));
		shops.add(new Address(144, 51.5449339, 9.9304663, new Contact("Weender Landstraße 59 ", "37075", "Göttingen",
				"0551 2053019", "Edeka Markt "), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(3, 0)));
		shops.add(new Address(145, 51.3171218, 9.4957837, new Contact("Mauerstr./Spohrstr. ", "34117", "Kassel",
				"0561 107958", "Kurfürstengalerie "), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00",
				"20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(3, 0)));
		shops.add(new Address(146, 51.29116, 9.51944, new Contact("Görlitzer Straße 39 ", "34123", "Kassel",
				"0561 5799555", "REWE Markt "), new OpeningHours("07:00", "21:00", "07:00", "21:00", "07:00", "21:00",
				"07:00", "21:00", "07:00", "21:00", "07:00", "21:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(147, 51.41792, 9.65158,
				new Contact("Markt 2 ", "34346", "Hann. Münden", "05541 2064", ""), new OpeningHours("06:00", "18:00",
						"06:00", "18:00", "06:00", "18:00", "06:00", "18:00", "06:00", "18:00", "06:00", "16:00",
						"08:00", "17:00"), new AboutShop(3, 2)));
		shops.add(new Address(150, 51.43194, 9.64488, new Contact("Auefeld 9 ", "34346", "Hann. Münden", "05541 73522",
				"HIT "), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(3, 0)));
		shops.add(new Address(152, 51.362818, 9.468015, new Contact("Rathausplatz 3 ", "34246", "Vellmar",
				"0561 824449", ""), new OpeningHours("05:30", "18:00", "05:30", "18:00", "05:30", "18:00", "05:30",
				"18:00", "05:30", "18:00", "05:30", "13:00", "08:00", "11:00"), new AboutShop(3, 0)));
		shops.add(new Address(153, 51.53202, 9.93488, new Contact("Groner Str.36 ", "37073", "Göttingen",
				"0551 5311820", ""), new OpeningHours("06:00", "19:00", "06:00", "19:00", "06:00", "19:00", "06:00",
				"19:00", "06:00", "19:00", "06:00", "16:00", "06:00", "16:00"), new AboutShop(3, 0)));
		shops.add(new Address(154, 51.34264, 9.85773, new Contact("Am Markt 8 ", "37213", "Witzenhausen",
				"05542 502874", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "12:30", "08:00", "11:00"), new AboutShop(3, 1)));
		shops.add(new Address(155, 51.31792, 9.49948, new Contact("Untere Königsstraße 79 ", "34117", "Kassel",
				"0561 7398182", ""), new OpeningHours("05:00", "18:00", "05:00", "18:00", "05:00", "18:00", "05:00",
				"18:00", "05:00", "18:00", "06:00", "14:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(156, 51.25705, 7.14766, new Contact("Alte Freiheit 4 ", "42103", "Wuppertal",
				"0202 451122", ""), new OpeningHours("06:00", "19:00", "06:00", "19:00", "06:00", "19:00", "06:00",
				"19:00", "06:00", "19:00", "06:00", "18:00", "13:00", "18:00"), new AboutShop(3, 1)));
		shops.add(new Address(157, 51.27099, 7.19826,
				new Contact("Werth 13 ", "42275", "Wuppertal", "0202 556401", ""), new OpeningHours("06:00", "18:30",
						"06:00", "18:30", "06:00", "18:30", "06:00", "19:00", "06:00", "19:00", "06:00", "16:00", "",
						""), new AboutShop(3, 1)));
		shops.add(new Address(158, 51.2721817, 7.2040886, new Contact("Werth 82 ", "42275", "Wuppertal", "0202 571126",
				"Kaufpark "), new OpeningHours("08:00", "22:00", "08:00", "22:00", "08:00", "22:00", "08:00", "22:00",
				"08:00", "22:00", "08:00", "22:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(160, 51.2742, 7.21379, new Contact("Brändströmstr. 11-19 ", "42289", "Wuppertal",
				"0202 620168", "Kaufpark "), new OpeningHours("08:00", "19:30", "08:00", "19:30", "08:00", "19:30",
				"08:00", "19:30", "08:00", "19:30", "08:00", "19:30", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(161, 51.2573964, 7.1440837, new Contact("Erholungsstrasse 19 ", "42103", "Wuppertal",
				"0202 440301", ""), new OpeningHours("06:30", "19:30", "06:30", "19:30", "06:30", "19:30", "06:30",
				"19:30", "06:30", "19:30", "07:00", "19:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(163, 51.27009, 7.19749, new Contact("Alter Markt 10 ", "42275", "Wuppertal",
				"0202 2542337", ""), new OpeningHours("05:30", "18:00", "05:30", "18:00", "05:30", "18:00", "05:30",
				"18:00", "05:30", "18:00", "05:30", "14:00", "08:00", "11:00"), new AboutShop(3, 1)));
		shops.add(new Address(164, 51.16305, 7.09615, new Contact("Schützenstraße 89 ", "42659", "Solingen",
				"0212 2442445", ""), new OpeningHours("06:00", "18:00", "06:00", "18:00", "06:00", "18:00", "06:00",
				"18:00", "06:00", "18:00", "06:00", "13:00", "08:30", "11:30"), new AboutShop(3, 1)));
		shops.add(new Address(165, 51.02503, 7.56745, new Contact("Hindenburgstraße 20 ", "51643", "Gummersbach",
				"02261 61963", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "16:00", "", ""), new AboutShop(3, 0)));
		shops.add(new Address(166, 51.15087, 7.34271, new Contact("Etapler Platz 13 ", "42499", "Hückeswagen",
				"02192 6318", "Kaufpark "), new OpeningHours("08:00", "22:00", "08:00", "22:00", "08:00", "22:00",
				"08:00", "22:00", "08:00", "22:00", "08:00", "22:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(167, 51.19311, 7.01316, new Contact("Friedrichstraße 1 ", "42781", "Haan",
				"02129 958853", ""), new OpeningHours("06:00", "18:00", "06:00", "18:00", "06:00", "18:00", "06:00",
				"18:00", "06:00", "18:00", "06:00", "13:00", "08:00", "11:00"), new AboutShop(3, 0)));
		shops.add(new Address(168, 51.0184614, 7.3732432, new Contact(" Kölner Straße 16 a ", "51789", "Lindlar",
				"02266 470990", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "06:30", "13:00", "07:30", "12:00"), new AboutShop(3, 0)));
		shops.add(new Address(169, 51.16242, 6.99794, new Contact("Düsseldorfer Straße 80 ", "42697", "Solingen",
				"0212 2681949", "Kaufpark "), new OpeningHours("07:00", "22:00", "07:00", "22:00", "07:00", "22:00",
				"07:00", "22:00", "07:00", "22:00", "07:00", "22:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(170, 51.184784, 7.0452464, new Contact("Friedrich-Ebert-Straße 96 ", "42719", "Solingen",
				"0212 2308079", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "14:00", "08:00", "12:00"), new AboutShop(3, 1)));
		shops.add(new Address(171, 51.1745, 7.08418, new Contact("Mühlenplatz 1 ", "42651", "Solingen", "0212 3834752",
				"Clemens-Galerien "), new OpeningHours("07:00", "19:00", "07:00", "19:00", "07:00", "19:00", "07:00",
				"19:00", "07:00", "19:00", "08:00", "18:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(172, 51.11667, 7.39576, new Contact("Untere Straße 6 ", "51688", "Wipperfürth",
				"02267 6570 153", ""), new OpeningHours("06:00", "19:00", "06:00", "19:00", "06:00", "19:00", "06:00",
				"19:00", "06:00", "19:00", "06:00", "14:00", "07:30", "12:00"), new AboutShop(3, 0)));
		shops.add(new Address(173, 51.3386, 7.04771, new Contact("Friedrichstraße 210 ", "42551", "Velbert",
				"02051 207689", ""), new OpeningHours("07:00", "19:00", "07:00", "19:00", "07:00", "19:00", "07:00",
				"19:00", "07:00", "19:00", "07:00", "16:00", "08:00", "16:00"), new AboutShop(3, 0)));
		shops.add(new Address(174, 51.16777, 6.96932, new Contact("Walder Straße 276 ", "40724", "Hilden",
				"02103 254604", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "14:00", "08:00", "11:00"), new AboutShop(3, 1)));
		shops.add(new Address(175, 50.9953037, 7.1105839, new Contact("Paffrather Straße 202 ", "51469",
				"Bergisch Gladbach", "02202 245424", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "06:30", "18:30", "05:30", "13:30", "08:00", "11:00"), new AboutShop(3, 1)));
		shops.add(new Address(176, 50.99162, 7.12952, new Contact(" Hauptstraße 185 ", "51465", "Bergisch Gladbach",
				"02202 932840", ""), new OpeningHours("07:00", "19:00", "07:00", "19:00", "07:00", "19:00", "07:00",
				"19:00", "07:00", "20:00", "07:00", "16:00", "11:00", "18:00"), new AboutShop(3, 0)));
		shops.add(new Address(177, 50.99093, 7.126, new Contact("Hauptstraße 143 ", "51465", "Bergisch Gladbach",
				"02202 932449", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "15:00", "12:00", "18:00"), new AboutShop(3, 1)));
		shops.add(new Address(178, 50.98951, 7.08811, new Contact("Eschenbroichstraße 5 ", "51469",
				"Bergisch Gladbach", "02202 920118", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "06:30", "18:30", "06:30", "13:00", "08:00", "11:00"), new AboutShop(3, 1)));
		shops.add(new Address(179, 50.99121, 7.138, new Contact("Hauptstraße 294 ", "51465", "Bergisch Gladbach",
				"02202 32965", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "07:00", "13:00", "08:00", "11:30"), new AboutShop(3, 1)));
		shops.add(new Address(180, 51.06663, 7.00372, new Contact("Kölner Straße 17 ", "51379", "Leverkusen",
				"02171 46653", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "17:00", "06:00", "17:00"), new AboutShop(3, 0)));
		shops.add(new Address(181, 51.03166, 6.98258, new Contact("Wiesdorfer Platz 82 ", "51373", "Leverkusen",
				"0214 8404623", "Kaufhof"), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(182, 51.06244, 7.00391, new Contact("Kölner Straße 83 ", "51379", "Leverkusen",
				"02171 741391", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "06:30", "13:00", "08:00", "11:00"), new AboutShop(3, 1)));
		shops.add(new Address(183, 50.98348, 7.1016, new Contact("Mülheimer Straße 60 ", "51469", "Bergisch Gladbach",
				"02202 248864", ""), new OpeningHours("06:00", "18:00", "06:00", "18:00", "06:00", "18:00", "06:00",
				"18:00", "06:00", "18:00", "06:00", "15:00", "08:00", "11:00"), new AboutShop(3, 1)));
		shops.add(new Address(184, 51.033, 7.04769, new Contact("Bergische Landstraße  9 ", "51375", "Leverkusen",
				"0214 5006516", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:30", "14:00", "08:00", "11:00"), new AboutShop(3, 1)));
		shops.add(new Address(186, 51.02713, 7.01427, new Contact("Stixchesstraße 123 ", "51373", "Leverkusen",
				"0214 8707575", "Real Markt "), new OpeningHours("07:00", "22:00", "07:00", "22:00", "07:00", "22:00",
				"07:00", "22:00", "07:00", "22:00", "07:00", "22:00", "", ""), new AboutShop(3, 2)));
		shops.add(new Address(187, 51.47219, 6.95012, new Contact("Marktstraße 10 ", "45355", "Essen", "0201 683587",
				"Kaiser's "), new OpeningHours("07:00", "22:00", "07:00", "22:00", "07:00", "22:00", "07:00", "22:00",
				"07:00", "22:00", "07:00", "22:00", "", ""), new AboutShop(3, 2)));
		shops.add(new Address(188, 51.42147, 6.99898, new Contact("Bredeneyer Str. 4 a ", "45133", "Essen",
				"0201 8417387", "REWE Markt "), new OpeningHours("08:00", "22:00", "08:00", "22:00", "08:00", "22:00",
				"08:00", "22:00", "08:00", "22:00", "08:00", "22:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(189, 51.45752, 7.0109, new Contact("Limbeckerstr. 21 ", "45127", "Essen", "0201 234211",
				""), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00",
				"20:00", "07:00", "20:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(190, 51.41663, 7.10633, new Contact("Worringstraße 2 ", "45289", "Essen", "0201 5718155",
				""), new OpeningHours("06:00", "18:00", "06:00", "18:00", "06:00", "18:00", "06:00", "18:00", "06:00",
				"18:00", "06:00", "13:00", "08:00", "11:00"), new AboutShop(3, 1)));
		shops.add(new Address(191, 51.45744, 7.01573, new Contact("Porscheplatz 2 ", "45127", "Essen", "0201 227829",
				"Rathaus Galerie Essen "), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "16:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(192, 51.4532422, 7.013498, new Contact("Kettwiger Str. 2-10 ", "45127", "Essen",
				"0201 236762", ""), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00",
				"20:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(193, 51.45785, 7.00734, new Contact("Limbecker Straße 79 ", "45127", "Essen",
				"0201 230940", ""), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00",
				"20:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(3, 0)));
		shops.add(new Address(194, 51.4673966, 7.0807247, new Contact("Krayer Straße 244 ", "45307", "Essen",
				"0201 556030", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "14:00", "08:00", "11:00"), new AboutShop(3, 2)));
		shops.add(new Address(195, 51.4520506, 7.0138291, new Contact("Am Hauptbahnhof 5 / Eingangshalle", "45127",
				"Essen", "0201 224929", "Hauptbahnhof "), new OpeningHours("05:30", "21:00", "05:30", "21:00", "05:30",
				"21:00", "05:30", "21:00", "05:30", "21:00", "05:30", "21:00", "06:30", "21:00"), new AboutShop(3, 1)));
		shops.add(new Address(196, 51.48507, 7.06307, new Contact("Karl Mayer Platz / Huestraße 111 ", "45309",
				"Essen", "0201 293686", ""), new OpeningHours("05:00", "18:00", "05:00", "18:00", "05:00", "18:00",
				"05:00", "18:00", "05:00", "18:00", "05:00", "13:30", "07:00", "12:00"), new AboutShop(3, 1)));
		shops.add(new Address(197, 51.39036, 7.08271, new Contact("Kupferdreher Str. 172 ", "45257", "Essen",
				"0201 487349", ""), new OpeningHours("06:30", "18:00", "06:30", "18:00", "06:30", "18:00", "06:30",
				"18:00", "06:30", "18:00", "06:30", "13:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(198, 51.42931, 7.07632, new Contact("Schulte-Hinsel-Str. 5 ", "45277", "Essen",
				"0201 9595665", ""), new OpeningHours("07:00", "18:00", "07:00", "18:00", "07:00", "18:00", "07:00",
				"18:00", "07:00", "18:00", "07:00", "16:00", "08:00", "12:00"), new AboutShop(3, 0)));
		shops.add(new Address(199, 51.4520906, 7.0138291, new Contact("Am Hauptbahnhof 5 / Empore", "45127", "Essen",
				"0201 58496191", "Hauptbahnhof "), new OpeningHours("05:00", "21:00", "05:00", "21:00", "05:00",
				"21:00", "05:00", "21:00", "05:00", "21:00", "05:00", "21:00", "05:00", "20:00"), new AboutShop(3, 2)));
		shops.add(new Address(200, 51.45744, 7.01573, new Contact("Porscheplatz 2 ", "45127", "Essen", "0201 232629",
				"Real Markt "), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00",
				"20:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(3, 0)));
		shops.add(new Address(201, 51.3751, 6.95068, new Contact("Rheinstr. 2 ", "45219", "Essen", "02054 84597", ""),
				new OpeningHours("07:00", "18:00", "07:00", "18:00", "07:00", "18:00", "07:00", "18:00", "07:00",
						"18:00", "07:00", "13:00", "08:00", "11:00"), new AboutShop(3, 1)));
		shops.add(new Address(203, 51.3295, 6.99212, new Contact("Velberter Straße 38-42 ", "42579", "Heiligenhaus",
				"02056 57871", "Real Markt "), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "16:00", "", ""), new AboutShop(3, 1)));
		shops.add(new Address(204, 51.31424, 7.06572, new Contact("Nevigeser Straße 291 ", "42553", "Velbert",
				"02053 6146", ""), new OpeningHours("07:00", "18:00", "07:00", "18:00", "07:00", "18:00", "07:00",
				"18:00", "07:00", "18:00", "07:00", "13:00", "08:00", "11:00"), new AboutShop(3, 1)));
		shops.add(new Address(205, 51.53083, 7.63065, new Contact("Tronjestr. 14 ", "44319", "Dortmund",
				"0231 95988137", ""), new OpeningHours("", "", "", "", "", "", "", "", "", "", "", "", "", ""),
				new AboutShop(3, 3)));
		shops.add(new Address(206, 51.6158, 7.20264, new Contact("Große Perdekampstr. 2 ", "45657", "Recklinghausen",
				"02361 3068918", "Hauptbahnhof "), new OpeningHours("", "", "", "", "", "", "", "", "", "", "", "", "",
				""), new AboutShop(3, 3)));
		shops.add(new Address(207, 51.21913, 6.27529, new Contact(" Galgheide 9-11", "41366", "Schwalmtal",
				"02163 947873", ""), new OpeningHours("06:00", "15:00", "06:00", "15:00", "06:00", "15:00", "06:00",
				"15:00", "06:00", "15:00", "06:00", "13:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(208, 51.19767, 6.22049, new Contact(" Dr. Lindemann-Str.  22-24", "41372",
				"Niederkrüchten", "02163 30580", ""), new OpeningHours("06:30", "12:30", "06:30", "18:00", "06:30",
				"18:00", "06:30", "18:00", "06:30", "18:00", "06:30", "13:00", "08:00", "11:00"), new AboutShop(0, 2)));
		shops.add(new Address(209, 51.25875, 6.38753, new Contact(" Hauptstr. 8", "41747", "Viersen", "02162 20774",
				"Freestander "), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "14:00", "08:00", "11:00"), new AboutShop(0, 2)));
		shops.add(new Address(210, 51.2614, 6.40378, new Contact(" Kanalstraße 51", "41748", "Viersen", "02162 23076",
				"Real Markt "), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00",
				"20:00", "08:00", "20:00", "07:00", "18:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(211, 51.31714, 6.47437, new Contact(" Vorster Straße 224 / Höhenhöfe 19", "47918",
				"Tönisvorst", "02151 700877", "Real Markt "), new OpeningHours("08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "18:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(212, 51.23116, 6.24029, new Contact(" Polmansstraße 43", "41366", "Schwalmtal",
				"02163 2787", ""), new OpeningHours("06:00", "12:30", "06:00", "18:00", "06:00", "18:00", "06:00",
				"18:00", "06:00", "18:00", "06:00", "12:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(213, 51.16299, 6.44476, new Contact(" Moses-Stern-Straße 29", "41236", "Mönchengladbach",
				"02166 1337270", "Real Markt "), new OpeningHours("07:00", "22:00", "07:00", "22:00", "07:00", "22:00",
				"07:00", "22:00", "07:00", "22:00", "07:00", "22:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(214, 51.1653, 6.44143, new Contact(" Friedrich-Ebert-Straße 5", "41236",
				"Mönchengladbach", "02166 41544", "Freestander "), new OpeningHours("05:30", "19:00", "05:30", "19:00",
				"05:30", "19:00", "05:30", "19:00", "05:30", "19:00", "05:30", "14:00", "08:30", "11:30"),
				new AboutShop(0, 1)));
		shops.add(new Address(215, 51.1968262, 6.4050794, new Contact(" Waldnieler Straße 261", "41068",
				"Mönchengladbach", "02161 833577", "REWE Markt "), new OpeningHours("08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "16:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(216, 51.3166, 6.55913, new Contact(" Lehmheide 5-7", "47805", "Krefeld", "02151 390901",
				"REWE Markt "), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00",
				"20:00", "08:00", "20:00", "07:00", "16:00", "08:00", "12:00"), new AboutShop(0, 1)));
		shops.add(new Address(217, 51.49259, 6.83725, new Contact(" Lindner Straße 137", "46149", "Oberhausen",
				"0208 6257258", "Hellweg Baumarkt "), new OpeningHours("06:30", "20:00", "06:30", "20:00", "06:30",
				"20:00", "06:30", "20:00", "06:30", "20:00", "06:30", "20:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(218, 51.2522327, 6.3282255, new Contact(" Bruchweg 27", "41751", "Viersen",
				"02162 55119", "Kaufland Markt "), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00",
				"20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "16:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(219, 51.20727, 6.46036, new Contact(" Krefelder Straße 131", "41066", "Mönchengladbach",
				"02161 209888", "Real Markt "), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "16:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(221, 50.78279, 6.12466, new Contact(" Breslauer Straße 35", "52068", "Aachen",
				"0241 537913", "Real Markt "), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(222, 50.92749, 6.37198, new Contact(" An der Leimkaul 1", "52428", "Jülich",
				"02461 57831", "Real Markt "), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "07:00", "16:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(223, 51.37216, 6.42127, new Contact(" Kleinbahnstraße 24-28", "47906", "Kempen",
				"02152 50021", "REWE Markt "), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "18:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(224, 51.32333, 6.20336, new Contact(" Bahnhofstraße 18/Poststraße", "41334", "Nettetal",
				"02157 132358", "REWE Markt "), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "16:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(225, 51.22468, 6.48276, new Contact(" Krefelder Straße 643", "41066", "Mönchengladbach",
				"02161 666729", "Real Markt "), new OpeningHours("08:00", "21:00", "08:00", "21:00", "08:00", "21:00",
				"08:00", "21:00", "08:00", "21:00", "08:00", "21:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(226, 51.32767, 6.56561, new Contact(" Neusser Straße 67", "47798", "Krefeld",
				"02151 391307", "Freestander "), new OpeningHours("06:00", "19:00", "06:00", "19:00", "06:00", "19:00",
				"06:00", "19:00", "06:00", "19:00", "06:00", "19:00", "06:00", "13:00"), new AboutShop(0, 0)));
		shops.add(new Address(227, 51.1661, 6.44219, new Contact(" Stresemannstraße 11", "41236", "Mönchengladbach",
				"02166 46821", "Freestander "), new OpeningHours("06:00", "19:00", "06:00", "19:00", "06:00", "19:00",
				"06:00", "19:00", "06:00", "19:00", "06:00", "16:00", "06:00", "16:00"), new AboutShop(0, 0)));
		shops.add(new Address(228, 51.25748, 6.38869, new Contact(" Hauptstraße 34", "41747", "Viersen", "02162 18843",
				"Freestander "), new OpeningHours("08:00", "18:30", "08:00", "18:30", "08:00", "18:30", "08:00",
				"18:30", "08:00", "18:30", "08:00", "16:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(229, 51.2166667, 6.2666667, new Contact(" St. Michael-Straße 5", "41366", "Schwalmtal",
				"02163 31829", ""), new OpeningHours("06:00", "18:00", "06:00", "18:00", "06:00", "18:00", "06:00",
				"18:00", "06:00", "18:00", "06:00", "13:00", "08:00", "11:00"), new AboutShop(0, 0)));
		shops.add(new Address(230, 51.26553, 6.55259, new Contact(" Peterstraße 44", "47877", "Willich",
				"02154 428088", "Freestander "), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30",
				"06:30", "18:30", "06:30", "18:30", "06:00", "13:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(231, 51.242346, 6.5361225, new Contact(" Hochstraße 37", "47877", "Willich",
				"02154 70608", "Freestander "), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30",
				"06:00", "18:30", "06:00", "18:30", "06:00", "13:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(232, 51.26847, 6.62098, new Contact(" Meerbuscher Str. 3", "40670", "Meerbusch",
				"02159 1247", "Freestander "), new OpeningHours("07:00", "18:00", "07:00", "18:00", "07:00", "13:00",
				"07:00", "18:00", "07:00", "18:00", "07:00", "13:00", "08:00", "11:00"), new AboutShop(0, 0)));
		shops.add(new Address(233, 51.16734, 6.68521, new Contact(" Bergheimer Straße 503", "41466", "Neuss",
				"02131 466039", "Freestander "), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30",
				"06:00", "18:30", "06:00", "18:30", "06:00", "14:00", "08:00", "11:00"), new AboutShop(0, 0)));
		shops.add(new Address(234, 51.30662, 6.27577, new Contact("Hochstraße 35 ", "41334", "Nettetal", "02153 8307",
				""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "13:00", "08:00", "11:00"), new AboutShop(0, 0)));
		shops.add(new Address(235, 51.07591, 6.30315, new Contact("Adam-Opel-Straße 6 - 16 ", "41812", "Erkelenz",
				"02431 2934", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "14:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(236, 50.790843, 6.101029, new Contact("Am Gut Wolf ", "52070", "Aachen", "0241 158716",
				"Selgross Großhandelsmarkt "), new OpeningHours("07:00", "19:30", "07:00", "19:30", "07:00", "19:30",
				"07:00", "19:30", "07:00", "19:30", "07:00", "13:30", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(237, 51.0656034, 6.1882125, new Contact("Heerstr. 9 ", "41836", "Hückelhoven",
				"02433 5359", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "06:30", "14:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(238, 51.32026, 6.19791, new Contact("Poensgenstr. 13 ", "41334", "Nettetal",
				"02157 3413", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "14:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(239, 51.217, 6.7822, new Contact("Corneliusstr. 1 ", "40215", "Düsseldorf",
				"0211 383679", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "13:00", "08:30", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(240, 51.21688, 6.46926, new Contact("Engelblecker Str. 199 ", "41066", "Mönchengladbach",
				"02161 665589", "REWE Markt "), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "18:00", "", ""), new AboutShop(0, 2)));
		shops.add(new Address(241, 51.1940469, 6.4381773, new Contact("Hindenburgstr. 76", "41061", "Mönchengladbach",
				"02161 2471012", "Vis-A-Vis Interimshalle"), new OpeningHours("07:00", "19:00", "07:00", "19:00",
				"07:00", "19:00", "07:00", "19:00", "07:00", "19:00", "07:00", "18:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(242, 51.19554, 6.44199, new Contact("Hindenburgstr. 142-144 ", "41061",
				"Mönchengladbach", "02161 182914", ""), new OpeningHours("06:30", "19:00", "06:30", "19:00", "06:30",
				"19:00", "06:30", "19:00", "06:30", "19:00", "06:30", "17:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(243, 51.15448, 6.44993, new Contact("Odenkirchener Str. 298 ", "41236",
				"Mönchengladbach", "02166 614205", "Praktiker Baumarkt "), new OpeningHours("06:30", "19:30", "06:30",
				"19:30", "06:30", "19:30", "06:30", "19:30", "06:30", "19:30", "06:30", "16:00", "", ""),
				new AboutShop(0, 0)));
		shops.add(new Address(244, 51.30723, 6.42971, new Contact("Kempener Str. 11-13 ", "47918", "Tönisvorst",
				"02156 80224", "REWE Markt "), new OpeningHours("07:00", "22:00", "07:00", "22:00", "07:00", "22:00",
				"07:00", "22:00", "07:00", "22:00", "07:00", "22:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(245, 51.09182, 6.15923, new Contact("Jülicher Str. 4 ", "41849", "Wassenberg",
				"02432 5689", "Edeka Markt "), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "16:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(246, 51.14967, 6.44891, new Contact("Steinsstraße 70", "41199", "Mönchengladbach",
				"02166 16223", "HIT"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00",
				"20:00", "08:00", "20:00", "08:00", "16:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(247, 51.19411, 6.43406, new Contact("Hindenburgstraße 39", "41061", "Mönchengladbach",
				"02161 177492", ""), new OpeningHours("07:00", "19:00", "07:00", "19:00", "07:00", "19:00", "07:00",
				"19:00", "07:00", "19:00", "07:00", "16:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(248, 51.19717, 6.69423, new Contact("Oberstraße 107", "41460", "Neuss", "02131 277120",
				""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "15:00", "11:00", "15:00"), new AboutShop(0, 1)));
		shops.add(new Address(249, 51.21416, 6.68169, new Contact("Römerstr. 120", "41462", "Neuss", "02131 50451",
				"HIT"), new OpeningHours("07:00", "22:00", "07:00", "22:00", "07:00", "22:00", "07:00", "22:00",
				"07:00", "22:00", "07:00", "22:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(250, 50.69886, 7.05715,
				new Contact("Borsigallee 8", "53125", "Bonn", "0228 92655045", ""), new OpeningHours("07:00", "19:00",
						"07:00", "19:00", "07:00", "19:00", "07:00", "19:00", "07:00", "19:00", "07:00", "13:00",
						"08:00", "11:00"), new AboutShop(0, 0)));
		shops.add(new Address(251, 51.3042525, 6.5772528, new Contact("Hafelstraße 249", "47807", "Krefeld",
				"02151 542827", "Praktiker"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "07:30", "18:00", "08:00", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(252, 51.22042, 6.79304, new Contact("Konrad-Adenauer-Platz 14", "40210", "Düsseldorf",
				"0211 1701134", "Bahnhof"), new OpeningHours("04:30", "22:00", "04:30", "22:00", "04:30", "22:00",
				"04:30", "22:00", "04:30", "22:00", "04:30", "22:00", "04:30", "22:00"), new AboutShop(0, 2)));
		shops.add(new Address(253, 51.58292, 6.24658, new Contact("Hauptstraße 35-37", "47623", "Kevelaer",
				"02832 9301946", ""), new OpeningHours("07:00", "18:00", "07:00", "18:00", "07:00", "18:00", "07:00",
				"18:00", "07:00", "18:00", "08:00", "17:00", "08:00", "17:00"), new AboutShop(0, 0)));
		shops.add(new Address(254, 51.2011454, 6.68736, new Contact("Niederstraße 1", "41460", "Neuss", "02131 277465",
				""), new OpeningHours("07:00", "19:00", "07:00", "19:00", "07:00", "19:00", "07:00", "19:00", "07:00",
				"19:00", "07:00", "16:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(255, 51.33286, 6.56547, new Contact("Ostwall 156", "47798", "Krefeld", "02151 3607737",
				""), new OpeningHours("06:00", "19:00", "06:00", "19:00", "06:00", "19:00", "06:00", "19:00", "06:00",
				"19:00", "06:00", "19:00", "08:00", "16:00"), new AboutShop(0, 0)));
		shops.add(new Address(256, 51.65773, 6.62367, new Contact("Friedrichstraße 8", "46483", "Wesel",
				"0281 1549241", "REWE"), new OpeningHours("07:00", "22:00", "07:00", "22:00", "07:00", "22:00",
				"07:00", "22:00", "07:00", "22:00", "07:00", "22:00", "", ""), new AboutShop(0, 2)));
		shops.add(new Address(257, 51.32502, 6.57055, new Contact("Am Hauptbahnhof 1", "47798", "Krefeld",
				"02151 3687325", "Bahnhof"), new OpeningHours("05:00", "21:30", "05:00", "21:30", "05:00", "21:30",
				"05:00", "21:30", "05:00", "21:30", "07:00", "21:30", "07:00", "21:30"), new AboutShop(0, 0)));
		shops.add(new Address(258, 51.32502, 6.57055, new Contact("Am Hauptbahnhof 1", "47798", "Krefeld",
				"02151 3687325", "Bahnhof"), new OpeningHours("05:00", "20:00", "05:00", "20:00", "05:00", "20:00",
				"05:00", "20:00", "05:00", "20:00", "05:00", "20:00", "05:00", "20:00"), new AboutShop(0, 0)));
		shops.add(new Address(259, 51.15629, 6.69641, new Contact("Otto-Wels-Str. 8", "41466", "Neuss", "02131 47992",
				""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "07:00", "13:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(260, 51.2075211, 6.7063135, new Contact("Breslauer Str. 2 und 4", "41460", "Neuss",
				"02131 - 1331605", "Rheinpark-Center"), new OpeningHours("10:00", "20:00", "10:00", "20:00", "10:00",
				"20:00", "10:00", "20:00", "10:00", "20:00", "10:00", "20:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(261, 51.33072, 6.56313, new Contact("Hochstraße 62", "47798", "Krefeld", "02151 26415",
				""), new OpeningHours("08:00", "18:30", "08:00", "18:30", "08:00", "18:30", "08:00", "18:30", "08:00",
				"18:30", "08:30", "17:00", "", ""), new AboutShop(0, 2)));
		shops.add(new Address(262, 51.36409, 6.42059, new Contact("Engerstraße 55", "47906", "Kempen", "02152 5549905",
				""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "07:00", "17:00", "08:00", "16:00"), new AboutShop(0, 0)));
		shops.add(new Address(263, 51.19639, 6.79343, new Contact("Moorenstraße 5", "40225", "Düsseldorf",
				"0211 33679390", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "06:30", "16:00", "08:00", "12:00"), new AboutShop(0, 1)));
		shops.add(new Address(264, 51.28395, 6.77514, new Contact("Flughafen 1", "40474", "Düsseldorf", "0211 4299355",
				"Flughafen"), new OpeningHours("04:00", "21:00", "04:00", "21:00", "04:00", "21:00", "04:00", "21:00",
				"04:00", "21:00", "04:00", "21:00", "04:00", "21:00"), new AboutShop(0, 2)));
		shops.add(new Address(265, 51.28199, 6.19613, new Contact("Weizer Platz 7-9", "41379", "Brüggen",
				"02157 90032", "Kaiser's"), new OpeningHours("07:30", "20:00", "07:30", "20:00", "07:30", "20:00",
				"07:30", "20:00", "07:30", "20:00", "07:30", "16:00", "", ""), new AboutShop(0, 2)));
		shops.add(new Address(266, 51.24046, 6.7815, new Contact("Nordstraße 116", "40477", "Düsseldorf",
				"0211 20964648", ""), new OpeningHours("07:30", "18:30", "07:30", "18:30", "07:30", "18:30", "07:30",
				"18:30", "07:30", "18:30", "07:30", "18:30", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(267, 51.23468, 6.77788, new Contact("Kaiserstraße 5", "40479", "Düsseldorf",
				"0211 51369066", ""), new OpeningHours("06:30", "18:00", "06:30", "18:00", "06:30", "18:00", "06:30",
				"18:00", "06:30", "18:30", "07:00", "14:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(268, 50.92115, 6.13475, new Contact("Friedrich-Ebert-Str. 4", "52531", "Übach-Palenberg",
				"02451 49470", "Real Markt"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "16:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(269, 51.0755, 6.30631, new Contact("Paul-Rüttchen-Str. 13", "41812", "Erkelenz",
				"02431 72270", "REWE"), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00",
				"20:00", "07:00", "20:00", "07:00", "16:00", "08:00", "13:00"), new AboutShop(0, 0)));
		shops.add(new Address(270, 51.23415, 6.78971, new Contact("Camphausenstraße 18", "40479", "Düsseldorf",
				"0211 20964595", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "06:30", "14:00", "08:00", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(271, 51.20144, 6.68576, new Contact("Krefelder Str. 47c", "41460", "Neuss",
				"02131 129510", ""), new OpeningHours("06:30", "19:00", "06:30", "19:00", "06:30", "19:00", "06:30",
				"19:00", "06:30", "19:00", "06:30", "16:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(272, 51.07748, 6.31842, new Contact("Kölner Str. 35", "41812", "Erkelenz",
				"02431 9479660", ""), new OpeningHours("07:30", "18:30", "07:30", "18:30", "07:30", "18:30", "07:30",
				"18:30", "07:30", "18:30", "07:30", "14:00", "08:30", "11:30"), new AboutShop(0, 0)));
		shops.add(new Address(273, 51.05538, 6.22288, new Contact("Parkhofstr. 89", "41836", "Hückelhoven",
				"02433 85762", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "06:30", "14:00", "07:00", "11:00"), new AboutShop(0, 0)));
		shops.add(new Address(274, 51.20385, 6.40932, new Contact(" Annakirchstraße 15 ", "41063", "Mönchengladbach",
				"02161 85391", "REWE Markt "), new OpeningHours("07:30", "20:00", "07:30", "20:00", "07:30", "20:00",
				"07:30", "20:00", "07:30", "20:00", "07:30", "16:00", "08:00", "11:00"), new AboutShop(0, 2)));
		shops.add(new Address(276, 51.03196, 6.32543,
				new Contact("Kirchplatz 1", "41812", "Erkelenz", "02435 2545", ""), new OpeningHours("06:00", "18:30",
						"06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00", "13:00", "",
						""), new AboutShop(0, 1)));
		shops.add(new Address(277, 51.30386, 6.67982, new Contact("Hauptstr. 45-56", "40668", "Meerbusch",
				"02150 911898", "Kaiser's"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "16:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(278, 51.0508884, 6.2271392, new Contact("Dienstühler Str. 60", "41836", "Hückelhoven",
				"02433 86158", ""), new OpeningHours("06:00", "18:00", "06:00", "18:00", "06:00", "18:00", "06:00",
				"18:00", "06:00", "18:00", "06:00", "13:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(279, 51.44879, 6.57942, new Contact("Andreas-Bräm-Str. 15 a,", "47506",
				"Neukirchen-Vluyn", "02845 4646", "Kaiser's"), new OpeningHours("08:00", "19:00", "08:00", "19:00",
				"08:00", "19:00", "08:00", "19:00", "08:00", "19:00", "08:00", "16:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(280, 51.20799, 6.6793,
				new Contact("Römerplatz 11", "41468", "Neuss", "02131 365964", ""), new OpeningHours("06:00", "18:30",
						"06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00", "14:00",
						"06:00", "16:00"), new AboutShop(0, 0)));
		shops.add(new Address(281, 51.19454, 6.43411, new Contact("Wallstraße 9", "41061", "Mönchengladbach",
				"02161 208237", "Kaiser's"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "16:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(282, 51.303, 6.6829, new Contact("Gonellastraße 1", "40668", "Meerbusch", "02150 911895",
				"Kaiser's"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "16:00", "", ""), new AboutShop(0, 2)));
		shops.add(new Address(284, 50.980211, 6.2702673, new Contact("Rurstraße 31", "52441", "Linnich", "02462 5380",
				""), new OpeningHours("05:00", "18:00", "05:00", "18:00", "05:00", "18:00", "05:00", "18:00", "05:00",
				"18:00", "05:00", "13:00", "06:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(285, 51.363245, 6.418237, new Contact("Engerstraße21", "47906", "Kempen", "02152 559892",
				"Kaiser's"), new OpeningHours("08:00", "19:00", "08:00", "19:00", "08:00", "19:00", "08:00", "19:00",
				"08:00", "19:00", "08:00", "18:00", "", ""), new AboutShop(0, 2)));
		shops.add(new Address(286, 50.9711772, 6.1136443, new Contact("Rue Quimperle 16", "52511", "Geilenkirchen",
				"02451 959473", "REWE"), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "12:00"), new AboutShop(0, 2)));
		shops.add(new Address(287, 50.8840217, 6.1086614, new Contact("Am langen Berg 8", "52134", "Herzogenrath",
				"02407 59024", "Kaiser's"), new OpeningHours("08:00", "19:00", "08:00", "19:00", "08:00", "19:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "16:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(288, 51.23949, 6.78048, new Contact("Nordstr. 90", "40477", "Düsseldorf", "0211 4986412",
				"Kaiser's"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "16:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(289, 51.2551, 6.39106, new Contact("Hauptstraße 93a", "41747", "Viersen", "02162 358561",
				""), new OpeningHours("07:00", "19:00", "07:00", "19:00", "07:00", "19:00", "07:00", "19:00", "07:00",
				"19:00", "07:00", "16:00", "08:00", "17:00"), new AboutShop(0, 0)));
		shops.add(new Address(290, 51.73235, 6.2991, new Contact("Xantener Straße/Oyweg 6", "47546", "Kalkar",
				"02824 94090", "REWE"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00",
				"20:00", "08:00", "20:00", "07:00", "16:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(291, 51.35641, 6.62502, new Contact("Magdeburger Str. 9", "47800", "Krefeld",
				"02151 476988", "toom"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "07:00", "16:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(292, 51.48196, 6.80952, new Contact("Berliner Str. 90", "47138", "Duisburg",
				"0203 412182", "Mercator-Center"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00",
				"20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "16:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(293, 51.1937314, 6.5050529, new Contact("Mühlenstraße 56a", "41352", "Korschenbroich",
				"02161 641157", "REWE"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "07:30", "16:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(294, 51.1043, 6.4592, new Contact("Nordring 1", "41363", "Jüchen", "02164 929386",
				"Penny"), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00", "18:30",
				"07:00", "18:30", "07:00", "14:00", "08:00", "11:00"), new AboutShop(0, 0)));
		shops.add(new Address(295, 51.21386, 6.7661, new Contact("Lorettostraße 26", "40219", "Düsseldorf",
				"0211 3984060", "Kaiser's "), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "16:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(296, 51.05825, 6.14252, new Contact("Boos-Fremery-Str.", "52525", "Heinsberg",
				"02452 931484", "REWE"), new OpeningHours("07:00", "22:00", "07:00", "22:00", "07:00", "22:00",
				"07:00", "22:00", "07:00", "22:00", "07:00", "22:00", "07:30", "12:30"), new AboutShop(0, 1)));
		shops.add(new Address(297, 51.2200402, 6.7841008, new Contact("Alexanderstr. 36", "40210", "Düsseldorf",
				"0211 8800887", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "07:00", "14:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(298, 51.08792, 6.59215, new Contact("Kölner Str. 39a", "41515", "Grevenbroich",
				"02181 658020", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "14:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(299, 51.14136, 6.20972, new Contact("Helpensteiner Straße 5", "41844", "Wegberg",
				"02436 339897", "REWE"), new OpeningHours("07:30", "20:00", "07:30", "20:00", "07:30", "20:00",
				"07:30", "20:00", "07:30", "20:00", "07:30", "16:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(301, 50.83726, 6.11829, new Contact("Bardenberger Str. 124", "52146", "Würselen",
				"02405 897985", "REWE"), new OpeningHours("06:00", "22:00", "06:00", "22:00", "06:00", "22:00",
				"06:00", "22:00", "06:00", "22:00", "06:00", "22:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(302, 51.06256, 6.09526, new Contact("Hochstraße 109", "52525", "Heinsberg",
				"02452 101172", ""), new OpeningHours("07:30", "18:30", "07:30", "18:30", "07:30", "18:30", "07:30",
				"18:30", "07:30", "18:30", "07:30", "16:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(303, 51.22515, 6.78801, new Contact("Oststraße 53", "40210", "Düsseldorf",
				"0211 1710658", ""), new OpeningHours("06:00", "19:30", "06:00", "19:30", "06:00", "19:30", "06:00",
				"19:30", "06:00", "19:30", "06:00", "16:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(304, 51.12545, 6.72782, new Contact("Neukirchener Str. 32", "41470", "Neuss",
				"02137 70769", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "13:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(305, 51.1936445, 6.692348, new Contact("Friedrichstr. 37", "41460", "Neuss",
				"02131 41141", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "14:00", "08:30", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(306, 51.1264827, 6.4106926, new Contact("Beckrather Straße 39", "41189",
				"Mönchengladbach", "02166 551683", "REWE"), new OpeningHours("07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "16:00", "09:00", "12:00"),
				new AboutShop(0, 1)));
		shops.add(new Address(307, 51.60318, 6.37612, new Contact("Hochstr. 132", "47665", "Sonsbeck", "02838 96448",
				"REWE"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "07:00", "16:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(308, 51.42203, 6.75522, new Contact("Heerstr. 140", "47053", "Duisburg", "0203 6694180",
				"Rheka-Passage Einkaufszentrum"), new OpeningHours("07:00", "19:00", "07:00", "19:00", "07:00",
				"19:00", "07:00", "19:00", "07:00", "19:00", "07:00", "14:00", "08:30", "11:30"), new AboutShop(0, 0)));
		shops.add(new Address(309, 50.76108, 6.11122, new Contact("Erzbergerallee 68", "52066", "Aachen",
				"0241 9435413", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "06:30", "12:30", "08:00", "11:00"), new AboutShop(0, 0)));
		shops.add(new Address(310, 51.2452, 6.78259, new Contact("Golzheimer Str. 129", "40476", "Düsseldorf",
				"0211 9535872", "Edeka Markt"), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "14:00", "", ""), new AboutShop(0, 2)));
		shops.add(new Address(311, 51.14983, 6.36116, new Contact("Hardter Straße 4-10/Gladbacher Straße", "41179",
				"Mönchengladbach", "02161 958257", "Kaiser's"), new OpeningHours("07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "08:00", "11:00"),
				new AboutShop(0, 1)));
		shops.add(new Address(312, 50.81938, 6.26836, new Contact("Indestraße 115", "52249", "Eschweiler",
				"02403 802164", "Plus"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "07:00", "17:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(313, 51.3357, 6.59929, new Contact("Glockenspitz 131", "47800", "Krefeld",
				"02151 540947", "Kaiser's"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "16:00", "07:30", "11:00"), new AboutShop(0, 2)));
		shops.add(new Address(314, 51.2094035, 6.7771639, new Contact("Friedrichstr. 142", "40217", "Düsseldorf",
				"0211 3110247", "Real Markt "), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "16:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(316, 51.3387166, 6.5745414, new Contact("Cracauerstr. 91-93", "47799", "Krefeld",
				"02151 668299", "Kaiser's"), new OpeningHours("08:00", "19:00", "08:00", "19:00", "08:00", "19:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "16:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(317, 51.1910608, 6.6726219, new Contact("Berghäuschenweg 28", "41464", "Neuss",
				"02131 271264", "Edeka"), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "16:00", "08:00", "11:00"), new AboutShop(0, 0)));
		shops.add(new Address(318, 51.2629602, 6.5537682, new Contact("Brauereistr. 26", "47877", "Willich",
				"02154 428085", "toom"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(319, 51.2203399, 6.7915118, new Contact("Konrad-Adenauer-Platz 11", "40210",
				"Düsseldorf", "0211 1708868", ""), new OpeningHours("06:00", "19:00", "06:00", "19:00", "06:00",
				"19:00", "06:00", "19:00", "06:00", "19:00", "06:00", "14:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(320, 51.0888, 6.58828, new Contact("Breite Str. 14", "41515", "Grevenbroich",
				"02181 162883", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "14:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(321, 51.30459, 6.82367, new Contact("Daniel-Goldbach-Str. 21", "40880", "Ratingen",
				"02102 126307", "NOVO"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(322, 51.29649, 6.85048, new Contact("Bechemerstr. 17", "40878", "Ratingen",
				"02102 158324", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "13:30", "", ""), new AboutShop(0, 2)));
		shops.add(new Address(323, 50.89961, 6.68155, new Contact("Kerpener Str. 157", "50170", "Kerpen-Sindorf",
				"02273 57854", "HIT"), new OpeningHours("08:00", "22:00", "08:00", "22:00", "08:00", "22:00", "08:00",
				"22:00", "08:00", "22:00", "08:00", "22:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(325, 50.81813, 6.29065, new Contact("Königsbenden 39", "52249", "Eschweiler",
				"02403 32201", "Obi"), new OpeningHours("09:00", "20:00", "09:00", "20:00", "09:00", "20:00", "09:00",
				"20:00", "09:00", "20:00", "08:30", "16:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(326, 50.87053, 6.69469, new Contact("Hahnenstraße 37", "50171", "Kerpen", "02237 53360",
				""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "05:30", "13:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(327, 50.80259, 6.48288,
				new Contact("Kaiserplatz 3", "52349", "Düren", "02421 292657", ""), new OpeningHours("06:30", "18:00",
						"06:30", "18:00", "06:30", "18:00", "06:30", "18:00", "06:30", "18:00", "06:30", "14:00", "",
						""), new AboutShop(0, 1)));
		shops.add(new Address(328, 51.16653, 6.44673, new Contact("Stresemannstraße 83", "41236", "Mönchengladbach",
				"02166 49470", ""), new OpeningHours("06:30", "18:00", "06:30", "18:00", "06:30", "18:00", "06:30",
				"18:00", "06:30", "18:00", "06:30", "16:00", "06:30", "12:00"), new AboutShop(0, 1)));
		shops.add(new Address(329, 51.2785473, 6.766746, new Contact("Airport Arcaden, Terminal Ring 1", "40474",
				"Düsseldorf", "0211 4299355", "Flughafen Düsseldorf"), new OpeningHours("04:00", "23:00", "04:00",
				"23:00", "04:00", "23:00", "04:00", "23:00", "04:00", "23:00", "04:00", "23:00", "04:00", "23:00"),
				new AboutShop(0, 1)));
		shops.add(new Address(330, 51.67475, 6.15837,
				new Contact("Voßstraße 48", "47574", "Goch", "02823 4190974", ""), new OpeningHours("06:30", "18:30",
						"06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30", "16:00",
						"08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(331, 51.2316437, 6.8086056, new Contact("Dorotheenstraße 1", "40233", "Düsseldorf",
				"0211 6980809", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "16:00", "08:00", "16:00"), new AboutShop(0, 1)));
		shops.add(new Address(332, 51.3303184, 6.6120949, new Contact("Maybachstraße 174-190", "47809", "Krefeld",
				"02151 524570", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "14:00", "08:30", "12:30"), new AboutShop(0, 2)));
		shops.add(new Address(333, 51.19692, 6.4436, new Contact("Hindenburgstraße 177", "41061", "Mönchengladbach",
				"02161 406393", ""), new OpeningHours("06:00", "19:00", "06:00", "19:00", "06:00", "19:00", "06:00",
				"19:00", "06:00", "19:00", "06:30", "18:00", "09:00", "14:00"), new AboutShop(0, 0)));
		shops.add(new Address(334, 51.22718, 6.60005, new Contact("Gustav-Heinemann-Straße 7", "41564", "Kaarst",
				"02131 1763881", "Neukauf"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(0, 2)));
		shops.add(new Address(335, 51.19824, 6.4414, new Contact("Sittardstraße 45-50", "41061", "Mönchengladbach",
				"02161 2478191", "REWE"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "18:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(336, 51.3024, 6.58089, new Contact("Erkelenzer Straße 81-83", "47807", "Krefeld",
				"02151 304646", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "14:00", "08:00", "16:00"), new AboutShop(0, 0)));
		shops.add(new Address(337, 51.30449, 6.58829, new Contact("Kölner Straße 524", "47807", "Krefeld",
				"02151 643889", "REWE"), new OpeningHours("06:00", "20:00", "06:00", "20:00", "06:00", "20:00",
				"06:00", "20:00", "06:00", "20:00", "06:00", "16:00", "08:00", "11:00"), new AboutShop(0, 2)));
		shops.add(new Address(338, 51.18989, 6.6733, new Contact("Preußenstraße 87 - 89", "41464", "Neuss",
				"02131 1761284", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "16:00", "08:00", "15:30"), new AboutShop(0, 0)));
		shops.add(new Address(340, 51.4690146, 6.8511689, new Contact("Marktstr. 41", "46045", "Oberhausen",
				"0208 853017", ""), new OpeningHours("07:00", "19:00", "07:00", "19:00", "07:00", "19:00", "07:00",
				"19:00", "07:00", "19:00", "07:00", "16:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(341, 51.52513, 6.86684, new Contact("Dorstenerstr. 334", "46119", "Oberhausen",
				"0208 604126", ""), new OpeningHours("07:00", "18:00", "07:00", "18:00", "07:00", "18:00", "07:00",
				"18:00", "07:00", "18:00", "06:00", "13:00", "06:00", "11:00"), new AboutShop(0, 2)));
		shops.add(new Address(342, 51.54201, 6.81969, new Contact("Hiesfelderstr. 208", "46147", "Oberhausen",
				"0208 681701", ""), new OpeningHours("07:00", "18:00", "07:00", "18:00", "07:00", "18:00", "07:00",
				"18:00", "07:00", "18:00", "07:00", "13:00", "08:00", "11:00"), new AboutShop(0, 2)));
		shops.add(new Address(343, 51.4315473, 6.9274349, new Contact("Humboldring 13, RheinRuhrZentrum", "45472",
				"Mülheim an der Ruhr", "0208 497774", "RheinRuhrZentrum"), new OpeningHours("08:30", "20:00", "08:30",
				"20:00", "08:30", "20:00", "08:30", "20:00", "08:30", "20:00", "08:30", "16:00", "", ""),
				new AboutShop(0, 0)));
		shops.add(new Address(344, 51.431250, 6.885949999999999, new Contact("Bahnhof Mülheim HbF", "45468",
				"Mülheim a. d. Ruhr", "0208 4445216", "Bahnhof"), new OpeningHours("05:00", "18:00", "05:00", "18:00",
				"05:00", "18:00", "05:00", "18:00", "05:00", "18:00", "05:00", "17:00", "05:00", "17:00"),
				new AboutShop(0, 1)));
		shops.add(new Address(346, 51.56236, 6.7632, new Contact("Krengelstraße 2", "46539", "Dinslaken",
				"02064 427949", "Kaiser's"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(0, 2)));
		shops.add(new Address(347, 51.3726654, 6.508866, new Contact("Schulstr. 1-3", "47798", "Krefeld",
				"02151 649246-0", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "07:00", "13:00", "07:00", "12:00"), new AboutShop(0, 1)));
		shops.add(new Address(348, 51.25751, 6.38511, new Contact("Löhstraße 21", "41747", "Viersen", "02162 1029165",
				"Löhcenter"), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "18:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(349, 51.4071579, 6.8709287, new Contact("Düsseldorfer Straße 112-120", "45481",
				"Mülheim a. d. Ruhr", "0208 3775856", "Kaiser's"), new OpeningHours("07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(350, 51.24028, 6.73712, new Contact("Fritz-Vomfelde-Straße 34-38", "40547", "Düsseldorf",
				"0211 5229219", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "", "", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(351, 51.06257, 6.19247, new Contact("Am Schibsler Weg 1-5", "41836",
				"Hückelhoven-Ratheim", "02433 952649", "REWE"), new OpeningHours("07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(352, 51.1364774, 6.4488953, new Contact("Wehrstraße 9", "41199", "Mönchengladbach",
				"02166 126321", "Kaiser's"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(0, 2)));
		shops.add(new Address(353, 51.3327239, 6.788155, new Contact("Angermunder Straße 40-42", "40489", "Düsseldorf",
				"0203 74410", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "06:30", "13:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(354, 51.21222, 6.78526, new Contact("Kirchfeldstraße 143", "40215", "Düsseldorf",
				"0211 349529", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "14:00", "08:30", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(355, 51.26001, 6.75371, new Contact("Amsterdamer Straße 2-4", "40474", "Düsseldorf",
				"0211 4379802", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "14:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(356, 51.24758, 6.78328, new Contact("Ulmenstraße 84", "40476", "Düsseldorf",
				"0211 5142361", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "13:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(357, 51.29765, 6.85118, new Contact("Oberstraße 18", "40878", "Ratingen", "02102 299750",
				""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "14:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(358, 51.293, 6.81872, new Contact("Jenaerstraße 18", "40880", "Ratingen", "02102 447612",
				""), new OpeningHours("07:00", "18:00", "07:00", "18:00", "07:00", "18:00", "07:00", "18:00", "07:00",
				"18:00", "07:00", "13:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(359, 51.2957403, 6.8470297, new Contact("Düsseldorfer Straße 35", "40878", "Ratingen",
				"02102 25342", "City-treff Ratingen"), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "18:30", "07:00", "14:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(360, 51.29634, 6.83148, new Contact("Am Sandbach 30", "40878", "Ratingen",
				"(02102) 125 67 77", "real,-"), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "16:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(361, 51.29121, 6.85035, new Contact("Schützenstraße 41", "40878", "Ratingen",
				"02102 872812", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "07:00", "13:00", "08:00", "11:00"), new AboutShop(0, 2)));
		shops.add(new Address(362, 51.2517, 6.97849, new Contact("Schwarzbachstraße 14", "40822", "Mettmann",
				"02104 28054", "REWE"), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00",
				"20:00", "07:00", "20:00", "07:00", "16:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(363, 51.25054, 6.975, new Contact("Neanderstraße 7", "40822", "Mettmann", "02104 72532",
				""), new OpeningHours("07:00", "18:00", "07:00", "18:00", "07:00", "18:00", "07:00", "18:00", "07:00",
				"18:00", "07:00", "13:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(364, 51.16499, 6.87405, new Contact("Hauptstraße 43", "40597", "Düsseldorf",
				"0211 7186605", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "14:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(365, 51.20026, 6.84145, new Contact("Gumbertstraße 160", "40229", "Düsseldorf",
				"0211 2295536", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "06:30", "13:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(366, 51.2076779, 6.8305987, new Contact("Reisholzer Straße 35", "40231", "Düsseldorf",
				"0211 215787", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "13:00", "08:30", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(367, 51.19092, 6.81626, new Contact("Kölner Landstraße 130", "40591", "Düsseldorf",
				"0211 7606544", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "13:00", "08:30", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(368, 51.14906, 6.86799, new Contact("Tübinger Straße 2", "40593", "Düsseldorf",
				"0211 7182099", "Edeka"), new OpeningHours("07:30", "19:00", "07:30", "19:00", "07:30", "19:00",
				"07:30", "19:00", "07:30", "19:00", "07:30", "14:00", "", ""), new AboutShop(0, 2)));
		shops.add(new Address(369, 51.20813, 6.95616, new Contact("Hochdahler Markt 17", "40699", "Erkrath",
				"02104 43974", "Edeka"), new OpeningHours("09:00", "20:00", "09:00", "20:00", "09:00", "20:00",
				"09:00", "20:00", "09:00", "20:00", "08:00", "16:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(370, 51.20078, 6.91291, new Contact("Neuenhausplatz 1", "40699", "Erkrath",
				"0211 9253896", "REWE"), new OpeningHours("07:30", "20:00", "07:30", "20:00", "07:30", "20:00",
				"07:30", "20:00", "07:30", "20:00", "07:30", "16:00", "08:00", "11:00"), new AboutShop(0, 0)));
		shops.add(new Address(371, 51.51783, 6.32311, new Contact("Issumer Straße 12", "47608", "Geldern",
				"02831 1321843", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "06:30", "15:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(372, 50.7945, 6.46852, new Contact("Am Ellernbusch 22", "52355", "Düren", "02421 67597",
				"real,-"), new OpeningHours("08:00", "21:00", "08:00", "21:00", "08:00", "21:00", "08:00", "21:00",
				"08:00", "21:00", "08:00", "21:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(373, 50.82456, 6.2522, new Contact("Auerbachstraße 10", "52249", "Eschweiler",
				"02403 502567", "real,-"), new OpeningHours("08:00", "22:00", "08:00", "22:00", "08:00", "22:00",
				"08:00", "22:00", "08:00", "22:00", "08:00", "22:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(374, 50.5547394, 6.2402356, new Contact("Industriestr. 8", "52156", "Monschau",
				"02472 6913", "real,-"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "18:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(375, 51.3317165, 6.6500224, new Contact("Hafelstraße 200", "47809", "Krefeld",
				"02151 541113", "real,-"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "16:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(376, 51.22801, 6.79013, new Contact("Am Wehrhahn 33", "40211", "Düsseldorf",
				"0211 161750", "Wehrhahn-Center"), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "18:30", "06:00", "16:00", "07:00", "12:00"), new AboutShop(0, 0)));
		shops.add(new Address(377, 51.2173542, 6.7767757, new Contact("Friedrichstraße 23", "40217", "Düsseldorf",
				"0211 372806", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "07:00", "14:30", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(378, 51.22392, 6.77247, new Contact("Hafenstraße 13", "40213", "Düsseldorf",
				"0211 2107691", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "16:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(379, 51.24112, 6.78705, new Contact("Eulerstraße 40", "40477", "Düsseldorf",
				"0211 4849929", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "13:00", "08:30", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(380, 51.22324, 6.77418, new Contact("Carlsplatz 14-15", "40213", "Düsseldorf",
				"0211 6021313", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "16:30", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(381, 51.21306, 6.76456, new Contact("Lorettostraße 43", "40219", "Düsseldorf",
				"0211 393498", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "13:00", "08:30", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(382, 51.24779, 6.69349, new Contact("Düsseldorfer Straße 62", "40667", "Meerbusch",
				"02132 758973", "Edeka"), new OpeningHours("06:30", "20:00", "06:30", "20:00", "06:30", "20:00",
				"06:30", "20:00", "06:30", "20:00", "06:30", "18:00", "08:00", "16:00"), new AboutShop(0, 1)));
		shops.add(new Address(383, 51.2163, 6.8027, new Contact("Bogenstraße 39", "40227", "Düsseldorf", "0211 727555",
				""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "13:00", "08:00", "12:00"), new AboutShop(0, 1)));
		shops.add(new Address(384, 51.1968, 6.4439, new Contact("Hindenburgstraße 170", "41061", "Mönchengladbach",
				"02161 22593", "Vitus-Center"), new OpeningHours("07:00", "19:00", "07:00", "19:00", "07:00", "19:00",
				"07:00", "19:00", "07:00", "19:00", "07:00", "16:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(385, 51.2241671, 6.7743453, new Contact("Mittelstraße 16", "40213", "Düsseldorf",
				"0211 8639469", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "18:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(387, 51.262503, 6.8135699, new Contact("Westfalenstraße 27", "40472", "Düsseldorf",
				"0211 651918", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "13:00", "08:30", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(388, 51.2383378, 6.8005959, new Contact("Rethelstraße 153", "40237", "Düsseldorf",
				"0211 661395", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "14:00", "08:30", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(389, 51.2590772, 6.6799988, new Contact("Moerser Straße 100", "40667", "Meerbusch",
				"02132 960119", ""), new OpeningHours("06:00", "15:00", "06:00", "15:00", "06:00", "15:00", "06:00",
				"15:00", "06:00", "15:00", "06:00", "13:00", "08:00", "12:00"), new AboutShop(0, 0)));
		shops.add(new Address(390, 51.22679, 6.80555, new Contact("Birkenstraße 85", "40233", "Düsseldorf",
				"0211 9660176", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "06:30", "13:00", "08:30", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(391, 51.21229, 6.77766, new Contact("Kirchfeldstraße 73", "40217", "Düsseldorf",
				"0211 3179794", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "07:00", "13:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(393, 51.20999, 6.77705, new Contact("Bachstraße 148", "40217", "Düsseldorf",
				"0211 332058", ""), new OpeningHours("06:00", "19:00", "06:00", "19:00", "06:00", "19:00", "06:00",
				"19:00", "06:00", "19:00", "06:00", "14:00", "08:00", "12:00"), new AboutShop(0, 1)));
		shops.add(new Address(394, 51.23982, 6.82394, new Contact("Grafenberger Allee 360", "40235", "Düsseldorf",
				"0211 6913861", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "06:30", "13:00", "08:30", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(395, 51.4497, 6.6831, new Contact("Moerser Straße 295", "47198", "Duisburg",
				"02066 34017", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "13:30", "06:00", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(396, 51.45034, 6.7063, new Contact("Augustastraße 22", "47198", "Duisburg", "02066 7233",
				"Kaiser's"), new OpeningHours("06:00", "18:00", "06:00", "18:00", "06:00", "18:00", "06:00", "18:00",
				"06:00", "18:00", "06:00", "13:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(397, 51.50114, 6.54932, new Contact("Friedrichstraße 13", "47475", "Kamp-Lintfort",
				"02842 10054", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "14:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(398, 51.45127, 6.62738,
				new Contact("Steinstraße 20", "47441", "Moers", "02841 28561", ""), new OpeningHours("07:30", "19:00",
						"07:30", "19:00", "07:30", "19:00", "07:30", "19:00", "07:30", "19:00", "06:30", "17:00",
						"08:00", "13:00"), new AboutShop(0, 0)));
		shops.add(new Address(399, 51.45007, 6.63453, new Contact("Homberger Straße 56", "47441", "Moers",
				"02841 18325", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "14:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(400, 51.33331, 6.56452, new Contact("Rheinstraße 92", "47798", "Krefeld", "02151 28181",
				""), new OpeningHours("08:00", "18:30", "08:00", "18:30", "08:00", "18:30", "08:00", "18:30", "08:00",
				"18:30", "08:00", "18:00", "08:00", "13:00"), new AboutShop(0, 0)));
		shops.add(new Address(401, 51.4100068, 6.717536, new Contact("Krefelder Straße 17", "47228", "Duisburg",
				"02065 50970", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "13:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(402, 51.35442, 6.64953, new Contact("Niederstraße 6", "47829", "Krefeld", "02151 46582",
				""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "13:30", "08:00", "11:30"), new AboutShop(0, 0)));
		shops.add(new Address(403, 51.4022149, 6.7613793, new Contact("Fischerstraße 93", "47055", "Duisburg",
				"0203 7391905", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "14:00", "08:00", "12:00"), new AboutShop(0, 0)));
		shops.add(new Address(404, 51.43407, 6.76185, new Contact("Münzstraße 18", "47051", "Duisburg", "0203 26767",
				""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "16:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(405, 51.23971, 6.79284, new Contact("Tußmannstraße 46", "40477", "Düsseldorf",
				"0211 5145691", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "16:00", "08:30", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(406, 51.2035, 6.7721, new Contact("Aachener Straße 70a", "40223", "Düsseldorf",
				"0211 3179920", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "13:30", "08:30", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(407, 50.961956, 6.121721, new Contact("Haihover Straße", "52511", "Geilenkirchen",
				"02451 911320", "toom"), new OpeningHours("08:00", "22:00", "08:00", "22:00", "08:00", "22:00",
				"08:00", "22:00", "08:00", "22:00", "08:00", "22:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(408, 50.75632, 6.14498, new Contact("Königsberger Straße 1", "52078", "Aachen",
				"0241 9127488", "REWE"), new OpeningHours("08:00", "22:00", "08:00", "22:00", "08:00", "22:00",
				"08:00", "22:00", "08:00", "22:00", "07:00", "22:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(409, 50.7021776, 6.4126301, new Contact("Nideggener Straße", "52393", "Hürtgenwald",
				"02429 902364", "REWE"), new OpeningHours("07:00", "22:00", "07:00", "22:00", "07:00", "22:00",
				"07:00", "22:00", "07:00", "22:00", "07:00", "22:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(410, 51.06528, 6.10488, new Contact("Industriestraße 14", "52525", "Heinsberg",
				"02452 106199", "toom"), new OpeningHours("08:00", "22:00", "08:00", "22:00", "08:00", "22:00",
				"08:00", "22:00", "08:00", "22:00", "08:00", "22:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(411, 50.69499, 6.48747, new Contact("Am Eisernen Kreuz 1", "52385", "Nideggen",
				"02427 904929", "REWE"), new OpeningHours("07:00", "21:00", "07:00", "21:00", "07:00", "21:00",
				"07:00", "21:00", "07:00", "21:00", "07:00", "21:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(412, 50.792451, 6.496395, new Contact("Zülpicher Straße", "52349", "Düren",
				"02421 408699", "REWE"), new OpeningHours("07:00", "22:00", "07:00", "22:00", "07:00", "22:00",
				"07:00", "22:00", "07:00", "22:00", "07:00", "22:00", "", ""), new AboutShop(0, 2)));
		shops.add(new Address(413, 51.32597, 6.56814, new Contact("Am Hauptbahnhof 2", "47798", "Krefeld",
				"02151 3621519", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "16:00", "08:00", "13:00"), new AboutShop(0, 1)));
		shops.add(new Address(414, 51.23735, 6.85927, new Contact("Benderstraße 3", "40625", "Düsseldorf",
				"0211 285069", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "13:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(415, 51.23768, 6.85358, new Contact("Benderstraße 69", "40625", "Düsseldorf",
				"0211 298282", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "13:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(416, 51.31804, 6.27722, new Contact("Niedieckstraße 167", "41334", "Nettetal",
				"02153 954241", "real,-"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "07:00", "16:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(417, 50.7732238, 6.2261292, new Contact("Rathausstraße 71-75", "52222", "Stolberg",
				"02402 865825", "REWE"), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "16:00", "", ""), new AboutShop(0, 2)));
		shops.add(new Address(418, 50.95412, 6.63714, new Contact("Am Jobberath 2", "50126", "Bergheim",
				"02271 497140", "HIT"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00",
				"20:00", "08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(419, 50.66819, 7.17831, new Contact("Drachenburgstr. 14", "53179", "Bonn", "0228 343648",
				"HIT"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(0, 2)));
		shops.add(new Address(420, 50.62503, 7.03863, new Contact("Neuer Markt 1", "53340", "Meckenheim",
				"02225 948013", "HIT"), new OpeningHours("07:30", "20:00", "07:30", "20:00", "07:30", "20:00", "07:30",
				"20:00", "07:30", "20:00", "07:00", "18:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(421, 50.81116, 7.12335, new Contact("Spicher Str. 101", "53844", "Troisdorf-Sieglar",
				"02241 408365", "HIT"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00",
				"20:00", "08:00", "22:00", "08:00", "19:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(422, 50.35757, 7.59104, new Contact("Hohenfelder Str. 22", "56068", "Koblenz",
				"0261 38542", "Löhr-Center"), new OpeningHours("07:30", "20:00", "07:30", "20:00", "07:30", "20:00",
				"07:30", "22:00", "07:30", "20:00", "07:30", "20:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(423, 50.63138, 7.22614, new Contact("Berck-sur-Mer-Str. 1", "53604", "Bad Honnef",
				"02224 76629", "HIT"), new OpeningHours("07:00", "19:00", "07:00", "19:00", "07:00", "19:00", "07:00",
				"19:00", "07:00", "19:00", "07:00", "14:00", "08:00", "11:00"), new AboutShop(0, 0)));
		shops.add(new Address(425, 50.79851, 7.05209, new Contact("Marktstraße 109", "53859", "Niederkassel-Rheidt",
				"02208 73129", "HIT"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00",
				"20:00", "08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(0, 2)));
		shops.add(new Address(426, 50.695465, 7.130059, new Contact("Am Klufterplatz", "53175", "Bonn", "0228 384406",
				"Edeka"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "16:00", "", ""), new AboutShop(0, 2)));
		shops.add(new Address(427, 50.54549, 7.10925, new Contact("Wilhelmstr. 50-52", "53474", "Bad Neuenahr",
				"02641 31438", "HIT"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00",
				"20:00", "08:00", "20:00", "08:00", "18:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(428, 50.88166, 7.07811, new Contact("Marienburger Str. 1", "51145", "Köln",
				"02203 26276", "HIT"), new OpeningHours("08:00", "21:00", "08:00", "21:00", "08:00", "21:00", "08:00",
				"21:00", "08:00", "21:00", "08:00", "21:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(429, 50.73375, 7.09754, new Contact("Poststraße 23", "53111", "Bonn", "0228 9653997",
				"Karstadt"), new OpeningHours("08:30", "20:00", "08:30", "20:00", "08:30", "20:00", "08:30", "20:00",
				"08:30", "20:00", "08:30", "20:00", "", ""), new AboutShop(0, 2)));
		shops.add(new Address(430, 50.9387, 6.90139, new Contact("Scheidtweiler Str. 83", "50933", "Köln",
				"0221 541566", "HIT"), new OpeningHours("08:00", "22:00", "08:00", "22:00", "08:00", "22:00", "08:00",
				"22:00", "08:00", "22:00", "08:00", "22:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(431, 50.7395318, 7.1208899, new Contact("Friedrich-Breuer-Str. 71", "53225", "Bonn",
				"0228 476679", ""), new OpeningHours("06:00", "18:00", "06:00", "18:00", "06:00", "18:00", "06:00",
				"18:00", "06:00", "18:00", "07:00", "14:00", "07:00", "12:00"), new AboutShop(0, 0)));
		shops.add(new Address(432, 50.75259, 7.05958, new Contact("Christian-Lassen-Straße 9", "53117", "Bonn",
				"0228 9678135", ""), new OpeningHours("05:00", "17:00", "05:00", "17:00", "05:00", "17:00", "05:00",
				"17:00", "05:00", "17:00", "05:00", "13:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(433, 50.43799, 7.40154, new Contact("Bahnhofstr. 21", "56626", "Andernach",
				"02632 948476", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "06:30", "13:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(434, 50.89149, 6.99029, new Contact("Ringstraße 2 b-c", "50996", "Köln", "0221 3981614",
				""), new OpeningHours("06:00", "19:00", "06:00", "19:00", "06:00", "19:00", "06:00", "19:00", "06:00",
				"19:00", "07:00", "15:00", "08:00", "13:00"), new AboutShop(0, 0)));
		shops.add(new Address(435, 50.62909, 6.94822, new Contact("Bahnhofstraße 39", "53359", "Rheinbach",
				"02226-808774", ""), new OpeningHours("05:00", "18:30", "05:00", "18:30", "05:00", "18:30", "05:00",
				"18:30", "05:00", "18:30", "05:00", "13:00", "08:00", "12:00"), new AboutShop(0, 1)));
		shops.add(new Address(436, 50.43842, 7.41693, new Contact("Koblenzer Str. 51", "56626", "Andernach",
				"02632 495291", "EKZ Kaufwelt"), new OpeningHours("06:30", "20:00", "06:30", "20:00", "06:30", "20:00",
				"06:30", "20:00", "06:30", "20:00", "06:30", "18:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(437, 50.7943, 7.20319, new Contact("Europaplatz 3", "53721", "Siegburg", "02241 1487095",
				"Bahnhof"), new OpeningHours("06:00", "20:00", "06:00", "20:00", "06:00", "20:00", "06:00", "20:00",
				"06:00", "20:00", "06:00", "18:00", "08:00", "13:00"), new AboutShop(0, 1)));
		shops.add(new Address(438, 50.70241, 7.09491, new Contact("Haager Weg 28a", "53127", "Bonn", "0228 2806642",
				"Kaiser's"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(439, 50.8082379, 6.979282, new Contact("Eichholzer Straße 84 a", "50389", "Wesseling",
				"02236 327516", "Kaiser's"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(0, 2)));
		shops.add(new Address(440, 50.77723, 7.1886, new Contact("Rathausallee 16", "53757", "St. Augustin",
				"02241 203285", "HUMA"), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00",
				"07:00", "22:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(441, 50.80117, 7.20596, new Contact("Kaiserstr. 92", "53721", "Siegburg", "02241 971199",
				""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "16:00", "06:00", "12:00"), new AboutShop(0, 1)));
		shops.add(new Address(442, 50.77362, 7.28814, new Contact("Frankfurter Str. 68", "53773", "Hennef/Sieg",
				"02242 914069", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "06:30", "13:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(443, 50.65788, 6.7913, new Contact("Oststr. 2 a", "53879", "Euskirchen", "02251 970155",
				"Bahnhof"), new OpeningHours("05:00", "18:30", "05:00", "18:30", "05:00", "18:30", "05:00", "18:30",
				"05:00", "18:30", "07:00", "12:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(444, 50.870961, 6.868111, new Contact("Hürth-Park L005", "50354", "Hürth",
				"02233 9399262", "EKZ Hürth"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(445, 50.82271, 6.97885, new Contact("Westring 10 - 15", "50389", "Wesseling",
				"02236 942591", "Neukauf"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "18:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(446, 50.93058, 7.04706, new Contact("Servatiusstraße 1", "51109", "Köln", "0221 8291989",
				""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:00", "13:00", "08:30", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(447, 50.904346, 7.071667, new Contact("Rudolf-Diesel-Straße 155", "51149", "Köln",
				"02203 371654", "real,-"), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(0, 2)));
		shops.add(new Address(448, 50.93818, 6.76803, new Contact("Friedrich-Ebert-Straße 44", "50226", "Frechen",
				"02234 64101", ""), new OpeningHours("06:00", "18:00", "06:00", "18:00", "06:00", "18:00", "06:00",
				"18:00", "06:00", "18:00", "06:30", "13:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(449, 50.91376, 7.19724, new Contact("Hauptstraße 248", "51503", "Rösrath-Hoffnungsthal",
				"02205 912114", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "13:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(450, 50.937554, 6.835341, new Contact("Aachener Straße 1253", "50858", "Köln",
				"02234 47963", "Rhein-Center Köln"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00",
				"20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "18:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(451, 50.7367, 7.09662, new Contact("Sterntorbrücke 17", "53111", "Bonn", "0228-9086868",
				""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "08:00", "13:00", "08:30", "16:00"), new AboutShop(0, 1)));
		shops.add(new Address(453, 50.7235, 7.08949, new Contact("Clemens-August-Str.20-22", "53115", "Bonn",
				"0228 655076", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "14:00", "06:00", "13:00"), new AboutShop(0, 0)));
		shops.add(new Address(454, 50.6818748, 7.0739103, new Contact("Am Kurfürstenplatz 4", "53125", "Bonn",
				"0228 259288", ""), new OpeningHours("07:00", "18:00", "07:00", "18:00", "07:00", "18:00", "07:00",
				"18:00", "07:00", "18:00", "07:00", "12:00", "07:00", "12:00"), new AboutShop(0, 1)));
		shops.add(new Address(455, 50.7415514, 7.1014992, new Contact("Vorgebirgstraße 43", "53111", "Bonn",
				"0228 697408", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:00", "07:00", "13:00", "08:00", "12:00"), new AboutShop(0, 0)));
		shops.add(new Address(456, 50.70501, 7.11182, new Contact("Hausdorffstrasse 341", "53129", "Bonn",
				"0228 239839", ""), new OpeningHours("06:30", "18:00", "06:30", "18:00", "06:30", "18:00", "06:30",
				"18:00", "06:30", "18:00", "06:30", "13:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(457, 50.71263, 7.10902, new Contact("Pützstraße 36", "53129", "Bonn", "0228 230455", ""),
				new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
						"18:30", "06:30", "13:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(458, 50.6786911, 7.1660313, new Contact("Koblenzer Str. 51a", "53177", "Bonn",
				"0228 365364", ""), new OpeningHours("07:00", "19:30", "07:00", "19:30", "07:00", "19:30", "07:00",
				"19:30", "07:00", "19:30", "07:00", "16:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(459, 50.73221, 7.10039,
				new Contact("Kaiserplatz 18", "53113", "Bonn", "0228 694559", ""), new OpeningHours("07:00", "18:30",
						"07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "08:00", "14:00", "",
						""), new AboutShop(0, 1)));
		shops.add(new Address(460, 50.7390642, 7.1170165, new Contact("Konrad-Adenauer-Platz 12", "53225", "Bonn",
				"0228 462705", ""), new OpeningHours("06:30", "20:00", "06:30", "20:00", "06:30", "20:00", "06:30",
				"20:00", "06:30", "20:00", "06:30", "14:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(461, 50.6843, 7.15219, new Contact("Michaelplatz 1", "53177", "Bonn", "0228 357865",
				"REWE"), new OpeningHours("09:00", "20:00", "09:00", "20:00", "09:00", "20:00", "09:00", "20:00",
				"09:00", "20:00", "08:30", "18:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(462, 50.9365716, 6.9588607, new Contact("Gürzenich 24", "50667", "Köln", "0221 2582301",
				""), new OpeningHours("07:00", "19:00", "07:00", "19:00", "07:00", "19:00", "07:00", "19:00", "07:00",
				"19:00", "07:00", "16:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(463, 50.970507, 7.0471664, new Contact("Bergisch Gladbacher Str. 595", "51067", "Köln",
				"0221 2977611", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "06:30", "14:00", "08:30", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(464, 50.92946, 7.04173, new Contact("Rösrather Straße 2-16", "51107", "Köln",
				"0221 3105018", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "06:30", "15:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(465, 50.8681948, 7.1238985, new Contact("Waldstraße 247, Terminal 1", "51147", "Köln",
				"02203-9803500", "Flughafen/ Abflugebene"), new OpeningHours("04:00", "22:00", "04:00", "22:00",
				"04:00", "22:00", "04:00", "22:00", "04:00", "22:00", "04:00", "22:00", "04:00", "22:00"),
				new AboutShop(5, 0)));
		shops.add(new Address(466, 50.54647, 7.14039, new Contact("Rathausstraße 1", "53474", "Bad Neuenahr",
				"02641 903247", ""), new OpeningHours("06:30", "20:00", "06:30", "20:00", "06:30", "20:00", "06:30",
				"20:00", "06:30", "20:00", "06:30", "18:00", "10:00", "17:00"), new AboutShop(0, 0)));
		shops.add(new Address(467, 50.70795, 7.11601, new Contact("Karl-Barth-Straße 92", "53129", "Bonn",
				"0228 4295117", "Kaiser's"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "18:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(468, 50.8681948, 7.1238985, new Contact("Waldstrasse 247, Terminal D", "51147", "Köln",
				"0178 2082680", "Flughafen"), new OpeningHours("06:30", "21:00", "06:30", "21:00", "06:30", "21:00",
				"06:30", "21:00", "06:30", "21:00", "05:30", "21:00", "05:30", "21:00"), new AboutShop(0, 1)));
		shops.add(new Address(469, 50.9414, 6.96079, new Contact("Trankgasse 11", "50667", "Köln", "0221 47357-10",
				"Bahnhof"), new OpeningHours("05:30", "24:00", "05:30", "24:00", "05:30", "24:00", "05:30", "24:00",
				"05:30", "24:00", "05:30", "24:00", "05:30", "24:00"), new AboutShop(0, 0)));
		shops.add(new Address(470, 50.7391246, 7.1197523, new Contact("Friedrich-Breuer-Straße 56-58", "53225", "Bonn",
				"0228 1844710", "Kaiser's"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(471, 50.93679, 6.94009,
				new Contact("Rudolfplatz 4", "50674", "Köln", "0221 9255189", ""), new OpeningHours("06:30", "20:00",
						"06:30", "20:00", "06:30", "20:00", "06:30", "20:00", "06:30", "20:00", "09:00", "16:00",
						"08:00", "14:00"), new AboutShop(0, 1)));
		shops.add(new Address(473, 50.9595, 7.00868, new Contact("Frankfurter Straße 55", "51065", "Köln",
				"0221 6160036", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "06:30", "13:30", "08:30", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(474, 50.96255, 6.95439, new Contact("Neusser Straße 232", "50733", "Köln",
				"0221 7329795", ""), new OpeningHours("05:30", "18:30", "05:30", "18:30", "05:30", "18:30", "05:30",
				"18:30", "05:30", "18:30", "05:30", "16:00", "07:00", "14:00"), new AboutShop(0, 0)));
		shops.add(new Address(475, 50.9643, 7.16229, new Contact("Schloßstraße 79", "51429", "Bergisch Gladbach",
				"02204 911610", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "14:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(476, 50.97567, 7.0734, new Contact("Dellbrücker Hauptstraße 89", "51069", "Köln",
				"0221 6897508", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "06:30", "13:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(477, 50.94795, 7.21518, new Contact("Olper Str. 14-16", "51491", "Overath",
				"02204 73062", "HIT"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00",
				"20:00", "08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(478, 50.92249, 6.92198, new Contact("Zülpicher Straße 288", "50937", "Köln",
				"0221 4201209", ""), new OpeningHours("06:30", "19:00", "06:30", "19:00", "06:30", "19:00", "06:30",
				"19:00", "06:30", "19:00", "06:30", "14:00", "08:30", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(479, 51.02029, 6.89823, new Contact("Londoner Platz 1-5", "50765", "Köln",
				"0221 7089195", ""), new OpeningHours("06:00", "19:00", "06:00", "19:00", "06:00", "19:00", "06:00",
				"19:00", "06:00", "19:00", "07:00", "14:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(480, 50.9576557, 7.1155493, new Contact("Siebenmorgen 39", "51427", "Bergisch Gladbach",
				"02204 67779", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "14:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(482, 50.92739, 6.8655, new Contact("Wiener Platz 1", "51065", "Köln", "0221 6202634",
				"Galerie Wiener Platz"), new OpeningHours("06:30", "19:30", "06:30", "19:30", "06:30", "19:30",
				"06:30", "19:30", "06:30", "19:30", "06:30", "16:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(483, 50.94234, 7.08383, new Contact("Brücker Mauspfad 465", "51109", "Köln",
				"0221 9842840", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "13:00", "06:30", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(484, 50.9275541, 6.9576175, new Contact("Severinstraße 141", "50678", "Köln",
				"0221 9327569", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "06:30", "16:00", "07:00", "12:00"), new AboutShop(0, 1)));
		shops.add(new Address(485, 50.93488, 6.93884, new Contact("Habsburger Ring 1", "50674", "Köln", "0221 212764",
				""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "14:00", "08:30", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(487, 50.95071, 6.928, new Contact("Gutenbergstr. 102", "50823", "Köln", "0221 5894304",
				""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "14:00", "09:00", "12:00"), new AboutShop(0, 1)));
		shops.add(new Address(488, 50.94439, 6.94283, new Contact("Christophstraße 43", "50670", "Köln", "0221 132458",
				""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "07:00", "14:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(489, 50.93118, 6.94033, new Contact("Hohenstaufenring 23", "50674", "Köln",
				"0221 2403391", ""), new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
				"18:30", "06:00", "18:30", "06:00", "14:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(490, 50.9383, 6.94219,
				new Contact("Ehrenstraße 49", "50672", "Köln", "0221 2573868", ""), new OpeningHours("07:00", "18:30",
						"07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00", "18:00",
						"09:00", "13:00"), new AboutShop(0, 1)));
		shops.add(new Address(491, 50.93084, 6.91719, new Contact("Dürener Straße  140", "50931", "Köln",
				"0221 4061584", ""), new OpeningHours("06:30", "19:00", "06:30", "19:00", "06:30", "19:00", "06:30",
				"19:00", "06:30", "19:00", "07:00", "19:00", "07:00", "12:00"), new AboutShop(0, 1)));
		shops.add(new Address(492, 50.96712, 6.95343, new Contact("Neusser Straße  334", "50733", "Köln",
				"0221 769500", "Plus"), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "06:30", "14:00", "08:00", "11:00"), new AboutShop(0, 2)));
		shops.add(new Address(493, 50.94187, 6.93584, new Contact("Venloer Straße 25", "50672", "Köln", "0221 9523076",
				""), new OpeningHours("06:30", "20:00", "06:30", "20:00", "06:30", "20:00", "06:30", "20:00", "06:30",
				"20:00", "06:30", "14:00", "08:00", "13:00"), new AboutShop(0, 0)));
		shops.add(new Address(494, 50.92865, 6.91149, new Contact("Dürener Straße  226", "50931", "Köln",
				"0221 96439664", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "14:00", "08:00", "13:00"), new AboutShop(0, 1)));
		shops.add(new Address(495, 50.94519, 6.91321, new Contact("Melatengürtel 82", "50823", "Köln", "0221 5107310",
				""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "14:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(496, 50.94292, 6.95515, new Contact("An den Dominikanern 2", "50668", "Köln",
				"0221 123241", ""), new OpeningHours("06:30", "18:00", "06:30", "18:00", "06:30", "18:00", "06:30",
				"18:00", "06:30", "18:00", "", "", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(497, 50.9817673, 7.0249436, new Contact("Berliner Straße 368", "51061", "Köln",
				"0221 646875", ""), new OpeningHours("05:00", "16:00", "05:00", "16:00", "05:00", "16:00", "05:00",
				"16:00", "05:00", "16:00", "06:00", "12:00", "06:00", "12:00"), new AboutShop(0, 1)));
		shops.add(new Address(498, 50.97239, 7.01109, new Contact("Berliner Straße 54", "51063", "Köln", "0221 627073",
				""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:00", "14:00", "08:30", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(500, 50.94429, 6.943, new Contact("Christophstraße 39", "50670", "Köln", "0221 136852",
				""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "07:00", "13:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(501, 50.94904, 6.95304, new Contact("Hansaring 74", "50670", "Köln", "0221 133322", ""),
				new OpeningHours("06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00", "18:30", "06:00",
						"18:30", "07:00", "16:00", "07:30", "12:30"), new AboutShop(0, 1)));
		shops.add(new Address(502, 50.93974, 6.94017, new Contact("Hohenzollernring 54", "50672", "Köln",
				"0221 2582563", ""), new OpeningHours("06:30", "19:00", "06:30", "19:00", "06:30", "19:00", "06:30",
				"19:00", "06:30", "19:00", "07:00", "18:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(503, 51.0217583, 6.896664, new Contact("Mailänder Passage 36", "50765", "Köln",
				"0221 7088604", "City-Center Köln-Chorweiler"), new OpeningHours("08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(504, 50.9531, 6.95719, new Contact("Neusser Straße 42", "50670", "Köln", "0221 737281",
				""), new OpeningHours("06:00", "19:30", "06:00", "19:30", "06:00", "19:30", "06:00", "19:30", "06:00",
				"19:30", "06:30", "15:00", "07:00", "14:00"), new AboutShop(0, 1)));
		shops.add(new Address(505, 50.9630735, 6.9539571, new Contact("Neusser Straße 249", "50733", "Köln",
				"0221 732419", ""), new OpeningHours("06:00", "19:00", "06:00", "19:00", "06:00", "19:00", "06:00",
				"19:00", "06:00", "19:00", "06:00", "16:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(506, 50.9849, 6.94663, new Contact("Neusser Straße 647", "50737", "Köln", "0221 744047",
				""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "13:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(507, 50.96941, 6.93296, new Contact("Schiefersburger Weg 32-40", "50739", "Köln",
				"0221 173696", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "06:30", "13:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(509, 50.95473, 6.90952, new Contact("Venloer Straße 474", "50825", "Köln",
				"0221 5506249", "Plus"), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "18:00", "08:30", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(510, 50.9552, 6.88142, new Contact("Vogelsanger Markt 4", "50829", "Köln", "0221 586968",
				""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "13:00", "08:30", "11:30"), new AboutShop(0, 1)));
		shops.add(new Address(511, 50.96108, 7.00542,
				new Contact("Wiener Platz 4", "51065", "Köln", "0221 616371", ""), new OpeningHours("06:30", "18:30",
						"06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30", "17:00", "",
						""), new AboutShop(0, 1)));
		shops.add(new Address(512, 50.8790025, 6.874165, new Contact("Theresienhöhe 42", "50354", "Hürth",
				"02233 205606", "real,-"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "22:00", "08:00", "22:00", "08:00", "20:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(513, 50.92339, 6.81767, new Contact("Zedernweg 3", "50226", "Frechen", "02234 2028858",
				"Lidl"), new OpeningHours("06:00", "20:00", "06:00", "20:00", "06:00", "20:00", "06:00", "20:00",
				"06:00", "20:00", "06:00", "20:00", "08:00", "11:00"), new AboutShop(0, 1)));
		shops.add(new Address(514, 50.7672979, 7.1950576, new Contact("Alte Heerstraße 53", "53757", "St. Augustin",
				"02241 8445 950", "HIT"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "22:00", "08:00", "20:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(515, 50.93896, 6.94977, new Contact("Breite Straße 80-90", "50667", "Köln",
				"0221 258 79686", "DuMont-Carré"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00",
				"20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(516, 50.7649033, 6.2324499, new Contact("Zweifaller Straße 30", "52222", "Stolberg",
				"02402 1021935", ""), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00",
				"20:00", "08:00", "20:00", "08:00", "17:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(517, 50.77341, 7.44741, new Contact("Bahnhofstraße 32", "53783", "Eitorf",
				"02243 8473190", "Bahnhof"), new OpeningHours("05:30", "18:00", "05:30", "18:00", "05:30", "18:00",
				"05:30", "18:00", "05:30", "18:00", "08:00", "16:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(518, 50.80935, 7.19241, new Contact("Luisenstraße 129-131", "53721", "Siegburg",
				"02241-1270622", "Tankstelle"), new OpeningHours("05:00", "20:00", "05:00", "20:00", "05:00", "20:00",
				"05:00", "20:00", "05:00", "20:00", "05:00", "20:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(519, 50.98853, 6.574459, new Contact("Bahnstraße 15", "50181", "Bedburg",
				"02272 9067 871", "real,-"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "22:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(520, 50.82103, 6.48619, new Contact("Heerweg 99", "52353", "Düren", "02421 2064841",
				"real,-"), new OpeningHours("08:00", "22:00", "08:00", "22:00", "08:00", "22:00", "08:00", "22:00",
				"08:00", "22:00", "08:00", "22:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(521, 51.2088783, 6.7764733, new Contact("Friedrichstraße 129 - 133", "40217",
				"Düsseldorf", "0211 99459075", "Düsseldorf Arcaden"), new OpeningHours("08:00", "20:00", "08:00",
				"20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "21:30", "", ""),
				new AboutShop(0, 0)));
		shops.add(new Address(522, 50.68378, 7.15928, new Contact("Moltkestraße 43", "53173", "Bonn Bad Godesberg",
				"0228 93490140", "Bahnhof"), new OpeningHours("00:00", "00:00", "00:00", "00:00", "00:00", "00:00",
				"00:00", "00:00", "00:00", "00:00", "00:00", "00:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(523, 50.53839, 6.55655, new Contact("Bahnhofstraße 13", "53925", "Kall", "02441 771198",
				""), new OpeningHours("05:00", "19:00", "05:00", "19:00", "05:00", "19:00", "05:00", "19:00", "05:00",
				"19:00", "06:00", "15:00", "07:00", "12:00"), new AboutShop(0, 0)));
		shops.add(new Address(524, 51.2402008, 6.7930163, new Contact("Tußmannstraße 55-61", "40477", "Düsseldorf",
				"0211 20960360", "REWE"), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(525, 50.7373498, 7.1025449, new Contact("Berta-von-Suttner-Platz 8", "53111", "Bonn",
				"0228 - 94589907", ""), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00",
				"20:00", "07:00", "20:00", "08:00", "18:00", "", ""), new AboutShop(0, 3)));
		shops.add(new Address(526, 50.749901, 6.8495, new Contact("Bonner Straße", "53919", "Weilerswist",
				"02254 8360442", "Fachmarktzentrum"), new OpeningHours("06:00", "19:00", "06:00", "19:00", "06:00",
				"19:00", "06:00", "19:00", "06:00", "19:00", "06:00", "16:00", "", ""), new AboutShop(0, 3)));
		shops.add(new Address(527, 50.92145, 6.85332, new Contact("Max-Planck-Straße 9", "50858", "Köln",
				"02234 9679500", "Globus"), new OpeningHours("08:00", "21:00", "08:00", "21:00", "08:00", "21:00",
				"08:00", "22:00", "08:00", "22:00", "08:00", "22:00", "", ""), new AboutShop(0, 2)));
		shops.add(new Address(528, 50.79711, 7.20681,
				new Contact("Markt 11", "53721", "Siegburg", "02241 1278240", ""), new OpeningHours("08:00", "19:00",
						"08:00", "19:00", "08:00", "19:00", "08:00", "19:00", "08:00", "19:00", "08:00", "19:00",
						"08:00", "17:00"), new AboutShop(0, 0)));
		shops.add(new Address(529, 50.7388333, 7.1162053, new Contact("Hermannstraße 2", "53225", "Bonn",
				"(02 28) 94 69 48 03", "Kaiser's"), new OpeningHours("06:30", "21:00", "06:30", "21:00", "06:30",
				"21:00", "06:30", "21:00", "06:30", "21:00", "06:30", "21:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(530, 51.3554, 6.64917, new Contact("Niederstraße 30", "47829", "Krefeld",
				"02151 5130752", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "13:00", "11:00", "16:00"), new AboutShop(0, 0)));
		shops.add(new Address(531, 51.45717, 6.88567, new Contact("Heifeskamp 6", "45475", "Mülheim a. d. Ruhr",
				"0208 5944690", "real,-"), new OpeningHours("07:00", "22:00", "07:00", "22:00", "07:00", "22:00",
				"07:00", "22:00", "07:00", "22:00", "07:00", "22:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(532, 51.68434, 6.16051, new Contact("Kleverstraße 20-22", "47574", "Goch",
				"02823 4190839", "REWE"), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "08:00", "11:00"), new AboutShop(0, 0)));
		shops.add(new Address(533, 51.10834, 6.57828, new Contact("Am Rittergut 1", "41515", "Grevenbroich",
				"02181 2132999", "real,-"), new OpeningHours("08:00", "21:00", "08:00", "21:00", "08:00", "21:00",
				"08:00", "22:00", "08:00", "22:00", "08:00", "22:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(534, 51.22042, 6.79304, new Contact("Konrad-Adenauer-Platz 14", "40210", "Düsseldorf",
				"0211 16098938", "Bahnhof"), new OpeningHours("05:00", "22:00", "05:00", "22:00", "05:00", "22:00",
				"05:00", "22:00", "05:00", "22:00", "05:00", "22:00", "05:00", "22:00"), new AboutShop(0, 0)));
		shops.add(new Address(535, 51.2285975, 6.8189918, new Contact("Bruchstraße 89-91", "40235", "Düsseldorf",
				"0211 22960772", "REWE Markt"), new OpeningHours("07:00", "22:00", "07:00", "22:00", "07:00", "22:00",
				"07:00", "22:00", "07:00", "22:00", "07:00", "22:00", "07:00", "12:00"), new AboutShop(0, 2)));
		shops.add(new Address(536, 51.33236, 6.56226, new Contact("Hochstraße 114", "47798", "Krefeld",
				"02151 5659 797", "SchwanenMarkt"), new OpeningHours("08:00", "19:00", "08:00", "19:00", "08:00",
				"19:00", "08:00", "19:00", "08:00", "19:00", "08:00", "19:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(538, 51.2627337, 6.8136448, new Contact("Westfalenstraße 24", "40472", "Düsseldorf",
				"0211 65859033", "REWE"), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(539, 51.22042, 6.79304, new Contact("Konrad-Adenauer-Platz 14", "40210", "Düsseldorf",
				"0211 55047786", "Bahnhof"), new OpeningHours("06:00", "19:00", "06:00", "19:00", "06:00", "19:00",
				"06:00", "19:00", "06:00", "19:00", "", "", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(540, 50.54482, 7.13734, new Contact("Poststraße 14", "53474", "Bad Neuenahr",
				"02641 2069392", ""), new OpeningHours("08:00", "19:00", "08:00", "19:00", "08:00", "19:00", "08:00",
				"19:00", "08:00", "19:00", "08:00", "16:00", "09:00", "17:00"), new AboutShop(0, 3)));
		shops.add(new Address(541, 51.2198138, 6.8078167, new Contact("Werdener Straße 87", "40233", "Düsseldorf",
				"0211 16756251", "B8 Center Flingern"), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00",
				"20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "08:00", "16:00"), new AboutShop(0, 3)));
		shops.add(new Address(542, 51.227597, 6.811651, new Contact("Dorotheenstraße 80", "40235", "Düsseldorf",
				"0211 73284866", ""), new OpeningHours("06:00", "20:00", "06:00", "20:00", "06:00", "20:00", "06:00",
				"20:00", "06:00", "20:00", "06:00", "18:00", "08:00", "16:00"), new AboutShop(0, 0)));
		shops.add(new Address(543, 51.4315473, 6.9274349, new Contact("Humboldtring 13, RheinRuhrZentrum", "45472",
				"Mülheim an der Ruhr", "0208 7822727", "RheinRuhrZentrum"), new OpeningHours("00:00", "00:00", "00:00",
				"00:00", "00:00", "00:00", "00:00", "00:00", "00:00", "00:00", "00:00", "00:00", "", ""),
				new AboutShop(0, 0)));
		shops.add(new Address(544, 50.21716, 8.26287, new Contact("Wiesbadener Straße 58", "65510", "Idstein",
				"06126 - 5058766", "HIT"), new OpeningHours("08:00", "21:00", "08:00", "21:00", "08:00", "21:00",
				"08:00", "21:00", "08:00", "21:00", "08:00", "21:00", "08:00", "11:00"), new AboutShop(0, 0)));
		shops.add(new Address(545, 50.54159, 7.09625, new Contact("Ahrhutstraße 29-31", "53474", "Bad Neuenahr",
				"02641 2068869", ""), new OpeningHours("08:00", "19:00", "08:00", "19:00", "08:00", "19:00", "08:00",
				"19:00", "08:00", "19:00", "08:00", "18:00", "09:00", "18:00"), new AboutShop(0, 3)));
		shops.add(new Address(546, 51.2371761, 6.8548443, new Contact("Benderstraße 52 - 54", "40625", "Düsseldorf",
				"0211 22959400", "Kaiser's"), new OpeningHours("", "", "", "", "", "", "", "", "", "", "", "", "", ""),
				new AboutShop(0, 1)));
		shops.add(new Address(547, 51.1629, 6.4408, new Contact("Bahnhofstraße 66", "41236", "Mönchengladbach-Rheydt",
				"02166 9906204", "Bahnhof"), new OpeningHours("", "", "", "", "", "", "", "", "", "", "", "", "", ""),
				new AboutShop(0, 0)));
		shops.add(new Address(548, 48.78304, 9.18017, new Contact("Arnulf-Klett-Platz 1", "70173", "Stuttgart",
				"0711 1872111", "Hauptbahnhof Arnulf-Klett-Passage"), new OpeningHours("05:00", "20:45", "05:00",
				"20:45", "05:00", "20:45", "05:00", "20:45", "05:00", "20:45", "05:00", "20:45", "05:00", "20:45"),
				new AboutShop(5, 1)));
		shops.add(new Address(550, 53.55354, 10.00723, new Contact(" Hachmannplatz 10", "20099", "Hamburg",
				"040 30297251", "Hamburg-Hauptbahnhof "), new OpeningHours("00:00", "24:00", "00:00", "24:00", "00:00",
				"24:00", "00:00", "24:00", "00:00", "24:00", "00:00", "24:00", "00:00", "24:00"), new AboutShop(5, 0)));
		shops.add(new Address(552, 52.374478, 9.738732, new Contact("Niki-de-Saint-Phalle-Promenade 2F-3B", "30159",
				"Hannover", "0511 12312911", ""), new OpeningHours("06:00", "21:00", "06:00", "21:00", "06:00",
				"21:00", "06:00", "21:00", "06:00", "21:00", "06:00", "20:00", "10:00", "17:00"), new AboutShop(5, 3)));
		shops.add(new Address(553, 52.51998, 13.41475, new Contact(" Gruner Straße. 20", "10179", "Berlin",
				"030 25762 745", "ALEXA - Einkaufszentrum "), new OpeningHours("08:00", "21:00", "08:00", "21:00",
				"08:00", "21:00", "08:00", "21:00", "08:00", "21:00", "08:00", "21:00", "", ""), new AboutShop(5, 0)));
		shops.add(new Address(554, 50.3955, 7.53624, new Contact("Industriestrasse 4", "56218", "Mülheim-Kärlich",
				"0261 29179798", "real,-"), new OpeningHours("08:00", "20:00", "08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(555, 51.1611936, 7.0036955, new Contact("Bahnstraße 5", "42697", "Solingen-Ohligs", "",
				"Hauptbahnhof"), new OpeningHours("05:00", "20:00", "05:00", "20:00", "05:00", "20:00", "05:00",
				"20:00", "05:00", "20:00", "05:00", "20:00", "07:00", "20:00"), new AboutShop(0, 0)));
		shops.add(new Address(556, 51.228003, 6.7901614, new Contact("Am Wehrhahn 33", "40211", "Düsseldorf",
				"0211 16 17 50", "Kaiser`s"), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "12:00"), new AboutShop(0, 0)));
		shops.add(new Address(557, 51.2190085, 6.7810835, new Contact("Graf-Adolf-Strasse 22", "40212", "Düsseldorf",
				"02 11 86 39 93 61", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30",
				"06:30", "18:30", "06:30", "18:30", "06:30", "14:00", "", ""), new AboutShop(0, 3)));
		shops.add(new Address(558, 51.432444, 6.8462693, new Contact("Weseler Straße 30 - 40", "45478",
				"Mülheim a.d. Ruhr", "0208 53983", "real,-"), new OpeningHours("08:00", "20:00", "08:00", "20:00",
				"08:00", "20:00", "08:00", "20:00", "08:00", "20:00", "08:00", "22:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(559, 50.71037, 7.12813, new Contact("Friedrich-Ebert-Allee 63", "53113", "Bonn",
				"0228 85466561", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "12:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(560, 51.2213125, 6.9073473, new Contact("Bongardstr. 1", "40699", "Alt-Erkrath",
				"0211 30147824", "Bavier-Center"), new OpeningHours("07:00", "21:00", "07:00", "21:00", "07:00",
				"21:00", "07:00", "21:00", "07:00", "21:00", "07:00", "21:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(561, 51.238137, 6.7993786, new Contact("Rethelstraße 135-137", "40237", "Düsseldorf",
				"0211 65859022", "REWE"), new OpeningHours("07:00", "21:00", "07:00", "21:00", "07:00", "21:00",
				"07:00", "21:00", "07:00", "21:00", "07:00", "21:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(562, 51.2928346, 7.2862577, new Contact("Talstr. 9", "58332", "Schwelm", "02336 4084848",
				"OBI"), new OpeningHours("07:00", "20:00", "07:00", "20:00", "07:00", "20:00", "07:00", "20:00",
				"07:00", "20:00", "07:00", "20:00", "", ""), new AboutShop(0, 0)));
		shops.add(new Address(563, 50.9544908, 6.9215478, new Contact("Ehrenfeldgürtel 140", "50823", "Köln",
				"0221 17099156", ""), new OpeningHours("06:30", "18:30", "06:30", "18:30", "06:30", "18:30", "06:30",
				"18:30", "06:30", "18:30", "07:00", "13:00", "08:00", "12:00"), new AboutShop(0, 0)));
		shops.add(new Address(564, 50.96126, 6.1243015, new Contact("Bahnhofstr. 25-27", "52511", "Geilenkirchen",
				"02451 4823882", "Bahnhof"), new OpeningHours("05:00", "19:00", "05:00", "19:00", "05:00", "19:00",
				"05:00", "19:00", "05:00", "19:00", "06:00", "14:00", "", ""), new AboutShop(0, 1)));
		shops.add(new Address(565, 51.36147, 6.94632, new Contact("Güterstr. 34", "45219", "Essen", "02054 1047555",
				"Kaiser`s"), new OpeningHours("07:00", "22:00", "07:00", "22:00", "07:00", "22:00", "07:00", "22:00",
				"07:00", "22:00", "07:00", "22:00", "08:00", "12:00"), new AboutShop(0, 0)));
		shops.add(new Address(566, 51.1694968, 7.0821131, new Contact("Kölner Str. 73 - 75", "42651", "Solingen",
				"0212 64546970", ""), new OpeningHours("07:00", "18:30", "07:00", "18:30", "07:00", "18:30", "07:00",
				"18:30", "07:00", "18:30", "07:00", "16:00", "08:00", "11:00"), new AboutShop(0, 0)));
	}

	public List<Address> getShops() {
		return shops;
	}
}
