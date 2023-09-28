
public class Password {
	
   public String givePassword(int len) {
	   
	   char pass[] = new char[len];
	   
	   for(int i=0 ; i<len ; i++) {
		 pass[i] = (char) ( 48 + Math.round( (Math.random()*9) ) ) ;   
	   }
	   
	   return (new String(pass));
   }
   
   public String encryptedPasswordint(int len) {
	    
	   String pass = this.givePassword(len);
	   char pass2[] = new char[len+2];
	   
	   for(int i=0 ; i<len+1 ; i++) {
		   
		   if(i==0 || i==len) 
			     pass2[i] = '"';
		     else	
		         pass2[i] = pass.charAt(i);
	        
	   }
	   
	   return new String(pass2);
	   
   }
}
