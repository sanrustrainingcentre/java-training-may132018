
public class DebitTask implements Runnable {
	
	private BankAccount bankAccount;
	
	
	public DebitTask(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			bankAccount.debit(1);
		}
	}
	

}
