package de.grundid.recycling.openinghours;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.joda.time.LocalTime;
import org.springframework.util.StringUtils;

import de.gonam.openinghours.DayOfWeek;
import de.gonam.openinghours.TimeInterval;
import de.gonam.openinghours.WeeklyTimeInterval;

public class OpeningHoursParser {

	private String[] monthNames = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	private static final Map<DayOfWeek, String> DAYS_MAP = new HashMap<DayOfWeek, String>();

	static {
		DAYS_MAP.put(DayOfWeek.MONDAY, "Mo");
		DAYS_MAP.put(DayOfWeek.TUESDAY, "Tu");
		DAYS_MAP.put(DayOfWeek.WEDNESDAY, "We");
		DAYS_MAP.put(DayOfWeek.THURSDAY, "Th");
		DAYS_MAP.put(DayOfWeek.FRIDAY, "Fr");
		DAYS_MAP.put(DayOfWeek.SATURDAY, "Sa");
		DAYS_MAP.put(DayOfWeek.SUNDAY, "Su");
	}

	public List<WeeklyTimeInterval> parse(String pattern) {
		List<WeeklyTimeInterval> result = new ArrayList<WeeklyTimeInterval>();

		if (StringUtils.hasText(pattern)) {
			String[] splitted = pattern.split(";");

			boolean takeNext = true;
			for (String subPattern : splitted) {
				subPattern = StringUtils.trimWhitespace(subPattern);
				if (containsMonth(subPattern)) {
					if (subPattern.startsWith("Oct")) { // FIXME
						takeNext = true;
					}
					else {
						takeNext = false;
					}
				}
				else if (subPattern.contains("Ganz")) {
					takeNext = true;
				}
				else {
					if (takeNext) {
						try {
							if (!subPattern.toLowerCase().endsWith("off")) {
								WeeklyTimeInterval wti = parseSingle(subPattern);
								result.add(wti);
							}
						}
						catch (ParseException e) {
							System.err.println(e.getMessage());
						}
						catch (Exception e) {
							System.err.println("Cannot parse " + subPattern);
						}
					}
				}
			}
		}

		return aggregateResults(result);
	}

	private List<WeeklyTimeInterval> aggregateResults(List<WeeklyTimeInterval> list) {
		Map<DayOfWeek, Set<TimeInterval>> dayOfWeekMap = new HashMap<DayOfWeek, Set<TimeInterval>>();

		for (WeeklyTimeInterval wit : list) {
			for (DayOfWeek dayOfWeek : wit.getWeekdays()) {
				Set<TimeInterval> timeIntervals = dayOfWeekMap.get(dayOfWeek);
				if (timeIntervals == null) {
					timeIntervals = new HashSet<TimeInterval>();
					dayOfWeekMap.put(dayOfWeek, timeIntervals);
				}
				timeIntervals.addAll(wit.getTimeIntervals());
			}
		}

		List<WeekDaysTimeInterval> groupedList = new ArrayList<WeekDaysTimeInterval>();
		for (Entry<DayOfWeek, Set<TimeInterval>> entry : dayOfWeekMap.entrySet()) {

			WeekDaysTimeInterval timeInterval = findSameTimeInterval(groupedList, entry.getValue());

			if (timeInterval == null) {
				Set<DayOfWeek> dayOfWeeks = new HashSet<DayOfWeek>();
				dayOfWeeks.add(entry.getKey());
				groupedList.add(new WeekDaysTimeInterval(dayOfWeeks, entry.getValue()));
			}
			else {
				timeInterval.addDayOfWeek(entry.getKey());
			}
		}

		List<WeeklyTimeInterval> result = new ArrayList<WeeklyTimeInterval>();
		for (WeekDaysTimeInterval weekDaysTimeInterval : groupedList) {
			result.add(new WeeklyTimeInterval(weekDaysTimeInterval.getWeekdays(), weekDaysTimeInterval
					.getTimeIntervals()));
		}

		return result;
	}

