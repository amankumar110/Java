package Atm;

public class AccountHolder {
	
	private String name;
	private int age;
	private Account account;
	// Constructors
	public AccountHolder() {
		
	}
	
	public AccountHolder(String name, int age, Account account) {
		
		this.setName(name);
		this.setAge(age);
		this.setAccount(account);
	}
	
	// Setters & Getters

	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
	
		this.name = name;
	}
	
	public int getAge() {
		
		return age;
	}
	
	public void setAge(int age) {
		
		if(age >= 18)
			this.age = age;
	}
	
	public Account getAccount() {
		
		return account;
	}
	
	public void setAccount(Account account) {
		
		this.account = account;
	}
}
