package Day021_Collections;

import java.util.ArrayList;

public class TC014_ArrayList {

	 public static void main(String args[]){  
		 ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
		       list.add("Ravi");//Adding object in arraylist    
		       list.add("Vijay");    
		       list.add("Ravi");    
		       list.add("Ajay"); 
		       list.add("null");
		       //Invoking arraylist object   
		       System.out.println(list);  
		   }  
		 
}

/*
 
next →← prev
Java ArrayList class
Java ArrayList class hierarchy
Java ArrayList class uses a dynamic array for storing the elements. It inherits AbstractList class and implements List interface.

The important points about Java ArrayList class are:

Java ArrayList class can contain duplicate elements.
Java ArrayList class maintains insertion order.
Java ArrayList class is non synchronized.
Java ArrayList allows random access because array works at the index basis.
In Java ArrayList class, manipulation is slow because a lot of shifting needs to occur if any element is removed from the array lis
 */

