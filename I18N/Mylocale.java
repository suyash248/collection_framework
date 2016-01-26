import java.util.*;
class Mylocale
{
	public static void main(String... w)
	{
		//Locale l=new Locale("fr","FR");
		//ResourceBundle rb=ResourceBundle.getbundle("abc");
		ResourceBundle rb=ResourceBundle.getBundle("abc",Locale.getDefault());
		System.out.println(Locale.getDefault().toString());
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
en_US
menu=us wali
          */