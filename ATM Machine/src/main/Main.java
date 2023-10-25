package main;

import java.util.Scanner;

import Atm.*;

public class Main {
	
	public static void main(String[] args) {
		
		Menu menu  = new Menu();
		Scanner in = new Scanner(System.in);
		Bank bank = new Bank();
		Atm atm = new Atm(bank);
		
		// pre defined accounts
		
		Account acc = new Account(1_00_000,170,45301);
		AccountHolder a = new AccountHolder("Rahul Tejas", 20, acc);
		atm.getBank().setAccountHolder(a);
		
		Account acc2 = new Account(45_000,171,45302);
		AccountHolder a2 = new AccountHolder("Went charles",34,acc2);
		atm.getBank().setAccountHolder(a2);
		
		// Greet customer
		menu.printer.greet();
		
		
		// Take information for account
		System.out.println("Enter the account ID : ");
		long accountId = in.nextLong();
		System.out.println("Enter the pin code (XXX) : ");
		int pin = in.nextInt();
		
		// Finding the customer record
		AccountHolder accountHolder = atm.getBank().getAccountHolder(accountId, pin);
		
		// checking after finding
		if(accountHolder==null) 
			System.out.println("No Account was found!");
		else 
			while(true) 
				menu.takeInstructions(accountHolder, atm);
		in.close();
		
	}
	


}
