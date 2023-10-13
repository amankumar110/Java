public class GovermentEmployee {
    
    

    public GovermentEmployee() {
        
    }

    public void showAllFarmers() {
            
        final Government g = new Government();
        Farmer[] farmers = g.getAllFarmers();
        if(farmers[0] == null) {
            System.out.println("No Employees to show");
            System.exit(0);
        } else {

            for(Farmer f : farmers) {
                System.out.println(f.loanAmount);
            }
        }
    }

    public void totalLoanAmount() {
<<<<<<< HEAD
        final Government g = new Government();
        System.out.println("The Total Loan Amount Disbursed Is "+g.getTotalLoanAmount());
=======
        System.out.println("The totakl amount of loan disbursed is "+Government.getTotalAmountDisbursed());
>>>>>>> withStatic
    }
}
