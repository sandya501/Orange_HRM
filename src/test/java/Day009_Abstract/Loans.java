package Day009_Abstract;

public class Loans  extends BANK
{

	public static void main(String[] args) 
	{
		System.out.println("------------------------------------");

		System.out.println("HDFC BANK DETAILS");
		
		
		BANK H1= new HDFC();
		H1.deposit();
		H1.withdraw();
		H1.HomeLoadRateofInterest();

		
		System.out.println("------------------------------------");
		
		
		
		
		System.out.println("SBI BANK DETAILS");
		
		BANK S2 = new SBI();
		S2.deposit();
		S2.withdraw();
		S2.HomeLoadRateofInterest();

		
		
	}

	@Override
	public void HomeLoadRateofInterest() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	/*
	@Override
	public void HomeLoadRateofInterest() {

		System.out.println("HDFC BANK CLASSINTEREST is 15%");
	}
*/
	
	
	
	
	
	


}
