package remove_duplicate_letters;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateLetters {
//	316. Remove Duplicate Letters  QuestionEditorial Solution  My Submissions
//	Total Accepted: 15676
//	Total Submissions: 60082
//	Difficulty: Hard
//	Given a string which contains only lowercase letters, remove duplicate letters so that every letter appear once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.
//
//	Example:
//	Given "bcabc"
//	Return "abc"
//
//	Given "cbacdcbc"
//	Return "acdb"
    public static String removeDuplicateLetters(String s) {
    	Set<Character> set = new HashSet<Character>();
    	char[] charArray = s.toCharArray();
    	String p = "";
    	Arrays.sort(charArray);
    	for (int i = 0; i < charArray.length; i++) {
    		if(set.add(charArray[i])) {
    			p += charArray[i];
    		}
		}
     return p;   
    }
}
