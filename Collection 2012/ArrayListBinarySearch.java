// To search elements in arraylist using binary serach method.
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListBinarySearch
{
	public static void main(String... w)
	{
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("1");
		arraylist.add("4");
		arraylist.add("2");
		arraylist.add("5");
		arraylist.add("3");
		Collections.sort(arraylist);             // Binary Search will work only when "ArrayList" is sorted.
 		System.out.println("Sorted ArrayList contains : "+arraylist);
		int index=Collections.binarySearch(arraylist,"4");
		System.out.println("Element found at index : "+index);
	}
}

/* OUTPUT-
Sorted ArrayList contains : [1, 2, 3, 4, 5]
Element found at index : 3  */