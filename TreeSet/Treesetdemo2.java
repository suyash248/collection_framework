import java.util.*;
class Treesetdemo2
{
	public static void main(String... w)
	{
		TreeSet al=new TreeSet();
		System.out.println(al.size());
		al.add("eee");
		al.add("ccc");
		al.add("bbb");
		al.add("ccc");
		al.add("ddddd");
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			String e=(String)i.next();
			System.out.println(e);
		}
	}
}

/*OUTPUT-  Duplicacy is not allowed and objects are retrieved in a sorted order.
0
bbb
ccc
ddddd
eee  */