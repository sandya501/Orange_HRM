package Day025_ExcptionHandling;

public class TC005_ArithmeticException1 {
	
	 public static void main(String args[]){  
		   try{  
		      //code that may raise exception  
		      int data=100/0;  
		   }catch
		   (ArithmeticException e){System.out.println(e);}  
		   //rest code of the program  
		   System.out.println("rest of the code...");  
		  }  
}

/*
https://www.javatpoint.com/finally-block-in-exception-handling
*/