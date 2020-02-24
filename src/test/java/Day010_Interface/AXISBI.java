package Day010_Interface;

public class AXISBI implements A1,S1{

	public static void main(String[] args) 
	{
		
		A1 AXIS1=new AXIS();
		AXIS1.classinterest();
		AXIS1.deposit();
		AXIS1.withdrawal();
		
		S1 SBI1 =new SBI();
		SBI1.deposit();
		SBI1.withdrawal();
		SBI1.classinterest();
		
		A1 a1=new AXISBI();
		a1.deposit();
		a1.withdrawal();
		a1.classinterest();
		
		S1 b1=new AXISBI();
		b1.deposit();
		b1.withdrawal();
		b1.classinterest();
		

	}
	
	
	
	public void withdrawal() 
	{
		System.out.println("HAI I AM  WITHDRAWAL");
	}

	public void deposit()
	{
		System.out.println("HAI I AM  DEPOSIT");
		
	}

	public void classinterest() 
	{
		
		System.out.println("HAI I AM  CLASSINTEREST");
	}
	
	
	
	
	

}
