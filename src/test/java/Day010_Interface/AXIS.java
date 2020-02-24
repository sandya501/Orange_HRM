package Day010_Interface;

public class AXIS implements A1
{

	public static void main(String[] args) 
	{
		System.out.println("HAI I AM AXIS BANK---------");
		
		A1 AXIS1=new AXIS();
		AXIS1.classinterest();
		AXIS1.deposit();
		AXIS1.withdrawal();

	}

	public void withdrawal() 
	{
		System.out.println("HAI I AM AXIS WITHDRAWAL");
	}

	public void deposit()
	{
		System.out.println("HAI I AM AXIS DEPOSIT");
		
	}

	public void classinterest() 
	{
		
		System.out.println("HAI I AM AXIS CLASSINTEREST");
	}

}
