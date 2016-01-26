import java.util.*;
class Hashmapdemo1
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
	public boolean equals(Object o)
	{
		Emp e=(Emp)o;
		if(e.id==this.id)
		   return true;
		else
		   return false;
	}
	public int hashCode()
	{
		return id*10;
	}
}

/* OUTPUT-
0
10=aa  */