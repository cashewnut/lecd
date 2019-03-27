package leetcode;

import java.util.Arrays;

public class No33 {

	public int search(int[] nums, int target) {
		if (nums.length == 0)
			return -1;
		return pivot(nums, 0, nums.length - 1, target);
	}

	public int pivot(int[] nums, int i, int j, int target) {
		int res = -1;
		if (i < j) {
			int mid = (i + j) / 2;
			if (nums[mid] > nums[mid + 1]) {
				if (target == nums[j])
					res = j;
				else if (target == nums[i])
					res = i;
				else if (target > nums[j]) {
					int k = Arrays.binarySearch(nums, i, mid + 1, target);
					res = k >= 0 ? k : -1;
				} else if (target < nums[i]) {
					int k = Arrays.binarySearch(nums, mid + 1, j + 1, target);
					res = k >= 0 ? k : -1;
				}
			} else {
				int left_res = pivot(nums, i, mid, target);
				int right_res = pivot(nums, mid + 1, j, target);
				if (left_res != -1)
					res = left_res;
				else if (right_res != -1)
					res = right_res;
				else
					res = -1;
			}
		} else {
			if (nums[i] == target)
				res = i;
		}
		return res;
	}
	
//	If target is let's say 14, then we adjust nums to this, where "inf" means infinity:
//	[12, 13, 14, 15, 16, 17, 18, 19, inf, inf, inf, inf, inf, inf, inf, inf, inf, inf, inf, inf]
//
//	If target is let's say 7, then we adjust nums to this:
//	[-inf, -inf, -inf, -inf, -inf, -inf, -inf, -inf, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
	
	public int search2(int[] nums, int target) {
		int lo = 0, hi = nums.length;
	    while (lo < hi) {
	        int mid = (lo + hi) / 2;
	        
	        double num = (nums[mid] < nums[0]) == (target < nums[0])
	                   ? nums[mid]
	                   : target < nums[0] ? Integer.MIN_VALUE : Integer.MAX_VALUE;
	                   
	        if (num < target)
	            lo = mid + 1;
	        else if (num > target)
	            hi = mid;
	        else
	            return mid;
	    }
	    return -1;
	}
	

	public static void main(String[] args) {
		System.out.println(new No33().search(new int[] { 3, 5, 1 }, 5));
	}
}
