import java.util.*;
class Inter
{
	public static void main(String[] w)
	{
		Locale l=new Locale("fr","CA");
		//ResourceBundle rb=ResourceBundle.getbundle("abc");
		ResourceBundle rb=ResourceBundle.getBundle("abc",l);
		System.out.println(l.toString());
		Enumeration e=rb.getKeys();
		while(e.hasMoreElements())
		{
			String k=(String)e.nextElement();
			String v=rb.getString(k);
			System.out.println(k+" = "+v);
		}
	}
}

/* OUTPUT-
fr_CA
menu=french wali   */