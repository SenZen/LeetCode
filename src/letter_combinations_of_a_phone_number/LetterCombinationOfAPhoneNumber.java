package letter_combinations_of_a_phone_number;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfAPhoneNumber {
//	17. Letter Combinations of a Phone Number  QuestionEditorial Solution  My Submissions
//	Total Accepted: 88653
//	Total Submissions: 297765
//	Difficulty: Medium
//	Given a digit string, return all possible letter combinations that the number could represent.
//
//	A mapping of digit to letters (just like on the telephone buttons) is given below.
//
//
//
//	Input:Digit string "23"
//	Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
	
    public static List<String> letterCombinations(String digits) {
    	List<String> s = new ArrayList<String>();
        Map<Character, String[]> map = new HashMap<Character, String[]>();
        String[] a = {"a", "b", "c"};
        map.put('2', a);
        String[] d = {"d", "e", "f"};
        map.put('3', d);
        String[] g = {"g", "h", "i"};
        map.put('4', g);
        String[] j = {"j", "k", "l"};
        map.put('5', j);
        String[] m = {"m", "n", "o"};
        map.put('6', m);
        String[] p = {"p", "q", "r", "s"};
        map.put('7', p);
        String[] t = {"t", "u", "v"};
        map.put('8', t);
        String[] w = {"w", "x", "y", "z"};
        map.put('9', w);
        
        for (int i = 0; i < digits.length(); i++) {
        	
		}
    }
}
