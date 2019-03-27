package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No260 {

	public int[] singleNumber(int[] nums) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i : nums) 
			map.put(i, map.getOrDefault(i, 0) + 1);
		List<Integer> res = new ArrayList<>();
		for(int i : map.keySet()) 
			if(map.get(i) == 1)
				res.add(i);
		int[] result = new int[res.size()];
		int j = 0;
		for(int i : res) 
			result[j++] = i;
		return result;
	}
	
	public int[] singleNumber2(int[] nums) {
		int diff = 0;
        for (int num : nums) {
            diff ^= num;
        }
        // Get its last set bit
        diff &= -diff;
        
        // Pass 2 :
        int[] rets = {0, 0}; // this array stores the two numbers we will return
        for (int num : nums)
        {
            if ((num & diff) == 0) // the bit is not set
            {
                rets[0] ^= num;
            }
            else // the bit is set
            {
                rets[1] ^= num;
            }
        }
        return rets;
	}
	
	public static void main(String[] args) {
		//System.out.println(new No260().singleNumber2(new int[] {1,1,2,2,3,5}));
		System.out.println(6&(-6));
	}

}
