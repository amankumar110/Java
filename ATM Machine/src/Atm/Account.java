package Atm;

public class Account {
	
	private double accountBalance;
	private TransactionHistory transactions[] = new TransactionHistory[10];
	private int pin;
	private long accountId;
	private int numOfTransactions;
	// Constructor
	public Account() {
		
	}
	
	public Account(double accountBalance,int pin,long accountId) {
		
		this.setAccountBalance(accountBalance);
		this.setTransactions(transactions);
		this.setPin(pin);
		this.setAccountId(accountId);
	}
	
	public void addTransaction(TransactionHistory transaction) {
		
		transactions[numOfTransactions++] = transaction;
	}
	
	// setters & getters
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public TransactionHistory[] getTransactions() {
		return transactions;
	}
	
	public void setTransactions(TransactionHistory[] transactions) {
		this.transactions = transactions;
	}
	
	public long getAccountId() {
		return accountId;
	}
	
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
	
}
