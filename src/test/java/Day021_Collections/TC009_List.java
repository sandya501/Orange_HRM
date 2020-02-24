package Day021_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;



public class TC009_List {
	
	public static void main(String args[]){  
		List<String> al=new ArrayList<String>();  
		al.add("Amit");  
		al.add("Vijay");  
		al.add("Kumar");  
		al.add(2,"sachin");  
		System.out.println("An element at 2nd position: "+al.get(2));  
		for(String s:al){  
		 System.out.println(s);  
		}  
		}  
}


