package Day0001_Access_Modifiers;


public class TC01_public implements Sample{
	
	public static void main(String args[]){  
		
		   A T12=new A();  
		   System.out.println(T12.data);
		   
		   T12.Public1();
		   //T12.Private1();
		   T12.Protected1();
		   
		   Sample s1= new TC01_public();
		   s1.default1();
		   
		   }  
	
	

}
	

