import java.util.*;
class Hashmapdemo
{
	public static void main(String... w)
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		System.out.println(hm.size());
		hm.put("1001","aa");
		hm.put("1002","bb");
		hm.put("1006","ee");
		hm.put("1004","dd");
		hm.put("1004","pp");
		Set s=hm.entrySet();
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
1004=pp
1001=aa
1002=bb
1006=ee    */