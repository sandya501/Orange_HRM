package Day001_Abstract_class;

import Day001_Abstract_class.A;

public class B extends A
{
   
   
   public static void main(String args[])
   {
     B T1 = new B();
     T1.Hello();
     
  //   T1.methodA(); //calling super class method
     T1.methodB(); //calling local method
     
     T1.Hello();
     A.Hai();
     
  }

	@Override
	public void Hello() {
		
		System.out.println("Hello method");
		
	}
	
	public void methodB()
	   {
	     System.out.println("Child class method");
	   }
   
}