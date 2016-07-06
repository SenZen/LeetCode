package reverse_words;

import java.util.ArrayList;
import java.util.List;

public class ReverseWords {
	
//	151. Reverse Words in a String
//	Given an input string, reverse the string word by word.
//
//	For example,
//	Given s = "the sky is blue",
//	return "blue is sky the".
	
	public static String reverseWords(String s) {
		
		 if (s.equals("")) return "";
		 else {
		 String[] slist = s.split(" +");
		 String result = new String();
		 for (int i = slist.length - 1; i > -1; i--) {
			 result += slist[i] + " ";
		}
		 	
		 return result.trim();
	}
	}
	
}
