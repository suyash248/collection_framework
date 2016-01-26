import java.util.*;
class Mycomp implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Temp t1=(Temp)o1;
		Temp t2=(Temp)o2;
		if(t1.salary>t2.salary)
		   return 1;
		else if(t1.salary<t2.salary)
		    return -1;
		else
		   return 0;
	}
}
class Mytree
{
	public static void main(String... w)
	{
		Comparator m=new Mycomp();
		TreeSet t=new TreeSet(m);
		t.add(new Temp(10));
		t.add(new Temp(2));
		t.add(new Temp(6));
		t.add(new Temp(7));
		Iterator i=t.iterator();
		while(i.hasNext())
		{
			Temp t1=(Temp)i.next();
			System.out.println(t1.salary);
		}
	}
}
class Temp
{
	int salary;
	Temp(int salary)
	{
		this.salary=salary;
	}
}

/* OUTPUT-
2
6
7
10  */