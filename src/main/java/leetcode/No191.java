package leetcode;

public class No191 {

	public int hammingWeight(int n) {
		int count = 0;
		for (int i = 0; i < 32; i++) {
			int j = n & 1;
			if (j == 1)
				count++;
			n >>= 1;
		}
		return count;
	}

}
