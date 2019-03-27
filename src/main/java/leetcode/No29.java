package leetcode;

public class No29 {

	public int divide(int dividend, int divisor) {
		int signal = dividend >= 0 && divisor > 0 || dividend < 0 && divisor < 0 ? 1 : -1;
		long dis = Math.abs(divisor);
		long did = Math.abs(dividend);
		if (dis == Integer.MIN_VALUE)
			dis = Integer.MAX_VALUE + 1l;
		if (did == Integer.MIN_VALUE)
			did = Integer.MAX_VALUE + 1l;

		long res = 0;
		while (did >= dis) {
			long tmp = dis;
			long tmpres = 1;
			while (did >= (tmp << 1)) {
				tmp <<= 1;
				tmpres <<= 1;
			}
			res += tmpres;
			did -= tmp;
		}
		if(res * signal == Integer.MAX_VALUE + 1l)
			return Integer.MAX_VALUE;
		return (int) (res * signal);
	}

	public static void main(String[] args) {
		System.out.println(new No29().divide(Integer.MIN_VALUE, -1));
	}

}
