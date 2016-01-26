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
class Mytreemap
{
	public static void main(String... w)
	{
		Comparator m=new Mycomp();
		TreeMap t=new TreeMap(m);
		t.put(new Temp(10),"cc");
		t.put(new Temp(2),"bb");
		t.put(new Temp(12),"gg");
		t.put(new Temp(3),"aa");
		t.put(new Temp(2),"gg");
		Set s=t.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry e=(Map.Entry)i.next();
			Temp k=(Temp)e.getKey();
			String v=(String)e.getValue();
			System.out.println(k.salary+"="+v);
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
2=gg
3=aa
10=cc
12=gg  */