	private WeekDaysTimeInterval findSameTimeInterval(List<WeekDaysTimeInterval> groupedList, Set<TimeInterval> value) {
		for (WeekDaysTimeInterval wdti : groupedList) {
			if (wdti.getTimeIntervals().containsAll(value) && value.containsAll(wdti.getTimeIntervals())) {
				return wdti;
			}
		}
		return null;
	}

	protected WeeklyTimeInterval parseSingle(String subPattern) throws ParseException {
		int hoursPos = findHours(subPattern);
		if (hoursPos != -1) {
			String days = StringUtils.trimWhitespace(subPattern.substring(0, hoursPos));
			String hours = StringUtils.trimWhitespace(subPattern.substring(hoursPos));

			Set<DayOfWeek> weekdays = parseDays(days);
			Set<TimeInterval> timeIntervals = parseIntervals(hours);

			return new WeeklyTimeInterval(weekdays, timeIntervals);
		}

		throw new ParseException("Hours not found in [" + subPattern + "]", hoursPos);
	}

	private Set<TimeInterval> parseIntervals(String hours) throws ParseException {
		Set<TimeInterval> intervals = new HashSet<TimeInterval>();
		hours = hours.replaceAll("\\.", ":");

		if (hours.contains(",")) {
			String[] splitted = hours.split(",");
			for (String subHours : splitted) {
				try {
					intervals.add(parseSingleInterval(StringUtils.trimWhitespace(subHours)));
				}
				catch (Exception e) {
					throw new ParseException(hours, 0);
				}
			}
		}
		else {
			try {
				intervals.add(parseSingleInterval(hours));
			}
			catch (Exception e) {
				throw new ParseException(hours, 0);
			}
		}

		return intervals;
	}

	protected TimeInterval parseSingleInterval(String hours) {
		String[] splitted = hours.split("-");
		String from = StringUtils.trimWhitespace(splitted[0]);
		String to = StringUtils.trimWhitespace(splitted[1]);

		if (!from.contains(":"))
			from += ":00";

		if (!to.contains(":"))
			to += ":00";

		LocalTime fromTime = LocalTime.parse(from);
		LocalTime toTime = LocalTime.parse(to);

		TimeInterval timeInterval = new TimeInterval(fromTime, toTime);
		return timeInterval;
	}

	protected Set<DayOfWeek> parseDays(String days) throws ParseException {
		Set<DayOfWeek> dayOfWeeks = new HashSet<DayOfWeek>();
		if (days.contains(",")) {
			String[] splitted = days.split(",");
			for (String subDays : splitted) {
				dayOfWeeks.addAll(parseDays(StringUtils.trimWhitespace(subDays)));
			}
		}
		else if (days.contains("-")) {
			String[] splitted = days.split("-");
			DayOfWeek first = identifyDay(StringUtils.trimWhitespace(splitted[0]));
			DayOfWeek last = identifyDay(StringUtils.trimWhitespace(splitted[1]));
			boolean add = false;
			for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
				if (first == dayOfWeek) {
					dayOfWeeks.add(dayOfWeek);
					add = true;
				}
				else if (last == dayOfWeek) {
					dayOfWeeks.add(dayOfWeek);
					add = false;
				}
				else if (add) {
					dayOfWeeks.add(dayOfWeek);
				}
			}
		}
		else {
			for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
				if (days.contains(getShortLabel(dayOfWeek)))
					dayOfWeeks.add(dayOfWeek);
			}
		}
		return dayOfWeeks;
	}

	private DayOfWeek identifyDay(String day) throws ParseException {
		for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
			if (day.equals(getShortLabel(dayOfWeek)) || day.equals(dayOfWeek.getShortLabel())) {
				return dayOfWeek;
			}
		}
		throw new ParseException("Unknown Day " + day, 0);
	}

	private String getShortLabel(DayOfWeek dayOfWeek) {
		return DAYS_MAP.get(dayOfWeek);
	}

	private int findHours(String subPattern) {
		for (int x = 0; x < subPattern.length(); x++) {
			if (Character.isDigit(subPattern.charAt(x)))
				return x;
		}
		return -1;
	}

	private boolean containsMonth(String subPattern) {
		for (String month : monthNames) {
			if (subPattern.contains(month))
				return true;
		}
		return false;
	}

}
