package Day025_ExcptionHandling;

public class TC008_TestFinallyBlock {
	
	public static void main(String args[]){  
		
		  try{  
		   int data=25/5;  
		   System.out.println(data);  
		  }  
		  catch(NullPointerException e){System.out.println(e);} 
		  
		  finally{System.out.println("finally block is always executed");}  
		  
		  System.out.println("rest of the code...");  
		  }  
}

/*
https://www.javatpoint.com/finally-block-in-exception-handling
*/