import java.util.*;
class LHashsetdemo
{
	public static void main(String... w)
	{
		LinkedHashSet<String> al=new LinkedHashSet<String>();
		System.out.println(al.size());
		al.add("a");
		al.add("b");
		al.add("c");
		System.out.println(al.add("c"));
		System.out.println(al.size());
		System.out.println(al);
	}
}

/*OUTPUT-
0
false
3
[a, b, c]  */   // Elements are retrieved in insertion order.(ie. order in which they are inserted.)
 /*NOTE- 
"String" class has overridden 'hashCode()' & 'equals()' both methods that's why duplicacy is not allowed here. */