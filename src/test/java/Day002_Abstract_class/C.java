package Day002_Abstract_class;

import Day002_Abstract_class.A;

public class C extends A 
{
  
   public static void main(String args[])
   {
     
	   A a1=new C();
	   a1.display();  //Abstract class Object
	   
	
  }

	@Override
	public void display() {
		
		System.out.println("Hai- Hello");
		
	}
   
 /*  public void display()
   {
     System.out.println("display method");
   }
   
   public void Show()
   {
     System.out.println("Show method");
   }
   */
   
}