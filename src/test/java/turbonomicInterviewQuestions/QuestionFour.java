package turbonomicInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class QuestionFour {

	
	public static void main(String[] args) {
		
		String[] words = {
                "car", "cheating", "dale", "deal", "lead", "listen",
                "silent", "teaching"};
		groupFriendly(words);
	
	}
	
public static void groupFriendly(String[] words){
		//to store them in result
		List<List<String>> result = new ArrayList<>();
		
		//HashMap<String, List<String>> map = new HashMap<>();
		TreeMap<String, List<String>> map = new TreeMap<>();
		
		//for each word converting to char to sort them out alphabetically
		for(String word: words) {
			char[] chArr = word.toCharArray();
			Arrays.sort(chArr);
			String key = new String(chArr);
			//if else to see if sorted words match, if they do then we add them to matching key with word.
			if(map.containsKey(key)) {
				map.get(key).add(word);
				
			}else {
				List<String> strList = new ArrayList<>();
				strList.add(word);
				map.put(key, strList);
			}
		}
		result.addAll(map.values());
		//result.sort(Comparator.comparing(String::toString));
		//return result;
		result.forEach(i -> System.out.println(i + " "));
		result.forEach(i -> i.sort(Comparator.comparing(String::toString))); // to sort each array alphabeticaly
		
		System.out.println(result);
		//result.forEach(i -> Collections.sort(i)); // to sort each array alphabeticaly
		result.forEach(i -> System.out.println(i + " "));// this is sorted within !!!!!!
		
		//for (String[] sa : result) { stuck at figuring out how to put arrays in order after sorting within.
         //   System.out.println(Arrays.toString(sa));
       // }
		
	
	}
	
	
	
}
