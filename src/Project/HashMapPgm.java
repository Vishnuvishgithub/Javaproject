package Project;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapPgm {

	public static void main(String[] args) {
		
		//Hashmap contains data as key, value pairs  (key and value can be integer or string or any data type)
		//contains only unique keys 
		//not synchronized no order 
		//Java hash map may have one null key  and multiple null values 
		
		HashMap <String, String> hm1=new HashMap<String,String>();
		
		hm1.put("Google", "www.google.com");
		hm1.put("Yahoo", "www.yahoo.com");
		hm1.put("selenium", "www.selenium.com");
		hm1.put("postman", "www.postman.com");
		
		//hm1.remove("Google");
	   // 	hm1.remove("Yahoo", "www.yahoo.com");
		//System.out.println(hm1);
		
	//	Set S=hm1.keySet();    // store it in a set
		
		
		//Print using for each loop
		
		for (String key : hm1.keySet())
		{
			System.out.println("Key is : " + key +"  Value is :" + hm1.get(key));
		}
		
		
		//By Iterator
		Set S=hm1.keySet(); 
		Iterator <String> itr=S.iterator();
		
		while (itr.hasNext())
		{
			String key= (String) itr.next();
			System.out.println("Key is :" +key + " Value is :" + hm1.get(key));
			
		}
			
		
		
	
		

	}

}
