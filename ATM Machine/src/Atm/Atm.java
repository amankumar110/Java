package Atm;

public class Atm {
	
	private Bank bank;
	
	public Atm() {
		
	}
	
	public Atm(Bank bank) {
		this.bank = bank;
	}
	
	// Methods
	public int withdrawMoney(double amount,AccountHolder accountHolder) {
		
		if(accountHolder.getAccount().getAccountBalance() - amount >= bank.getMinAccountLimit() ) {
			
			// bank balance after deducting the requested withdrawal amount
			double  remainingBalance = accountHolder.getAccount().getAccountBalance() - amount;
			saveBalance(accountHolder.getAccount().getAccountId(),remainingBalance);
			TransactionHistory transaction = new TransactionHistory(amount,"23-8-2003");
			accountHolder.getAccount().addTransaction(transaction);
			
			// Status to be sent if withdrawal is completed
			return 1;
			
		} else 
			return 0;// Send status if withdrawal is failed
	}
	
	// Update the existing account details of the customer found through accountId
	public void saveBalance(long accountId,double balance ) {
		
		for(AccountHolder accountHolder : bank.getAccountHolders()) 

			if(accountHolder!=null) 	
				if(accountHolder.getAccount().getAccountId() == accountId) {		
					accountHolder.getAccount().setAccountBalance(balance);
					break;
				}
	}
	
	public int transferMoney(AccountHolder sender, long recieverId, double amount) {

		AccountHolder reciever = bank.getAccountHolder(recieverId);
		if(reciever!=null) {
			
			int status = this.withdrawMoney(amount, sender);
			if(status == 1) {
				
				double incrementedBalance = reciever.getAccount().getAccountBalance()+amount;
				saveBalance(recieverId,incrementedBalance);
			}
			return status;	
		}
		return 0;
	}
	
	// Setters and getters
	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
}
