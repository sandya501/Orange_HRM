package Day009_Interfsce;

public class SBI  implements BANK
{

	@Override
	public void deposit() {
		
		System.out.println("SBI BANK - DEPOSIT");
		
	}

	@Override
	public void withdraw() {
		
		System.out.println("SBI BANK - WITHDRAW");
		
	}

	@Override
	public void HomeLoadRateofInterest() {
		
		System.out.println("SBI BANK - Rate of Interest is 8%");
		
	}

	
}
