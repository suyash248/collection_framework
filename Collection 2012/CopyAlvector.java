//Copy elements of ArrayList to Vector.

import java.util.ArrayList;
import java.util.Vector;
import java.util.Collections;
class CopyAlvector
{
	public static void main(String... w)
	{
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("1");
		arraylist.add("2");
		arraylist.add("3");
		
		Vector<String> v2=new Vector<String>();
		v2.add("one");
		v2.add("two");
		v2.add("three");
		v2.add("four");
		v2.add("five");
		System.out.println(v2);
		System.out.println("After copying : ");
		Collections.copy(v2,arraylist);
		System.out.println(v2);
	}
}

/* OUTPUT-
[one, two, three, four, five]
After copying :
[1, 2, 3, four, five]
*/