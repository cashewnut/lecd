package leetcode;

public class No201 {

	public int rangeBitwiseAnd(int m, int n) {
		if (m == 0)
			return m;
		if (m == n)
			return m;
		int res = 0;
		for (int i = 31; i >= 0; i--) {
			int mi = m >> i & 1;
			int ni = n >> i & 1;
			if (mi != 0 || ni != 0) {
				if (mi != ni)
					return 0;
				else {
					res = 1 << i;
					i--;
					while (i >= 0) {
						mi = m >> i & 1;
						ni = n >> i & 1;
						if (mi == ni) {
							res |= (mi << i);
							i--;
						} else
							return res;
					}
				}
			}
		}
		return res;
	}
	
	public int rangeBitwiseAnd2(int m, int n) {
	    return (n > m) ? (rangeBitwiseAnd(m/2, n/2) << 1) : m;
	}

	public static void main(String[] args) {
		System.out.println(new No201().rangeBitwiseAnd(6, 7));
	}

}
