package count_numbers_with_unique_digits;

public class CountNumbersWithUniqueDigits {
//	357. Count Numbers with Unique Digits  QuestionEditorial Solution  My Submissions
//	Total Accepted: 9646
//	Total Submissions: 22535
//	Difficulty: Medium
//	Given a non-negative integer n, count all numbers with unique digits, x, where 0 ≤ x < 10n.
//
//	Example:
//	Given n = 2, return 91. (The answer should be the total numbers in the range of 0 ≤ x < 100, excluding [11,22,33,44,55,66,77,88,99])
    public static int countNumbersWithUniqueDigits(int n) {
    	int[] array = new int[10];
    	array[0] = 10;
        	
        for (int i = 1; i < array.length; i++) {
        	
        	int temp = 9;
			for (int j = 9; j > 9 - i; j--) {
				temp *= j;
			}
			array[i] = array[i - 1] + temp;
		}
        
        if(n == 0) return 10;
    	return array[n - 1];
    }
}
