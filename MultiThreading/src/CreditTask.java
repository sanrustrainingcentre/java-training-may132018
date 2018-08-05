
public class CreditTask implements Runnable {
	
	private BankAccount bankAccount;
	
	
	public CreditTask(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			bankAccount.credit(1);
		}
	}

}
