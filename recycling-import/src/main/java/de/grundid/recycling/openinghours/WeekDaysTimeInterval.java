package de.grundid.recycling.openinghours;

import java.util.Set;

import de.gonam.openinghours.DayOfWeek;
import de.gonam.openinghours.TimeInterval;

public class WeekDaysTimeInterval {

	private Set<DayOfWeek> weekdays;
	private Set<TimeInterval> timeIntervals;

	public WeekDaysTimeInterval(Set<DayOfWeek> weekdays, Set<TimeInterval> timeIntervals) {
		this.weekdays = weekdays;
		this.timeIntervals = timeIntervals;
	}

	public void addDayOfWeek(DayOfWeek dayOfWeek) {
		weekdays.add(dayOfWeek);
	}

	public Set<DayOfWeek> getWeekdays() {
		return weekdays;
	}

	public Set<TimeInterval> getTimeIntervals() {
		return timeIntervals;
	}

}
