package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class pdd1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            int n = input.nextInt();
            int[] a = new int[n], b = new int[n];
            int i = 0;
            while (i < n)
                a[i++] = input.nextInt();
            i = 0;
            while (i < n)
                b[i++] = input.nextInt();
            Arrays.sort(a);
            Arrays.sort(b);
            int res = 0;
            for (i = 0; i < n; i++) {
                res += a[i] * b[n - i - 1];
            }
            System.out.println(res);
        }

    }

}
