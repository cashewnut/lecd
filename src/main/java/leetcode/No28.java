package leetcode;

public class No28 {

	public int strStr(String haystack, String needle) {
		if (needle.isEmpty())
			return 0;
		int i = 0;
		while (i <= haystack.length() - needle.length()) {
			if (needle.charAt(0) == haystack.charAt(i)) {
				int j = 0;
				while (j < needle.length()) {
					if (needle.charAt(j) != haystack.charAt(i + j))
						break;
					j++;
				}
				if (j == needle.length())
					return i;
			}
			i++;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(new No28().strStr("hello", "ll"));
	}

}
