package Day025_ExcptionHandling;

public class TC013_FinalizeExample {
	

	public static void main(String[] args){  
		
	TC013_FinalizeExample f1=new TC013_FinalizeExample();  
	TC013_FinalizeExample f2=new TC013_FinalizeExample();  
	f1=null;  
	f2=null;  
	System.gc();  
	}
	
	public void finalize(){System.out.println("finalize called");}  
}
