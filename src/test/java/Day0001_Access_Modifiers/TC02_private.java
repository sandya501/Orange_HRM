package Day0001_Access_Modifiers;

class B
{  
				public int data=40;  
			
				public void msg(){
					System.out.println("Hello java"); 
					}
}  


public class TC02_private {
	
	public static void main(String args[]){  
		   B obj=new B();  
		   System.out.println(obj.data);//Compile Time Error  
		   obj.msg();//Compile Time Error  
		   }  
	
	

}
	