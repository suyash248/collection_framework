//"Emp" class did not override neither 'equals()' not 'hashCode()' so the equals() and hashCode() method of "Object" class will be executed.

import java.util.*;
class Hashmademo2
{
	public static void main(String... w)
	{
		HashMap<Emp,String> hm=new HashMap<Emp,String>();
		System.out.println(hm.size());
		hm.put(new Emp(10),"aa");
 		hm.put(new Emp(10),"dd");
		hm.put(new Emp(10),"cc");
		hm.put(new Emp(10),"bb");
		hm.put(new Emp(10),"aa");		
		Set s=hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry e=(Map.Entry)i.next();
			Emp k=(Emp)e.getKey();
			String v=(String)e.getValue();
			System.out.println(k.id+"="+v);
		}
	}
}
class Emp
{
	int id;
	Emp(int id)
	{
		this.id=id;
	}
}

/* OUTPUT-
0
10=aa
10=dd
10=aa
10=bb
10=cc   */