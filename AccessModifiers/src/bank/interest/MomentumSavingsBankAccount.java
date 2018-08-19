package bank.interest;

import bank.BankAccount;

public class MomentumSavingsBankAccount extends BankAccount {
	
	double interestRate = 0.5;

	MomentumSavingsBankAccount(String accountHolderName, double balance, String accountType)
	{
		super(accountHolderName, balance, accountType);
	}

	MomentumSavingsBankAccount(String accountHolderName, double balance, String accountType, double interestRate)
	{
		super(accountHolderName, balance, accountType);
		this.interestRate = interestRate;
	}
	
	void compoundQuarterlyInterest() 
	{
		balance += (balance * interestRate * 3) / 100;
		
//		BankAccount savingsAccount = new BankAccount("DEF", 1000, "SAVINGS");
//		savingsAccount.balance = -1000;
	}

}
