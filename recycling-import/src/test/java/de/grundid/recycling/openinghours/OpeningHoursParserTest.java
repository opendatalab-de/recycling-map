package de.grundid.recycling.openinghours;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;

import org.junit.Ignore;
import org.junit.Test;

import de.gonam.api.openinghours.DayOfWeek;
import de.gonam.api.openinghours.TimeInterval;
import de.gonam.api.openinghours.WeeklyTimeInterval;

public class OpeningHoursParserTest {

	private OpeningHoursParser parser = new OpeningHoursParser();

	@Test
	@Ignore
	public void testParse5() throws Exception {
		String pattern = "Nov - Feb: Sa 13:00-15:00; Mar - Oct: Sa 12:00-15:00";
		List<WeeklyTimeInterval> result = parser.parse(pattern);
		assertNotNull(result);
	}

	@Test
	public void testParse1() throws Exception {
		String pattern = "Th 16.00 - 19.00  ;Fr 15.00 - 18.00  ;Sa 09.00 - 12 ";
		List<WeeklyTimeInterval> result = parser.parse(pattern);
		assertNotNull(result);
	}

	@Test
	public void testParse4() throws Exception {
		String pattern = "Mo-We,Fr 8:00-16:00; Th 8:00-18:00; Sa 08:30-13:30";
		List<WeeklyTimeInterval> result = parser.parse(pattern);
		assertNotNull(result);
	}

	@Test
	public void testParse2() throws Exception {
		String pattern = "Apr-Sep;We 16.30 - 19.00 ;Oct-Mar;We 14.30 - 16.30 ;Ganzjährig ;Sa 09.00 - 13.00 ";
		List<WeeklyTimeInterval> result = parser.parse(pattern);
		assertEquals(2, result.size());
	}

	private String toString(List<WeeklyTimeInterval> result) {
		String data = "";
		for (WeeklyTimeInterval weeklyTimeInterval : result) {
			data += " - " + weeklyTimeInterval.toString();
		}
		return data;
	}

	@Test
	public void testParse3() throws Exception {
		String pattern = "Mo - Fr 7.45 - 12.00  ;Mo - Fr 13.00 - 16.30";
		List<WeeklyTimeInterval> result = parser.parse(pattern);
		String data = toString(result);
		assertEquals(1, result.size());
		assertEquals(
				" - WeeklyTimeIntervals [weekdays=[MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY], timeIntervals=[TimeInterval [from=07:45:00.000, to=12:00:00.000], TimeInterval [from=13:00:00.000, to=16:30:00.000]]]",
				data);
	}

	@Test
	public void testParseSingle() throws Exception {
		String pattern = "Th 16.00 - 19.00";
		WeeklyTimeInterval weeklyTimeInterval = parser.parseSingle(pattern);
		assertNotNull(weeklyTimeInterval);
	}

	@Test
	public void testParseSingleInterval() throws Exception {
		assertInterval("TimeInterval [from=16:00:00.000, to=19:00:00.000]", "16:00 - 19:00");
		assertInterval("TimeInterval [from=16:00:00.000, to=19:00:00.000]", "16:00 - 19");
		assertInterval("TimeInterval [from=16:00:00.000, to=19:00:00.000]", "16 - 19");
	}

	private void assertInterval(String expected, String pattern) {
		TimeInterval interval = parser.parseSingleInterval(pattern);
		assertEquals(expected, interval.toString());
	}

	@Test
	public void testParseDays() throws Exception {
		assertContainsDays(parser.parseDays("Mo"), DayOfWeek.MONDAY);
		assertContainsDays(parser.parseDays("Mo - Fr"), DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY,
				DayOfWeek.THURSDAY, DayOfWeek.FRIDAY);
		assertContainsDays(parser.parseDays("Mo, Th, Su"), DayOfWeek.MONDAY, DayOfWeek.THURSDAY, DayOfWeek.SUNDAY);

	}

	private void assertContainsDays(Set<DayOfWeek> parseDays, DayOfWeek... days) {
		for (DayOfWeek dayOfWeek : days) {
			assertTrue(parseDays.contains(dayOfWeek));
		}

	}
}
