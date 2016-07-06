package add_digits;

public class AddDigits {
	public static int addDigits(int num) {

		
		/*
		 * 
		 * 258. Add Digits
		 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

		 *For example:

		 *Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
		 */
				
		
		// Algorithm solution
		// (num - 1) % 9 + 1
		return num - (num - 1) / 9 * 9;
		
		// additional function need to be used when using iteration
//		if (num < 10) return num;
//		
//		int m = 0;
//		for (; num > 0; num = num / 10) {
//			m += num % 10;
//		}
//		num = m;
//		
//		return addDigits(num);
    }
}
