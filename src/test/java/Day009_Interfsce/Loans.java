package Day009_Interfsce;

public class Loans  
{

	public static void main(String[] args) 
	{
		System.out.println("------------------------------------");

		BANK H1= new HDFC();
		H1.deposit();
		H1.withdraw();
		H1.HomeLoadRateofInterest();

		
		System.out.println("------------------------------------");
		

		
		BANK S2 = new SBI();
		S2.deposit();
		S2.withdraw();
		S2.HomeLoadRateofInterest();

		
		
	}
	
	
	
	
	
	
	
	
	


}
