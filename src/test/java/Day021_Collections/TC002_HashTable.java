package Day021_Collections;


import java.util.Hashtable;
import java.util.Map;

public class TC002_HashTable {
	
	 public static void main(String args[]){  
			
		  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();   
		  
		    System.out.println("Initial list of elements: "+hm);  
		      hm.put(100,"Amit");    
		      hm.put(101,"Vijay");    
		      hm.put(102,"Rahul");  
		      hm.put(103,"null");
		   //  hm.put(null,"Sudhakar");
		      hm.put(98,"Vithika");  
		      hm.put(99,"Varun");  
		   
		      
		      System.out.println("Elements list: "+ hm);  
		      
		      System.out.println("______________________");  
		      
		     for(Map.Entry m:hm.entrySet()){    
		          System.out.println(m.getKey()+" "+m.getValue());    
		         }   
		 }



}
