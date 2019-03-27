package leetcode;

public class No69 {

    public int mySqrt(int x) {
        if (x <= 1)
            return x;
        int i = 1, j = x;
        while (i <= j) {
            int mid = i + ((j - i) >> 1);
            if (x / mid < mid) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }

        }
        return i - 1;
    }

    public static void main(String[] args) {
        System.out.println(new No69().mySqrt(5));
    }

}
