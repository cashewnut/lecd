package leetcode;

import java.util.Arrays;

public class No34 {

    public int[] searchRange(int[] nums, int target) {
        int min = -1,max = -1;
        int index = Arrays.binarySearch(nums, target);
        if (index >= 0) {
            min = index;
            max = index;
            int from = Arrays.binarySearch(nums, 0, min, target);
            int to = -1;
            if(max != nums.length - 1)
                to = Arrays.binarySearch(nums, max + 1, nums.length, target);
            while (from >= 0) {
                min = from;
                from = Arrays.binarySearch(nums, 0, min, target);
            }
            while (to >= 0 && max != nums.length - 1) {
                max = to;
                to = Arrays.binarySearch(nums, max + 1, nums.length, target);
            }
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        System.out.println(new No34().searchRange(new int[]{5,7,7,8,8,10},6)[0]);
        System.out.println(new No34().searchRange(new int[]{5,7,7,8,8,10},6)[1]);
    }

}
