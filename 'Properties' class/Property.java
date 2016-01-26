import java.util.*;
import java.io.*;
public class Property
{
	public static void loadproperties()
	{
		Properties loadprops=new Properties();
		FileInputStream fi=null;
		try
		{
			fi=new FileInputStream("application.properties");
			loadprops.load(fi);
			Enumeration names=loadprops.propertyNames();
			while(names.hasMoreElements())
			{
				String key=(String)names.nextElement();
				String v=loadprops.getProperty(key);
				System.out.println(key+"="+v);
			}
		}catch(Exception e){System.out.println(e);}
	}
	public static void main(String... w)
	{
		loadproperties();
	}
}

/* OUTPUT- The content of '.properties' file will be displayed.
user=Suyash
pass=1234
database=oracle
 */