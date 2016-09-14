package factorial_trailing_zeroes;

public class FactorialTrailingZeroes {
	
//	Given an integer n, return the number of trailing zeroes in n!.
//
//			Note: Your solution should be in logarithmic time complexity.
//
//			Credits:
//			Special thanks to @ts for adding this problem and creating all test cases.
    public static int trailingZeroes(int n) {
    	
    	int count = 0;
    	for (int i = 1; i < 14; i++) {
			count += n / Math.pow(5, i);
		}
        return count;
        
//        int cnt = 0;
//        while(n>0){
//            cnt += n/5;
//            n/=5;
//        }
//        return cnt;
    }
}
