package Day009_Interfsce;

public class HDFC implements BANK {

	

	@Override
	public void deposit() {
		
		System.out.println("HDFC BANK - DEPOSIT");
		
	}

	@Override
	public void withdraw() {
		
		System.out.println("HDFC BANK - WITHDRAW");
		
	}

	@Override
	public void HomeLoadRateofInterest() {
		
		System.out.println("HDFC BANK - Rate of Interest is 15%");
		
	}

	

}
