import java.util.*;
class Treesetdemo
{
	public static void main(String... w)
	{
		TreeSet al=new TreeSet();
		System.out.println(al.size());
		al.add(new Temp(10));
		al.add(new Temp(8));
		al.add(new Temp(9));
		al.add(new Temp(1));
		al.add(new Temp(7));
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			Temp e=(Temp)i.next();
			System.out.println(e.x);
		}
	}
}
class Temp implements Comparable
{
	int x;
	Temp(int x)
	{
		this.x=x;
	}
	public int compareTo(Object o)
	{
		Temp t=(Temp)o;
		if(this.x>t.x)
		     return 1;
		else if(this.x<t.x)
		     return -1;
		else
		     return 0;	
	}
}

/*OUTPUT-
0
1
7
8
9
10  */