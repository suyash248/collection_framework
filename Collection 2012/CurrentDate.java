import java.util.*;
public class CurrentDate
{
	public static void main(String... w)
	{
		Date today=new Date();
		GregorianCalendar cal=new GregorianCalendar();
		cal.setTime(today);
		System.out.println(today);
		displayDateInfo(cal);
		cal.clear();
		//cal.set(2000,0,1);
		//System.out.println("New years day 2000 : ");
		//displayDateInfo(cal);
	}
	static void displayDateInfo(GregorianCalendar cal)
	{
		String days[]={"sun","mon","tues","wed","thus","fri","sat"};
		String month[]={"jan","feb","march","april","may","jun","july","aug","sep","oct","nov","dec"};
		String am_pm[]={"AM","PM"};
		System.out.println("Year : "+cal.get(Calendar.YEAR));
		System.out.println("Month : "+month[cal.get(Calendar.MONTH)]);
		System.out.println("Date : "+cal.get(Calendar.DATE));
		System.out.println("Day : "+days[cal.get(Calendar.DAY_OF_WEEK)]);
		System.out.println("Hour : "+(cal.get(Calendar.HOUR)));
		System.out.println("Minute : "+cal.get(Calendar.MINUTE));
		System.out.println("Seconds : "+cal.get(Calendar.SECOND));
		System.out.println(am_pm[cal.get(Calendar.AM_PM)]);
		TimeZone tz=cal.getTimeZone();
		System.out.println("Time zone : "+tz.getID());
	}
}

/* OUTPUT-
Thu Jan 03 20:09:16 IST 2013
Year : 2013
Month : jan
Date : 3
Day : fri
Hour : 8
Minute : 9
Seconds : 16
PM
Time zone : Asia/Calcutta   */