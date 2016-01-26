//Only 'equals()' is overridden in "Emp" class hence the 'hashCode()' of "Object" class will be executed during calculation of hashcode of each object."Object" class 
//returns seperate hashcode for each object and hence each object will be stored in different bucket. And we know that object having duplicate keys can not be stored 
//in same bucket but they can be stored in the different buckets.
  
                                                 //bucket number in which object will be stored = (hashcode of object) % (number of buckets)

import java.util.*;
class Hashmapdemo3
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
}


/* OUTPUT-
0
10=aa
10=dd
10=aa
10=bb
10=cc   */