package Day005_InterfaceExample;

interface BRI
{
	public void BankRI();
}



class SBI implements BRI
{

	public void BankRI() {
		
		int RI=8;
		System.out.println("SBI RI is " + RI);
		
	}
	
}



class HDFC implements BRI
{

	public void BankRI() {
		
		int RI=10;
		System.out.println("HDFC RI is " + RI);
		
	}
	
}







public class Homeloan {

	public static void main(String[] args) {

		BRI b1 = new SBI();
		b1.BankRI();
		
		BRI b2 = new HDFC();
		b2.BankRI();
	}

}



