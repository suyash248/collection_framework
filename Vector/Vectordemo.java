import java.util.*;
class Vectordemo
{
	public static void main(String... w)
	{
		Vector<String> al=new Vector<String>(3,2);
		System.out.println("Initial capacity="+al.capacity());
		System.out.println("Initial size="+al.size());
		al.addElement("a");
		al.addElement("b");
		al.addElement("c");
		al.addElement("d");
		System.out.println("Capacity="+al.capacity());
		System.out.println("Size="+al.size());
		al.removeElementAt(2);

	//  To access the objects from the list by using "Enumeration" interface.

		Enumeration e1=al.elements();
		while(e1.hasMoreElements())
		{
			String s=(String)e1.nextElement();
			System.out.println(s);
		}
		System.out.println(" ");

	//  To access the objects from the list by using "Iterator" interface.

		Iterator e=al.iterator();
		while(e.hasNext())
		{
			String s=(String)e.next();
			System.out.println(s);
		}
	}
}

/* OUTPUT-
Initial capacity=3
Initial size=0
Capacity=5
Size=4
a
b
d

a
b
d  */