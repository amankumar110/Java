
public class Strings {

	public static void main(String[] args) {
		
		// Different initializations for strings
		String str1 = "Kaneal";  //SPC
		
		String str2 = new String("manav"); //Main Heap Area
		
		char a[] = {'a','m','a','n'};
		String str3 = new String(a); // Main Heap Area
		
		// Password class and object
		Password pass = new Password();
		String newPass = pass.givePassword(9);
		System.out.println(newPass);
		String encryptedPass = pass.encryptedPasswordint(9);
		System.out.println(encryptedPass);
       
		// String comparisons
	    String scmp1 = "Aman";
	    String scmp2 = "Aman";
	    System.out.println(scmp1 == scmp2); //TRUE
	    // == is a reference comparison operator and since both the Strings have some literals so they are pointing at same literal in SCP
	    String scmp3 = new String("Aman");
	    System.out.println(scmp1 == scmp3); // False
	    // Even though both have same literals but scmp3 will be allocated in the main heap area and their address is different
	    
	    // Equals Method
	    System.out.println( scmp1.equals(scmp2) );
	    System.out.println( scmp1.equals(scmp3) ); // Both are True 
	    // Equals method compares the literals which are same
	    
	    // EqualsIgnoreCase method
	    String scmp4 = "aman";
	    System.out.println( scmp1.equalsIgnoreCase(scmp4) ); // True because equalsIgnoreCase method ignores the case and checks only the letters
	    
	    // CompareTo method
	    String e1 = "Eagle";
	    String e2 = "Elephant";
	    System.out.println(e1.compareTo(e2)); // -11
	    // it returns the difference between Bitcode value of first nonMatching characters in case a and l it is -11
	    // Returns 0 if strings are zer0
	   
	    // String Concatenate Method
	    String sc1 = "Earth";
	    String sc2 = "Is Our Mother";
	    
	    // 1st is + operator
	    System.out.println(sc1+" "+sc2);
	    // Earth Is Our Mother
	    
	    
	     // 2nd concat method
	      System.out.println(sc1.concat(sc2));
	      // Earth Is Our Mother
	}

}
