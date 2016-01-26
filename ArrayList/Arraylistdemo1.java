import java.util.*;
class Arraylistdemo1
{
	public static void main(String... w)
	{
		ArrayList al=new ArrayList();
		int x[]={1,-1,2,-2,3,-3,4,-4};
		for(int i=0;i<x.length;i++)
		{
			al.add(x[i]);
		}
		System.out.println(al);
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			Integer z=(Integer)i.next();
			if(z.intValue()<0)
			   i.remove();
		}
		System.out.println(al);
	}
}

/* OUTPUT-
[1, -1, 2, -2, 3, -3, 4, -4]
[1, 2, 3, 4]   */