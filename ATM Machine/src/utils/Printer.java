package utils;

import java.util.Scanner;

import Atm.TransactionHistory;

public class Printer {
	
	private Scanner in = new Scanner(System.in);
	
	public void greet() {
			
		addSpaces(15, 5,"*");
		System.out.print("Welcome to our ATM");
		addSpaces(15, 0,"*");
		addSpaces(0, 5);
	}
	
	public void printInstructions(String name) {
		
		addSpaces(15,5,"-");
		System.out.print("Welcome "+name);
		addSpaces(15,0,"-");
		addSpaces(0,3);
		System.out.print(" - Enter 1 for checking account balance ");
		addSpaces(15,0);
		System.out.print(" - Enter 2 for cash withdrawal");
		addSpaces(0,2);
		System.out.print(" - Enter 3 to balance transfer");
		addSpaces(15,0);
		System.out.print(" - Enter 4 for viewing previously made transactions");
	}
	
	public void printBankBalance(double bankBalance) {
		
		System.out.println("Your outsanding bank balance is "+bankBalance);
	}
	
	public void printTransactions(TransactionHistory[] transactions) {
			
		addSpaces(15,0,"*");
		System.out.print("Bank Records : ");
		addSpaces(15,0,"*");
		addSpaces(0,2);
		for(TransactionHistory transaction :  transactions) 
			if(transaction!=null) 
				System.out.println(" -"+transaction.getAmount()+" on "+transaction.getDate());
			else
				break;
	}
	
	// Space methods
	private void addSpaces(int horizontal,int vertical) {
		
		for(int i=0; i<vertical; i++) 
			System.out.println();
		
		for(int i=0; i<horizontal; i++) 
			System.out.print(" ");
	}
	
	private void addSpaces(int horizontal,int vertical,String symbol) {
		
		for(int i=0; i<vertical; i++) 
			System.out.println();
		
		for(int i=0; i<horizontal; i++) 
			System.out.print(symbol);		
	}
	
}
