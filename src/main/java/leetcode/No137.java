package leetcode;

public class No137 {
	public int singleNumber(int[] nums) {
		int res = 0;
		for (int i = 0; i < 32; i++) {
			int temp = 0;
			for(int j : nums) {
				temp += (j>>i)&1;
			}
			res |= (temp%3)<<i;
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(new No137().singleNumber(new int[] {1,2,2,2,3,3,3}));
	}
}
