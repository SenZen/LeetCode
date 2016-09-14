package implement_strStr;

public class ImplementStrStr {
//	28. Implement strStr()  QuestionEditorial Solution  My Submissions
//	Total Accepted: 117384
//	Total Submissions: 459081
//	Difficulty: Easy
//	Implement strStr().
//
//	Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
    public static int strStr(String haystack, String needle) {
    	
    	if(needle.length() > haystack.length()) return -1;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
			if(haystack.substring(i, i + needle.length()).equals(needle)) return i;
		}
        return -1;
    }
}
