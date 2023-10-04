
public class Government {
	
	private static int  numberOfFarmers = 0;
    private static int amountDisbursed = 0;
    private static Farmer []farmers = new Farmer[100];
    
    
    public void addToFarmers(Farmer f) {
       
       farmers[numberOfFarmers] = f;
       amountDisbursed+=f.loanAmount;
       numberOfFarmers++;
       System.out.println("Added Successfully");
       Menu menu = new Menu();
       menu.takeInstruction();
    }
    
    public Farmer getFarmer(String name,int age) {

        for(Farmer f : farmers) {
            
            if(f.age == age && name.equals(f.name)) {
                return f;
            }

           
                
        }
        return null;
    }

}
