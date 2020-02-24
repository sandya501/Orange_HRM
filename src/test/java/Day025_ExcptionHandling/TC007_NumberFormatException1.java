package Day025_ExcptionHandling;


public class TC007_NumberFormatException1 {
	
	 public static void main(String args[]){  
		 
		  try{  
		      //code that may raise exception  
			   String s="abc";  
			   int i=Integer.parseInt(s);//NumberFormatException  
			   
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