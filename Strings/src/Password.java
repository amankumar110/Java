
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
	   StringBuilder pass2 = new StringBuilder("");
	   
	   for(int i=0 ; i<len+1 ; i++) {
		   
		   if(i==0 || i==len) 
			     pass2.append('"');
		     else	
		         pass2.append(pass.charAt(i));
	        
	   }
	   
	   return new String(pass2);
	   
   }
}
