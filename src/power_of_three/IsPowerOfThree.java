package power_of_three;

public class IsPowerOfThree {

//	326. Power of Three  QuestionEditorial Solution  My Submissions
//	Total Accepted: 51582
//	Total Submissions: 136792
//	Difficulty: Easy
//	Given an integer, write a function to determine if it is a power of three.
//
//	Follow up:
//	Could you do it without using any loop / recursion?
	
    public static boolean isPowerOfThree(int n) {
    	if(n == 1) return true;
    	
    	if(n <= 0 || n % 3 != 0) return false;
    	
        if(n == 3) return true;
          	
        return isPowerOfThree(n/3);
        
//        return ( n>0 &&  1162261467%n==0);
    }
}
