package ugly_number;

public class IsUgly {
	
//	263. Ugly Number
//	
//	Write a program to check whether a given number is an ugly number.
//
//	Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.
//
//	Note that 1 is typically treated as an ugly number.
	
	public static boolean isUgly(int num) {
		
		if (num <= 0) return false;
        if (num % 2 == 0) return isUgly(num / 2);
        if (num % 3 == 0) return isUgly(num / 3);
        if (num % 5 == 0) return isUgly(num / 5);
        if (num == 1) return true;
        else return false;
        
//        Iteration solution
//        for (int i=2; i<6 && num>0; i++)
//            while (num % i == 0)
//                num /= i;
//        return num == 1;
    	}
}
