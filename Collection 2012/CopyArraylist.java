//Copy elements of one ArrayList to another ArrayList.

import java.util.ArrayList;
import java.util.Collections;
class CopyArraylist
{
	public static void main(String... w)
	{
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("1");
		arraylist.add("2");
		arraylist.add("3");
		arraylist.add("4");
		arraylist.add("5");

		ArrayList<String> arraylist2=new ArrayList<String>();
		arraylist2.add("one");
		arraylist2.add("two");
		arraylist2.add("three");
		arraylist2.add("four");
		arraylist2.add("five");
		System.out.println(arraylist2);
		System.out.println("After copying : ");
		Collections.copy(arraylist2,arraylist);
		System.out.println(arraylist2);
	}
}

/* OUTPUT-
[one, two, three, four, five]
After copying :
[1, 2, 3, 4, 5]  */