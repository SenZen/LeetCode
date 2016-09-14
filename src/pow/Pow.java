package pow;

public class Pow {
	public static double myPow(double x, int n) {

		if (x == 0)
			return 0;

		if (x == 1 || x == -1)
			return 1;

		if (n == 0)
			return 1;

		if (n == Integer.MIN_VALUE)
			return 0;

		if (n > 0 && (n & 1) == 0) {
			return myPow(x * x, n / 2);
		}

		else if (n > 0 && (n & 1) == 1)
			return myPow(x * x, n / 2) * x;

		else
			return 1 / myPow(x, -n);

	}

	// public static int pow(int n, int a) {
	// int res = 1;
	// while(a != 0) {
	// if((a & 1) == 1) res = n * res;
	// n = n * n;
	// a >>= 1;
	// }
	// return res;
	// }
}
