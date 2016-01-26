// Implementing  Linked list using classes.

class Link
{
	public int iData;
	public Link next;
	public Link(int id)
	{
		iData=id;
	}
	public String toString()
	{
		return "{"+iData+"}";
	}
}
class LinkList
{
	private Link first;
	public LinkList()
	{
		first=null;
	}
	public boolean isEmpty()
	{
		return(first==null);
	}
	public void insertFirst(int id)
	{
		Link newlink=new Link(id);
		newlink.next=first;
		first=newlink;
	}
	public Link deleteFirst()
	{
		Link temp=first;
		first=first.next;
		return temp;
	}
	public String toString()
	{
		String str=" ";
		Link current=first;
		while(current!=null)
		{
			str+=current.toString();
			current=current.next;
		}
		return str;
	}
}
public class MyLinkedList
{
	public static void main(String... w)
	{
		LinkList thelist=new LinkList();
		thelist.insertFirst(22);
		thelist.insertFirst(44);
		thelist.insertFirst(66);
		thelist.insertFirst(88);
		System.out.println(thelist);
		while(!thelist.isEmpty())
		{
			Link alink=thelist.deleteFirst();
			System.out.print("Deleted "+alink);
			System.out.println("");
		}
		System.out.println(thelist);
		
	}
}

/* OUTPUT-
 {88}{66}{44}{22}
Deleted {88}
Deleted {66}
Deleted {44}
Deleted {22}   */