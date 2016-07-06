package two_sum_of_integers;

public class GetSum {
	/*
	 * 371. Sum of Two Integers
	 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
	 */
	public static int getSum(int a, int b) {
		if (b == 0) {
	        return a;
	    }
	    int sum, carry;
	    sum = a ^ b; //XOR to get current result
	    carry = (a & b) << 1; //get an additional carray
	    return getSum(sum, carry);
	}
}
