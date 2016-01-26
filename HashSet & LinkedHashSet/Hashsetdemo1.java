import java.util.*;
class Hashsetdemo1
{
	public static void main(String... w)
	{
		HashSet<Emp> al=new HashSet<Emp>();
		System.out.println(al.size());
		al.add(new Emp(1002));
		al.add(new Emp(1002));
		al.add(new Emp(1002));
		System.out.println(al.size());
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			Emp e=(Emp)i.next();
			System.out.println(e.id);
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
	public boolean equals(Object o)          // make this method comment.
	{
		Emp e=(Emp)o;
		if(e.id==this.id)
		    return true;
		else
		   return false;
	}
	public int hashCode()            // make this method comment.
	{
		return id*10;
	}
}

/* OUTPUT-
0
1
1002  */

/* NOTE- If  we do not override the methods 'equals()' and 'hashCode()' both in our class then duplicacy will be allowed and output will be like-
OUTPUT-
0
3
1002
1002
1002
Hence it is necessary to override both the methods in our class in order to avoid/remove duplicacy.  */
