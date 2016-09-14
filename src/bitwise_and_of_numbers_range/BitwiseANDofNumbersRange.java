package bitwise_and_of_numbers_range;

public class BitwiseANDofNumbersRange {
//	201. Bitwise AND of Numbers Range  QuestionEditorial Solution  My Submissions
//	Total Accepted: 39301
//	Total Submissions: 123793
//	Difficulty: Medium
//	Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.
//
//	For example, given the range [5, 7], you should return 4.
    public static int rangeBitwiseAnd(int m, int n) {
        if (n == m) {
            return n;
        }
        return rangeBitwiseAnd(m / 2, n / 2) << 1;
    }

}
