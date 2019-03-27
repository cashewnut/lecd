package leetcode;

public class No190 {

	public int reverseBits(int n) {
		int res = 0;
		for (int i = 0; i < 32; i++) {
			int temp = n & 1;
			n >>= 1;
			res = res << 1 | temp;
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(new No190().reverseBits(43261596));
	}

}
