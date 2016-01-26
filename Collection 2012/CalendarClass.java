import java.util.Date;
import java.util.Locale;
import java.util.Calendar;
import java.text.DateFormat;
public class CalendarClass
{
	public static void main(String... w)
	{
		Calendar c=Calendar.getInstance();
		Locale loc=new Locale("en","us");
		Date d=c.getTime();
		DateFormat df=DateFormat.getDateInstance(0,loc);  // see 'getDateInstance()' method in "DateFormat" class.
		//Use the 'format()' method to create formatted dates.
		String s=df.format(d);
		System.out.println(s);
	}
}

/* OUTPUT-
Sunday, December 30, 2012  */