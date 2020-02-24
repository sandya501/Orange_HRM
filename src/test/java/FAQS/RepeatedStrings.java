package FAQS;

import java.util.HashSet;
import java.util.Set;

public class RepeatedStrings {

	public static void main(String[] args) {
		
		
		String a[]= {"Honey","Honey","Buubbly","Sudhakar","Raju","Raju"};

		
		Set<String> duplicates=new HashSet<>();
		
		for(int i=0;i<a.length;i++)
		{
			if(duplicates.add(a[i])==false)
			{
				System.out.println("Duplicates: "+a[i]);
			
			}
			
		}
		
		
		

	}

}
