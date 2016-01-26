import java.util.*;
class Treesetdemo1
{
	public static void main(String... w)
	{
		TreeSet al=new TreeSet();
		System.out.println(al.size());
		al.add(new Emp(5000));
		al.add(new Emp(1000));
		al.add(new Emp(2000));
		al.add(new Emp(4000));
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			Emp e=(Emp)i.next();
			System.out.println(e.salary);
		}
	}
}
class Emp
{
	int salary;
	Emp(int salary)
	{
		this.salary=salary;
	}
}

/* OUTPUT-
0
Exception in thread "main" java.lang.ClassCastException: Emp cannot be cast to java.lang.Comparable
        at java.util.TreeMap.compare(Unknown Source)
        at java.util.TreeMap.put(Unknown Source)
        at java.util.TreeSet.add(Unknown Source)
        at Treesetdemo1.main(Treesetdemo1.java:8)  */