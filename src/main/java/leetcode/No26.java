package leetcode;

public class No26 {

	public int removeDuplicates(int[] nums) {
		if(nums.length == 0)
			return 0;
		int length = 1;
		int cur = nums[0];
		int index = 1;
		for(int i : nums) {
			if(i != cur) {
				cur = i;
				nums[index++] = cur;
				length++;
			}
		}
		return length;
	}
	
	public static void main(String[] args) {
		System.out.println(new No26().removeDuplicates(new int[] {1,1,2,3,4}));
	}

}
