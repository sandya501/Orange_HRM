package  Day000_OOPS_Concepts1;

//https://beginnersbook.com/2013/04/oops-concepts/#8

/*
Static Polymorphism:
Polymorphism that is resolved during compiler time is known as static polymorphism. 
Method overloading can be considered as static polymorphism example.
Method Overloading: This allows us to have more than one methods with 
same name in a class that differs in signature.*/




public class TC01_Static_Polymorphism
{  
		
	public static void main(String args[])
	   {
		
		TC01_Static_Polymorphism T1 = new TC01_Static_Polymorphism();
	       T1.display('a');
	       T1.display('a',10);
	   }
	
	 public void display(char c)
	    {
	         System.out.println(c);
	    }
	    
	    
	    public void display(char c, int num)  
	    {
	         System.out.println(c + " "+num);
	    }
	

}