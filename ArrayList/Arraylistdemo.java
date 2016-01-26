import java.util.*;
class Arraylistdemo
{
	public static void main(String... w)
	{
		ArrayList al=new ArrayList();
		System.out.println(al.size());
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("d");                   // Duplicacy is allowed and the elements are retrieved in insertion order.
		al.add(new Integer(10));      // We are not using generic here so heterogeneous objects can be stored in the array.But it will give 
		System.out.println(al.size());    // warinings beacause non-generic collection has been deprecated.   
		al.remove(2);
		System.out.println(al.size());
		System.out.println(al);   // When you print the object of any collection then it will print all it's elements because "Collection" has
	}  			        //  overridden 'toString()' method.
}

/*  OUTPUT-
D:\Collection\Arraylistdemo>javac Arraylistdemo.java
Note: Arraylistdemo.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

D:\Collection\Arraylistdemo>java Arraylistdemo
0
6
5
[a, b, d, d, 10]
D:\Collection\Arraylistdemo>   */