package leetcode;

public class No50 {

	public double myPow(double x, int n) {
		if (n == 0)
			return 1;
		if (n < 0)
			x = 1.0 / x;
		long nl = Math.abs(n);
		if (nl < 0)
			nl = Integer.MAX_VALUE + 1l;
		return nl % 2 == 0 ? myPow(x * x, (int)(nl / 2)) : x * myPow(x * x, (int)(nl / 2));
	}

	public static void main(String[] args) {
		System.out.println(new No50().myPow(2.0, 10));
	}

}
