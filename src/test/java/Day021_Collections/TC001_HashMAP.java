package Day021_Collections;

import java.util.HashMap;
import java.util.Map;


public class TC001_HashMAP {
	
	 public static void main(String args[]){  
	
	 // HashMap<Integer,String> hm=new HashMap<Integer,String>();  
	  
	  HashMap<String,String> hm=new HashMap <String,String>();
	  
	    System.out.println("Initial list of elements: "+hm); 
	    
	    hm.put("A", "Amar");
	    hm.put("B", "Vijay");
	    hm.put("c", "Rahul");
	    hm.put("c", "Rahul");
	    hm.put("c", "Rahul");
	    hm.put("null", "nn");
	    hm.put("null", "n");
	    
	    
	    
	   // hm.get("A");
	    
	     /* hm.put(100,"Amit");    
	      hm.put(101,"Vijay");    
	      hm.put(102,"Rahul");  
	      hm.put(null,"Ramu");
	      hm.put(null,"Sudhakar");
	      hm.put(98,"Vithika");  
	      hm.put(99,"Varun");*/
	      //hm.get("Amit");
	      
	      System.out.println("___________________________________");  
	      
	      for (String i : hm.keySet()) {
	    	  System.out.println("key: " + i + " value: " + hm.get(i));
	    	}
	     //for(Map.Entry m:hm.entrySet()){    
	         // System.out.println(m.getKey()+" "+m.getValue());    
	         }   
	 }





/*

https://www.javatpoint.com/java-hashmap

Java HashMap class
Java HashMap class hierarchy
Java HashMap class implements the map interface by using a hash table. It inherits AbstractMap class and implements Map interface.

Points to remember
Java HashMap class contains values based on the key.
Java HashMap class contains only unique keys.
Java HashMap class may have one null key and multiple null values.
Java HashMap class is non synchronized.
Java HashMap class maintains no order.
The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
Hierarchy of HashMap class

 */


