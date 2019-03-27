package leetcode;

import java.util.HashMap;
import java.util.Map;

public class No169 {
	
	//not the best solution
	public int MajorityElement(int[] nums) {
		int length = nums.length;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			if (!map.containsKey(i)) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}
		}
		for (Integer i : map.keySet()) {
			if (map.get(i) > length / 2)
				return i;
		}
		return 0;
	}
	
	public int MajorityElement2(int[] nums) {
		int count = 0;
		int cur = 0;
		for(int i : nums) {
			if(count == 0) {
				cur = i;
			}
			if(cur == i) {
				count++;
			}else
				count--;
		}
		return cur;
	}

	public static void main(String[] args) {
		System.out.println(new No169().MajorityElement2(new int[] { 3, 3, 2 }));
	}
}
