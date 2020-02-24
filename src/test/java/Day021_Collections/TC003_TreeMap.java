package Day021_Collections;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TC003_TreeMap {
	
	public static void main(String args[]){  
		   
		  TreeMap<Integer,String> hm=new TreeMap<Integer,String>();   
		  
	      hm.put(100,"Amit");    
	      hm.put(101,"Vijay");    
	      hm.put(102,"Rahul");  
	      hm.put(104, "Ramya");
	      //hm.put(null,"Ramu");
	     //hm.put(null,"Sudhakar");
	      hm.put(98,"Vithika");  
	      hm.put(99,"Varun"); 
	      hm.put(80, "Ravi");
		  
		System.out.println("Elements list: "+ hm);  
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

