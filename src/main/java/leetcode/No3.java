package leetcode;

import java.util.HashMap;
import java.util.Map;

public class No3 {

    public int lengthOfLongestSubstring1(String s) {
        char[] chars = s.toCharArray();
        int max = 0, j = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], i);
                max = Math.max(max, i - j + 1);
            } else {
                j = Math.max(j, map.get(chars[i]) + 1);
                max = Math.max(max, i - j + 1);
                map.put(chars[i], i);
            }
        }
        return max;
    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int[] length = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        int max = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                length[i] = 1;
            } else {
                if (map.containsKey(chars[i])) {
                    int d = i - map.get(chars[i]);
                    length[i] = d > length[i - 1] ? length[i - 1] + 1 : d;
                } else {
                    length[i] = length[i - 1] + 1;
                }
            }
            max = length[i] > max ? length[i] : max;
            map.put(chars[i], i);
        }
        return max;
    }

    public static void main(String[] args) {
        No3 n = new No3();
        System.out.println(n.lengthOfLongestSubstring("pwwkew"));
    }

}
