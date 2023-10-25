package Atm;

public class Bank {
	
	private int minAccountLimit = 1200;
	
	private AccountHolder[] accountHolders = new AccountHolder[100];
	private int numOfAccountHolders=0;
	
	// Constructors
	public Bank() {
		
	}
	
	public Bank(AccountHolder[] accountHolders) {
		this.accountHolders = accountHolders;
	}

	
	
	
	// Setters and getters
	public int getMinAccountLimit() {
		return minAccountLimit;
	}
	
	public AccountHolder[] getAccountHolders() {
		return accountHolders;
	}

	public void setAccountHolders(AccountHolder[] accountHolders) {
		
		this.accountHolders = accountHolders;
	}
	
	public void setAccountHolder(AccountHolder accountHolder) {
		
		this.accountHolders[numOfAccountHolders] = accountHolder;
		numOfAccountHolders++;
	}
	
	public AccountHolder getAccountHolder(long accountId, int pin) {
			
		for(int i=0; accountHolders[i]!=null; i++) 
			if( accountHolders[i].getAccount().getAccountId() == accountId && accountHolders[i].getAccount().getPin() == pin  ) 
				return accountHolders[i];
			
		return null;
	}
	
	public AccountHolder getAccountHolder(long accountId) {
		
		for(int i=0; accountHolders[i]!=null; i++) 
			if( accountHolders[i].getAccount().getAccountId() == accountId ) 
				return accountHolders[i];
			
		return null;
	}
	
}
