package ugly_number_2;

import java.util.ArrayList;
import java.util.List;

import ugly_number.IsUgly;

//264. Ugly Number II
//
//Write a program to find the n-th ugly number.
//
//Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
//
//Note that 1 is typically treated as an ugly number.

public class NthUglyNumber {

	public static int min(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}

	public static int nthUglyNumber(int n) {

		int factor2 = 2, factor3 = 3, factor5 = 5;
		int index2 = 0, index3 = 0, index5 = 0;
		int[] ugly = new int[n];
		ugly[0] = 1;

		for (int i = 1; i < n; i++) {
			int min = min(factor2, factor3, factor5);
			ugly[i] = min;
			if (factor2 == min)
				factor2 = 2 * ugly[++index2];
			if (factor3 == min)
				factor3 = 3 * ugly[++index3];
			if (factor5 == min)
				factor5 = 5 * ugly[++index5];
		}
		return ugly[n - 1];
	}

	// LTE
	// int uglyseq = 1, numseq = 1;
	// while (uglyseq < n) {
	// numseq++;
	// if (IsUgly.isUgly(numseq)) uglyseq++;
	// }
	// return numseq;
	// }
}
