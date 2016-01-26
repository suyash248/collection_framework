// To find out maximum/minimum element in "ArrayList"
import java.util.ArrayList;
import java.util.Collections;
public class MaxArrayList
{
	public static void main(String... w)	
	{
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		arraylist.add(new Integer("3"));
		arraylist.add(new Integer("1"));
		arraylist.add(new Integer("8"));
		arraylist.add(new Integer("9"));
		arraylist.add(new Integer("5"));
		Object obj=Collections.max(arraylist);         // Object obj=Collections.min(arraylist);
		System.out.println(obj);
	}
}

/* OUTPUT-
9  */