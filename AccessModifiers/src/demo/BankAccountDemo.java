package demo;
import bank.BankAccount;

public class BankAccountDemo {

	public static void main(String[] args) {
		
		BankAccount chequingAccount = new BankAccount("ABC", 100, "CHEQUING");
		
//		chequingAccount.balance = -1000;
		chequingAccount.accountHolderName = "sdfghjk";
		double balance = chequingAccount.debit(20);
		
		System.out.println(balance);
		
		balance = chequingAccount.credit(100);
		
		System.out.println(balance);
		
		Box b1 = new Box();
		b1.width = 20;
		b1.volume();

	}

}
