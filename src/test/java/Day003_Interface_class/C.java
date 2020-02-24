package Day003_Interface_class;


import Day003_Interface_class.A;

public class C implements A,B
{

	@Override
	public void methodA() {
		 System.out.println("Base class method of A");
	}

	@Override
	public void methodB() {
		 System.out.println("Base class method of B");
	}
	
	
	 public static void main(String args[])
	   {
	     C T1 = new C();
	     T1.methodA(); 
	     T1.methodB(); 
	     
	     System.out.println("_________");
	     
	     A a1= new C();
	     a1.methodA();
	     
	     System.out.println("**********");
	     
	     B b1= new C();
	     b1.methodB();
	     
	     
	     
	   }
	   
   
 
   
}