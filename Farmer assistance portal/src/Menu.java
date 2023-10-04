import java.util.Scanner;

public class Menu {

	Scanner in = new Scanner(System.in);
	
	public void showLogo() {
		
		int n=5;
		int space = 50;
		
		//Adding vertical spaces
		for(int i=0;i<5;i++) 
			System.out.println();
		
		// Adding horizontal spaces
		for(int i=0;i<space;i++) {
			System.out.print(" ");
		}
		
		for(int star1=0;star1<3*n+2;star1++) {
		
			if(star1==n || star1==(2*n)+1) 
				System.out.print(" ");
			else 
				System.out.print("*");
		}
		 System.out.println();
		 
		// Adding horizontal spaces
			for(int i=0;i<space;i++) {
				System.out.print(" ");
			}
		
		 for(int star2=0;star2<3*n+2;star2++) {
			 
			 if(star2==0 || star2==n+1 || star2==2*n || star2==2*n+2 || star2==3*n+1) 
				 System.out.print("*");
			 else
				 System.out.print(" ");
		 }
		 System.out.println();
		 
		// Adding horizontal spaces
			for(int i=0;i<space;i++) {
				System.out.print(" ");
			}
			
		 for(int star3=0;star3<3*n+2;star3++) {
			 
			 if(star3==n || star3==2*n+1)
				 System.out.print(" ");
			 else 
				 System.out.print("*");
		 }
		 System.out.println();
		 
		// Adding horizontal spaces
			for(int i=0;i<space;i++) {
				System.out.print(" ");
			}
			
		 for(int star4=0;star4<3*n+2;star4++) {
			
			 if(star4==0 || star4==n+1 || star4==2*n || star4==2*n+2 ) 
				 System.out.print("*");
			 else
				 System.out.print(" ");
	     }
		 System.out.println();
		 
		// Adding horizontal spaces
			for(int i=0;i<space;i++) {
				System.out.print(" ");
			}
			
		 for(int star5=0;star5<3*n+2;star5++) {
			 

			 if(star5==0 || star5==n+1 || star5==2*n || star5==2*n+2 ) 
				 System.out.print("*");
			 else
				 System.out.print(" ");
		 }
		 
			
			//Adding vertical spaces
			for(int i=0;i<5;i++) 
				System.out.println();
			
	}
	

	public void takeInstruction() {
		

		System.out.println(" - Enter 1 for registering.");
		System.out.println(" - Enter 2 for retrieving information.");
		System.out.println("Enter Command : ");
		int option = in.nextInt();
		
		if(option == 1) {
			this.addFarmer();
		} else if(option==2) 
		    this.showInfo();
	}
	
	public void addFarmer() {
		boolean isValidated = false;
		
		do {
			
			System.out.println("Enter your name : ");
			in.nextLine();
		    String name =  in.nextLine();
		    
		    System.out.println("Enter your age : ");
		    int age = in.nextInt();
		    
		    if(name.length() > 0 && age >18 && age<60) {
		    	
		    
		    	isValidated = true;
		        Farmer f1 = new Farmer(name,age);
		        takeLoanInfo(f1);

		    }
		    else {
		    	
		    	System.out.println("Following conditions are needed to meet for further process :");
		    	System.out.println("1. Age must be 18 or greater but less than 60 ");
		    	System.out.println("2. Frmer should be a native of the state ");
		    	System.out.println(" - Head over to your nearest policy department for further process");
		    }
		} while(!isValidated);
	}
	
	public void takeLoanInfo(Farmer f) {
		boolean isValidated = false;
		
		do {
			
		   System.out.println(" - Enter The Loan Amount *( 5,000 - 80,000 ): ");
		   int loanAmount = in.nextInt();
		   
		   System.out.println(" - Enter The Term Duration Of Loan *(1 - 4) years : ");
		   int term = in.nextInt();
		   
		   if(loanAmount>=5_000 && loanAmount<=80_000 && term>=1 && term<=4) {
			   
			  double interestRate;
			   if(loanAmount<=50_000)
				   interestRate = 3.12;
			   else
				   interestRate = 2.57;
			   
			   f.interestRate = interestRate;
			   f.loanAmount = loanAmount;
			   f.termLength = term;
			   f.setSimpleInterest();
			   Government g = new Government();
		        g.addToFarmers(f);
			   isValidated = true;
			   
		   }
		   
		} while(!isValidated);
	}

	public void showInfo() {

		Government g = new Government();
		in.nextLine();
		System.out.println("Enter Your Name");
		String name = in.nextLine();
		System.out.println("Enter your age :");
		int age = in.nextInt();
		Farmer f = g.getFarmer(name,age);

		if(f == null) {
			System.out.println("No Application Was Found");
			this.takeInstruction();
		} else {
		    this.displayFarmer(f);
			this.takeInstruction();
		}
	}

	public void displayFarmer(Farmer f) {

		// Adding vertical spaces
		for(int i=0;i<5;i++)
		  System.out.println();

		for(int i=0;i<15;i++) {
			System.out.print("/");
		}
		System.out.println(" Displaying Information For "+f.name);
		System.out.println("   -  Age : "+f.age);
		System.out.println("   -  Loan Amount : "+f.loanAmount);
		System.out.println("   - Term Length : "+f.termLength);
		System.out.println("   - Interest Rate : "+f.interestRate);
		System.out.println("   - Simple Interest Rate : "+f.simpleInterest);
	}
}
