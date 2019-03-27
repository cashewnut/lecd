package leetcode;

public class No31 {

	public void nextPermutation(int[] nums) {
		int length = nums.length;
		int i = length - 1;
		while (i > 0 && nums[i] <= nums[i - 1])
			i--;
		if (i != 0) {
			int min = Integer.MAX_VALUE;
			int minindex = length - 1;
			int j = length - 1;
			while (j >= i) {
				if (nums[j] > nums[i - 1]) {
					if (min >= nums[j]) {
						min = nums[j];
						minindex = j;
					}
				}
				j--;
			}
			int temp = nums[i - 1];
			nums[i - 1] = nums[minindex];
			nums[minindex] = temp;
			for (; minindex < length - 1; minindex++) {
				if (nums[minindex] < nums[minindex + 1]) {
					temp = nums[minindex];
					nums[minindex] = nums[minindex + 1];
					nums[minindex + 1] = temp;
				}
			}
		}
		int j = length - 1;
		while (i < j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}

	}

	public static void main(String[] args) {
		new No31().nextPermutation(new int[] { 2, 3, 1 });
	}

}
