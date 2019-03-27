package leetcode;

public class No136 {
	public int singleNumber(int[] nums) {
		int length = nums.length;
		int res = nums[0];
		for (int i = 1; i < length; i++) 
			res ^= nums[i];
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(new No136().singleNumber(new int[] {4,2,2,1,1}));
	}
}
