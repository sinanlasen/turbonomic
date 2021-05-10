package turbonomicInterviewQuestions;

import java.util.Arrays;

public class QuestionOne {

	public static void main(String[] args) {
		strsAreAnagram("ARMY", "MARY");

	}

	public static void strsAreAnagram(String str1, String str2) {  
        // convert each string to characters in array
	 char[] ArrayS1 = str1.toLowerCase().toCharArray();  
     char[] ArrayS2 = str2.toLowerCase().toCharArray(); 
      // compare their length and if they are not same than they are not anagrams
        if (str1.length() != str2.length()) {  
            System.out.println(str1 + " and " + str2 + " are not anagrams"); 
            //Sort them in order
        } else {  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);    
        }  
        // than if else to see they are equal or not to determine the output
        if (Arrays.equals(ArrayS1, ArrayS2)) {  
            System.out.println(str1 + " and " + str2 + " are anagrams");  
        } else {  
            System.out.println(str1 + " and " + str2 + " are not anagrams");  
        }  
    }  
}
