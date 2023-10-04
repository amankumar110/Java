
public class Farmer {

	String name;
	int age;
	double interestRate;
	int termLength;
	int loanAmount;
	double simpleInterest; 
	
	Farmer() {
		
	}
	
	public Farmer(String name,int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public void setSimpleInterest() {
		simpleInterest = (this.interestRate*this.loanAmount*this.termLength)/100;
	}
}
