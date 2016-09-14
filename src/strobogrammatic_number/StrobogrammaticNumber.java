package strobogrammatic_number;

public class StrobogrammaticNumber {
//	246. Strobogrammatic Number  QuestionEditorial Solution  My Submissions
//	Total Accepted: 11702
//	Total Submissions: 31530
//	Difficulty: Easy
//	A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).
//
//	Write a function to determine if a number is strobogrammatic. The number is represented as a string.
//
//	For example, the numbers "69", "88", and "818" are all strobogrammatic.
	
	public static boolean isStrobogrammatic(String num) {
    	if(num.contains("2")||num.contains("3")||num.contains("4")||num.contains("5")||num.contains("7")) return false; 
    	String p = new StringBuilder(num).reverse().toString();
    	for (int i = 0; i < num.length(); i++) {
			if(num.charAt(i) == '8' && p.charAt(i) != '8') return false;
			if(num.charAt(i) == '6' && p.charAt(i) != '9') return false;
			if(num.charAt(i) == '9' && p.charAt(i) != '6') return false;
			if(num.charAt(i) == '1' && p.charAt(i) != '1') return false;
			if(num.charAt(i) == '0' && p.charAt(i) != '0') return false;
		}
    	return true;
    }
	
//	for (int i=0, j=num.length()-1; i <= j; i++, j--)
//        if (!"00 11 88 696".contains(num.charAt(i) + "" + num.charAt(j)))
//            return false;
//    return true;
}
