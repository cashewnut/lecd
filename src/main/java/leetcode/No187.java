package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No187 {

	public List<String> findRepeatedDnaSequences(String s) {
		Set<String> set = new HashSet<>();
		Set<String> result = new HashSet<>();
		for(int i = 0;i<s.length()-9;i++) {
			if(!set.add(s.substring(i, i+10)))
				result.add(s.substring(i, i+10));
		}
		return new ArrayList<>(result);
	}
	
	public static void main(String[] args) {
		System.out.println(new No187().findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT").toString());
	}

}
