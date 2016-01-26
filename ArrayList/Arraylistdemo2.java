import java.util.*;
class Arraylistdemo2
{
	public static void main(String... w)
	{
		ArrayList al=new ArrayList();
		int x[]={1,-1,2,-2,3,-3,4,-4};
		for(int i=0;i<x.length;i++)
			al.add(x[i]);
		Object o[]=al.toArray();
		for(int j=0;j<o.length;j++)
		{
			Integer z=(Integer)o[j];
			System.out.println(z.intValue()+" ");
		}
	}
}

/*  OUTPUT-

D:\Collection\Arraylistdemo>javac Arraylistdemo2.java
Note: Arraylistdemo2.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

D:\Collection\Arraylistdemo>java Arraylistdemo2
1
-1
2
-2
3
-3
4
-4

D:\Collection\Arraylistdemo>    */