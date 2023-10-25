package Atm;

import java.util.Scanner;

import utils.Printer;

public class Menu {
	
	public Printer printer = new Printer();
	private Scanner in = new Scanner(System.in);
	
	public void takeInstructions(AccountHolder accountHolder,Atm atm) {
		
		printer.printInstructions(accountHolder.getName());
		System.out.println(); // This one is for formatting please ignore
		System.out.println("Enter prompt : ");
		int option = in.nextInt();
		
		if(option == 1)
			printer.printBankBalance(accountHolder.getAccount().getAccountBalance());
		else if(option == 2) {
			
			System.out.println(); // Ignore this, It is only for formatting
			System.out.println("Enter the withdrawal amount please : ");
			double amount = in.nextDouble();
			if(amount>=0)
				sendWithdrawalRequest(amount, accountHolder,atm);
			else
				System.out.println("Amount is illegal and discourageous");
			
		} else if(option == 3) {
			
			System.out.println(); // Ignore this, It is only for formatting
			System.out.println("Enter the reciever's account number please : ");
			long recieverId = in.nextLong();
			System.out.println(); // Ignore this, It is only for formatting
			System.out.println("Enter the transfer amount please : ");
			double amount1 = in.nextDouble();
			sendTransferRequest(accountHolder,recieverId,amount1,atm);
		} else if(option == 4) {
			
			printer.printTransactions(accountHolder.getAccount().getTransactions());
		}
	}
	
	public void sendWithdrawalRequest(double amount,AccountHolder ah,Atm atm) {
		
		int status = atm.withdrawMoney(amount,ah);
		if(status == 1)
			System.out.println("Withdrawal successful");
		else if(status==0)
			System.out.println("Withdrawal failed");
	}
	
	public void sendTransferRequest(AccountHolder sender, long recieverId, double amount,Atm atm) {
		
		if(sender.getAccount().getAccountId() == recieverId) {
			System.out.println("Invalid operation");
			return;
		}
		
		int status = atm.transferMoney(sender, recieverId, amount);
		AccountHolder reciever = atm.getBank().getAccountHolder(recieverId);
		
		if(status == 1) 
			System.out.println("Transfer successful to "+reciever.getName());
		else if(status == 0) 
			System.out.println("Transfer failed");
	}

}
