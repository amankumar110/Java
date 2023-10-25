package Atm;

import java.util.Date;

public class TransactionHistory {
	
	private double amount;
	private String date;
	private String transactionType;
	
	// Constructors
	public TransactionHistory() {
		
	}
	
	public TransactionHistory(double amount,String date) {
		
		this.setAmount(amount);
		this.setDate(date);
	}
	
	// setters & getters
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getDate() {
		return this.date.toString();
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
