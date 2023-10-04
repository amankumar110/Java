
public class Government {
	
	private static int  numberOfFarmers = 0;
    private static int amountDisbursed = 0;
    private static Farmer []farmers = new Farmer[100];
    
    
    public static void addToFarmers(Farmer f) {
       
       farmers[numberOfFarmers] = f;
       amountDisbursed+=f.loanAmount;
       numberOfFarmers++;
       System.out.println("Added Successfully");
      
    }

    public Farmer[] getAllFarmers() {
        return farmers;
    }

    public int getTotalLoanAmount() {
        return this.amountDisbursed;
    }
    
    public static Farmer getFarmer(String name,int age) {

        for(int i=0;i<numberOfFarmers;i++) {
            
            if(farmers[i].age == age && name.equals(farmers[i].name)) {
                return farmers[i];
            }   
        }
        return null;
    }

}
