package Day025_ExcptionHandling;


public class TC004_ArrayIndexOutOfBoundsException1 {
	
	 public static void main(String args[]) throws Exception{  
		 
		 /* int a[]=new int[5];  
		   a[10]=50; //ArrayIndexOutOfBoundsException   */
		 
		  try{  
			   int a[]=new int[5];  
			   a[10]=50; //ArrayIndexOutOfBoundsException   
			   
		   }catch(ArithmeticException e){System.out.println(e);}  
		   catch(NullPointerException   e){System.out.println(e);} 
		   catch(NumberFormatException   e){System.out.println(e);} 
		   catch(ArrayIndexOutOfBoundsException   e){System.out.println(e);}
		     
		     
		   //rest code of the program   
		   System.out.println("rest of the code...");  
		  }  
}


/*
https://www.javatpoint.com/exception-handling-in-java
	
	*/