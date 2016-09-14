package valid_anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ValidAnagram {
	// 242. Valid Anagram QuestionEditorial Solution My Submissions
	// Total Accepted: 92646
	// Total Submissions: 216257
	// Difficulty: Easy
	// Given two strings s and t, write a function to determine if t is an
	// anagram of s.
	//
	// For example,
	// s = "anagram", t = "nagaram", return true.
	// s = "rat", t = "car", return false.
	//
	// Note:
	// You may assume the string contains only lowercase alphabets.
	public static boolean isAnagram(String s, String t) {

		// too slow 105ms
		// List<Character> sList = new ArrayList<Character>();
		// List<Character> tList = new ArrayList<Character>();
		//
		// for (int i = 0; i < s.length(); i++) {
		// if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
		// sList.add(s.charAt(i));
		// }
		// }
		//
		// for (int i = 0; i < t.length(); i++) {
		// if(t.charAt(i) >= 'a' && t.charAt(i) <= 'z') {
		// tList.add(t.charAt(i));
		// }
		// }
		//
		// Collections.sort(sList);
		// Collections.sort(tList);
		//
		// return sList.equals(tList);

		// 7ms
		char[] aChar = s.toCharArray();
		Arrays.sort(aChar);
		char[] bChar = t.toCharArray();
		Arrays.sort(bChar);
		String a1 = new String(aChar);
		String b1 = new String(bChar);
		return a1.equals(b1);

		// 7ms use alphabet is a clever way to go
		// int[] alphabet = new int[26];
		// for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
		// for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
		// for (int i : alphabet) if (i != 0) return false;
		// return true;
	}
}
