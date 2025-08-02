package MyProject_Day1;

import java.util.*;

public class calendar_example {
	public static void main(String args[]) {
		Calendar c=Calendar.getInstance();
		Date d=c.getTime();
		System.out.println(d);
		c.set(2025,c.FEBRUARY,01);
		int year=c.getWeekYear();
		System.out.println(year);
		int h=c.getFirstDayOfWeek();
		System.out.println(h);
		System.out.println("Day of week : " + c.get(Calendar.DAY_OF_WEEK));
		System.out.println("Day of year : " + c.get(Calendar.DAY_OF_YEAR));
		System.out.println("Week in Month : " + c.get(Calendar.WEEK_OF_MONTH));
		System.out.println("Week in Year : " + c.get(Calendar.WEEK_OF_YEAR));
		System.out.println("Day of Week in Month : " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("Hour : " + c.get(Calendar.HOUR));
		System.out.println("Minute : " + c.get(Calendar.MINUTE));
		System.out.println("Second : " + c.get(Calendar.SECOND));
		System.out.println("AM or PM : " + c.get(Calendar.AM_PM));
		System.out.println("Hour (24-hour clock) : " + c.get(Calendar.HOUR_OF_DAY));
	}
}
