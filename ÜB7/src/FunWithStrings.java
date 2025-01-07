public class FunWithStrings {
	
	public static void main(String[] args) {
		String text = "test";
		text = text.substring(0, 0);
		System.out.println(text);
		
	}
    static int countWords(String text) {
      /*  int count = 0;
        if (text == "") {
        	count++;
        }
        for (int i = 0; i< text.length();i++) {
        	if (text.charAt(i) == ' ');
        	count++;
        }
        return count;
        */
    	if (text == null || text.isEmpty())
    		return 0;
    	
    	return text.split(" ").length;
    }
    
    

    static String getQuotedText(String text) {
    	
    	if (text == null) 
    		return null;
        int firstIndex= 0;
        int lastIndex = 0;
        firstIndex = text.indexOf("\"");
        lastIndex = text.lastIndexOf("\"");
        if (firstIndex < 0 || firstIndex == lastIndex) 
        	return null;
        
        return text.substring(firstIndex+1, lastIndex);
        
    	
    }

    static String commonPrefix(String text1, String text2) {
        if (text1 == null || text2 == null)
        	return "";
        String prefix = text2;
        while (!text1.startsWith(prefix)) {
        	prefix = prefix.substring(0, prefix.length()-1);
        	
        }
        return prefix;
    }
}
