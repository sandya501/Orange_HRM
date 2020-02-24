package Day025_ExcptionHandling;

public class TC014_TestThrow1 {
	

	static void validate(int age){  
		
	     if(age<18)  
	      throw new ArithmeticException("Custom Exception...This is not valid age for voting");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	
	   public static void main(String args[]){  
	      validate(13);  
	      System.out.println("rest of the code...");  
	  }   
}
