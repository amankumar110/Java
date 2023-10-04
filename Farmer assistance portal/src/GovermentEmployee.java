public class GovermentEmployee {
    
    public void showAllFarmers() {

        Farmer[] farmers = Government.getAllFarmers();
        if(farmers[0] == null) {
            System.out.println("No Employees to show");
            System.exit(0);
        } else {

            for(Farmer f : farmers) {
                System.out.println(f.loanAmount);
            }
        }
    }
}
