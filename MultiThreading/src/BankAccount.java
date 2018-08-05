
public class BankAccount {
	
	private double balance;
	private Object debitLock = new Object();
	private Object creditLock = new Object();
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public synchronized void debit(double amount) {
//		synchronized(debitLock) {
//			balance = balance - amount;
//			System.out.println("[" + Thread.currentThread().getName() + "] balance after debit = "+ balance);
////			try {
////				Thread.sleep(2000);
////			} catch (InterruptedException e) {
////				// TODO Auto-generated catch block
////				e.printStackTrace();
////			}
//		}
		balance = balance - amount;
//		System.out.println("[" + Thread.currentThread().getName() + "] balance after debit = "+ balance);
	}
	
	public synchronized void credit(double amount) {
//		synchronized(creditLock) {
//			balance = balance + amount;
//			System.out.println("[" + Thread.currentThread().getName() + "] balance after credit = "+ balance);
//		}
		balance = balance + amount;
		System.out.println("[" + Thread.currentThread().getName() + "] balance after credit = "+ balance);
	}
	

}
