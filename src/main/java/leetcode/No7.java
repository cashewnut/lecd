package leetcode;

public class No7 {

    public int reverse(int x) {
        if (x == Integer.MIN_VALUE)
            return 0;
        int sign = 1;
        if (x < 0)
            sign = -1;
        int y = Math.abs(x);
        int res = 0;
        while (y != 0) {
            int q = y % 10;
            y = y / 10;
            res = res * 10 + q;
            if (Integer.MAX_VALUE / 10 < res && y != 0)
                return 0;
            if (Integer.MAX_VALUE / 10 == res) {
                if (sign == 1) {
                    if (Integer.MAX_VALUE % 10 < y)
                        return 0;
                } else {
                    if (Integer.MAX_VALUE % 10 + 1 < y)
                        return 0;
                }
            }
        }
        return res * sign;
    }

    public int reverse1(int x) {
        int flag = x < 0 ? -1 : 1;
        int res = 0;

        while (x != 0) {
            int dig = Math.abs(x % 10);
            x = x / 10;
            if (Integer.MAX_VALUE / 10 < res && dig != 0)
                return 0;
            else if (Integer.MAX_VALUE / 10 == res) {
                if (flag == -1) {
                    if (Math.abs(Integer.MIN_VALUE % 10) < dig)
                        return 0;
                } else {
                    if (Integer.MAX_VALUE % 10 < dig)
                        return 0;
                }
            }
            res = res * 10 + dig;

        }

        return flag * res;
    }

    public static void main(String[] args) {
        No7 n = new No7();
        System.out.println(n.reverse1(1463847412));
    }

}
