package palindrome_permutation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PalindromePermutation {

	
//	266. Palindrome Permutation  QuestionEditorial Solution  My Submissions
//	Total Accepted: 14282
//	Total Submissions: 27619
//	Difficulty: Easy
//	Given a string, determine if a permutation of the string could form a palindrome.
//
//	For example,
//	"code" -> False, "aab" -> True, "carerac" -> True.
	
    public static boolean canPermutePalindrome(String s) {
    	Set<Character> set = new HashSet<Character>();
    	for (int i = 0; i < s.length(); i++) {

			if(set.contains(s.charAt(i))){
				set.remove(s.charAt(i));
			}
			else set.add(s.charAt(i));
		}
    	return set.size() < 2;
    }
}
