package FAQS;
import org.testng.annotations.Test;
import java.util.*;

public class SetExample {
	
     

  @Test
  public void ExamplesOnSet() throws Exception{
	  
	  Set<String> hash_Set =  new HashSet<String>();
	  hash_Set.add("Geeks"); 
      hash_Set.add("For"); 
      hash_Set.add("Geeks"); 
      hash_Set.add("Example"); 
      hash_Set.add("Set");
      int  TotalStrings= hash_Set.size();
      
      System.out.println("Total Strings "+TotalStrings);

      List<String> aList = new ArrayList<String>( TotalStrings); 
      for (String x : aList) 
      {
          aList.add(x); 
         // System.out.println("Created ArrayList is"+aList.get(0)); 
          
      }
      
      System.out.println(" ArrayList is"+aList.get(2)); 
     /* 
      System.out.println("first String "+aList.get(1));
      System.out.println("first String "+aList.get(2));
      System.out.println("first String "+aList.get(3));
    //  System.out.println("first String "+aList.get(4));
	}             
  */
  }
  
}