package leetcode;

import java.util.Arrays;

public class No231 {
	public boolean isPowerOfTwo(int n) {
		return Arrays.binarySearch(new int[] { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384,
				32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864,
				134217728, 268435456, 536870912, 1073741824 }, n) >= 0;
	}

	public boolean isPowerOfTwo2(int n) {
		if (n <= 0)
			return false;
		int j = 0;
		for (int i = 0; i < 32; i++) {
			int k = (n >> i) & 1;
			if (j == 1)
				if (k == 1)
					return false;
			if (k == 1) {
				j = 1;
			}
		}
		return true;
	}

	public boolean isPowerOfTwo3(int n) {
		if (n <= 0)
			return false;
		return (n & (n - 1)) == 0;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.binarySearch(new int[] { 1 }, 2));
	}
}
