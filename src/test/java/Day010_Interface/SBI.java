package Day010_Interface;

public class SBI implements S1 {

	public static void main(String[] args)
	{
	
		System.out.println("HAI I AM SBI BANK-----------------");
		
		
		S1 SBI1 =new SBI();
		SBI1.deposit();
		SBI1.withdrawal();
		SBI1.classinterest();
				
		
	}

	public void deposit()
	{
			System.out.println("HAI I AM SBI DEPOSIT");
		
	}

	public void withdrawal() 
	{
		
		System.out.println("HAI I AM SBI WITHDRAWAL");
		
	}

	public void classinterest()
	{
	
		System.out.println("HAI I AM SBI CLASSINTEREST");
		
	}

}
