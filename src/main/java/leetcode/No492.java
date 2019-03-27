package leetcode;

public class No492 {

	public int[] constructRectangle(int area) {
		int w = 1, l = area;
		int upper = (int) Math.sqrt(area);
		for (int i = upper; i >= 1; i--) {
			if(area % i == 0) {
				w = i;
				l = area / i;
				return new int[] {l,w};
			}
		}
		return new int[] {l,w};
	}

}
