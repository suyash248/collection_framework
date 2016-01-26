// To Retrieve "ArrayList" object via "Enumeration".

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
public class ArrayListEnumeration
{
	public static void main(String... w)	
	{
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("A");
		arraylist.add("B");
		arraylist.add("C");
		arraylist.add("D");
		arraylist.add("E");
		arraylist.add("F");
		Enumeration e=Collections.enumeration(arraylist);
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}

/* OUTPUT-

A
B
C
D
E
F
*/