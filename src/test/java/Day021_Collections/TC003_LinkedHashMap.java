package Day021_Collections;

import java.util.LinkedHashMap;

public class TC003_LinkedHashMap {
	
	public static void main(String args[]){  
		   
		  LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
		  
	    /*  hm.put(100,"Amit");    
	      hm.put(101,"Vijay");    
	      hm.put(102,"Rahul");  
	      hm.put(103,"Ramu");
	      hm.put(null,"Sudhakar");
	      hm.put(null,"Sudhakar1"); 
	      hm.put(98,"Vithika");  
	      hm.put(99,"Varun"); */
	      hm.put(1, "Amar");
		    hm.put(2, "Vijay");
		    hm.put(7, "Ravi");
		    hm.put(3, "Rahul");
		    hm.put(4, "Ramu");
		   
		    hm.get(3);
		    hm.get(2);
		    
		System.out.println("Elements list: "+ hm);  
		
		
		hm.forEach((key, value) -> {
		    System.out.println("Key:"+ key + ", Value:" + value);
		});
	}
}
	
	
	



/*
Points to remember

Java LinkedHashMap contains values based on the key.
Java LinkedHashMap contains unique elements.
Java LinkedHashMap may have one null key and multiple null values.
Java LinkedHashMap is non synchronized.
Java LinkedHashMap maintains insertion order.
The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

*/

