// Showing different formats of date.

import java.text.DateFormat;
import java.util.Date;
public class DateFormatClass
{
	public static void main(String... w)
	{
		Date d1=new Date();
		DateFormat[] dfa=new DateFormat[6];
		dfa[0]=DateFormat.getInstance();
		dfa[1]=DateFormat.getDateInstance();
		dfa[2]=DateFormat.getDateInstance(DateFormat.SHORT);
		dfa[3]=DateFormat.getDateInstance(DateFormat.MEDIUM);
		dfa[4]=DateFormat.getDateInstance(DateFormat.LONG);
		dfa[5]=DateFormat.getDateInstance(DateFormat.FULL);
		for(DateFormat df : dfa)	// 'for-each' loop.
		{
			System.out.println(df.format(d1));
		}
	}
}

/* OUTPUT-
12/30/12 2:55 AM
Dec 30, 2012
12/30/12
Dec 30, 2012
December 30, 2012
Sunday, December 30, 2012  */