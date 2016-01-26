import java.util.*;
class Hashsetdemo
{
	public static void main(String... w)
	{
		HashSet<String> al=new HashSet<String>();
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
[b, c, a]  */
 /*NOTE- 
"String" class has overridden 'hashCode()' & 'equals()' both methods that's why duplicacy is not allowed here. */