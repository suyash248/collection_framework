import java.util.*;
class ArraylistdemoG
{
	public static void main(String... w)
	{
		ArrayList<String> al=new ArrayList<String>();
		System.out.println(al.size());
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("d");
		System.out.println(al.size());
		al.remove(2);
		System.out.println(al.size());
		System.out.println(al);
	}  
}

/*  OUTPUT-
D:\Collection\Arraylistdemo>javac ArraylistdemoG.java

D:\Collection\Arraylistdemo>java ArraylistdemoG
0
5
4
[a, b, d, d]  */




