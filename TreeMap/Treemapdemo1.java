import java.util.*;
class Treemapdemo1
{
	public static void main(String... w)
	{
		TreeMap<Temp,String> hm=new TreeMap<Temp,String>();
		System.out.println(hm.size());
		hm.put(new Temp(10),"dd");
		hm.put(new Temp(2),"aa");
		hm.put(new Temp(5),"bb");
		hm.put(new Temp(4),"jj");
		hm.put(new Temp(7),"gg");
		Set s=hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry e=(Map.Entry)i.next();
			Temp k=(Temp)e.getKey();
			String v=(String)e.getValue();
			System.out.println(k.x+"="+v);
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

/* OUTPUT-
0
2=aa
4=jj
5=bb
7=gg
10=dd  */