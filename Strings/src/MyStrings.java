public class MyStrings {

    public String giveShortestString(String str1 , String str2 , String str3) {
        
        if(str1.length() <= str2.length() && str1.length() <= str3.length()) 
            return str1;
         else if (str2.length() <= str3.length() ) 
            return str2;
         else 
            return str3;
        
    }

    public String giveShortestString(String str1 , String str2) {
        
         if (str1.length() <= str2.length() ) 
            return str1;
         else 
            return str2;
        
    }

    public StringBuilder longestPrefix(String str1 , String str2 , String str3) {

        StringBuilder longestPrefix = new StringBuilder("");
        String shortestString = giveShortestString(str1,str2,str3);
        int i;

        for(i=0 ; i<shortestString.length() ; i++) {
            if(str1.charAt(i) == str2.charAt(i) && str1.charAt(i) == str3.charAt(i)) 
                longestPrefix.append(str1.charAt(i));
            else
                break;
        }

        if(longestPrefix.length() > 0) return longestPrefix;

        return null;
    }


    public StringBuilder longestPrefix(String str1,String str2) {
          StringBuilder longestPrefix = new StringBuilder("");
        String shortestString = giveShortestString(str1,str2);
        int i;

        for(i=0 ; i<shortestString.length() ; i++) {
            if(str1.charAt(i) == str2.charAt(i)) 
                longestPrefix.append(str1.charAt(i));
            else 
                break;
        }

        if(longestPrefix.length() > 0) return longestPrefix;

        return null;
    }

    
    public String findAndReplace(String str, String findString, String replaceString) {
        int startingIndex = str.indexOf(findString);
    
        // If the findString is not found, return the original string
        if (startingIndex == -1) {
            return str;
        }
    
        StringBuilder returningString = new StringBuilder();
    
        // Append the characters before the found substring
        for (int i = 0; i < startingIndex; i++) {
            returningString.append(str.charAt(i));
        }
    
        // Append the replaceString
        returningString.append(replaceString);
    
        // Append the characters after the found substring
        for (int j = startingIndex + findString.length(); j < str.length(); j++) {
            returningString.append(str.charAt(j));
        }
    
        return returningString.toString();
    }
    
 }

