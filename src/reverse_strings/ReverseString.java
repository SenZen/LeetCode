package reverse_strings;


//344. Reverse String
//Write a function that takes a string as input and returns the string reversed.
//
//Example:
//Given s = "hello", return "olleh".

public class ReverseString {
	
	
	public static String reverseString(String s) {

		// LTE limited time exceed
//		String reverse = new String();
//		
//		for (int i = 0; i < s.length(); i++) {
//			reverse += s.charAt(s.length() - i - 1);
//		}
//		return reverse;
		
		
		// cheating methods
//		return new StringBuilder(s).reverse().toString();
		
		// recursion
		int length = s.length();
		if (length <= 1) return s;
		
		String leftString = s.substring(0, length/2);
		String rightString = s.substring(length/2, length);
		
		return reverseString(rightString) + reverseString(leftString);

	}
}
