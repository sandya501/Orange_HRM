package Day0001_Access_Modifiers;

public class A {
	
	public int data=40;  
	
	
	
	public void Public1(){
		System.out.println("A - Public1"); 
		}
	
	private void Private1(){
		System.out.println("A - Private1"); 
		}		
	
	protected void Protected1(){
		System.out.println("A - Protected1"); 
		}		
	
	/*Default methods are allowed only in interfaces
	default void default1(){
		System.out.println("A - Protected1"); 
		}	*/
	

}
