
public class SynchronizationDemo {

	public static void main(String[] args) {
		
		BankAccount bankAccount = new BankAccount(100);
		
		DebitTask debitTask = new DebitTask(bankAccount);
		CreditTask creditTask = new CreditTask(bankAccount);
		
		Thread t1 = new Thread(debitTask, "DEBIT-THREAD-1");
		Thread t2 = new Thread(debitTask, "DEBIT-THREAD-2");
		Thread t3 = new Thread(debitTask, "DEBIT-THREAD-3");
		
		Thread t4 = new Thread(creditTask, "CREDIT-THREAD-4");
		Thread t5 = new Thread(creditTask, "CREDIT-THREAD-5");
		Thread t6 = new Thread(creditTask, "CREDIT-THREAD-6");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();

	}

}
