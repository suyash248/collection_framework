import java.util.*;
class Treemapdemo
{
	public static void main(String... w)
	{
		TreeMap<String,String> tm=new TreeMap<String,String>();
		System.out.println(tm.size());
		tm.put("1001","aa");
		tm.put("1002","bb");
		tm.put("1006","ee");
		tm.put("1004","dd");
		tm.put("1004","pp");
		Set s=tm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry e=(Map.Entry)i.next();
			String k=(String)e.getKey();
			String v=(String)e.getValue();
			System.out.println(k+"="+v);
		}
	}
} 

/* OUTPUT-
0
1001=aa
1002=bb
1004=pp
1006=ee   */