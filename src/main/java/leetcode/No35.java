package leetcode;

public class No35 {

    public int searchInsert(int[] nums, int target) {
        int from = 0, to = nums.length - 1;
        while (from <= to) {
            int mid = (from + to) >> 1;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                to = mid - 1;
            else
                from = mid + 1;
        }
        return from;
    }

    public static void main(String[] args) {
        System.out.println(new No35().searchInsert(new int[]{1,3,5,6},5));
    }

}
