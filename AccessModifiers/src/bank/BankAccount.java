package bank;

public class BankAccount 
{
	
	public String accountHolderName;
	private String accountType;
	protected double balance;
	
	public BankAccount(String accountHolderName, double balance, String accountType)
	{
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType = accountType;
	}
	
	public double debit(double amount)
	{
		if (amount > 0 && amount <= balance)
		{
			balance -= amount;
		}
		
		return balance;
	}
	
	public double credit(double amount)
	{
		if (amount > 0)
		{
			balance += amount;
		}
		
		return balance;
	}
}
