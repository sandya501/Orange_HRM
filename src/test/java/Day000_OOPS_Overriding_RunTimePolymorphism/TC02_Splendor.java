package Day000_OOPS_Overriding_RunTimePolymorphism;

//https://www.javatpoint.com/runtime-polymorphism-in-java

/*
Example of Java Runtime Polymorphism
In this example, we are creating two classes Bike and Splendor. 
Splendor class extends Bike class and overrides its run() method. 
We are calling the run method by the reference variable of Parent class. 
Since it refers to the subclass object and subclass method overrides the Parent class method, 
the subclass method is invoked at runtime.

Since method invocation is determined by the JVM not compiler, 
it is known as runtime polymorphism.*/

public class TC02_Splendor extends TC01_Bike{  
	 
		public void run() throws Exception
		{
			System.out.println("running safely with 60km");
		}  
		  
	  public static void main(String args[]) throws Exception
	  {  
		  TC01_Bike b = new TC02_Splendor();//upcasting  
		  b.run();  
	  }  

}
