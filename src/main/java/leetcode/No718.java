package leetcode;

public class No718 {

    public int findLength(int[] A, int[] B) {
        int m = A.length, n = B.length;
        if (m == 0 || n == 0)
            return 0;
        int[][] dp = new int[m][n];
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i] != B[j])
                    dp[i][j] = 0;
                else {
                    if (i < 1 || j < 1)
                        dp[i][j] = 1;
                    else
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    if(dp[i][j] > max)
                        max = dp[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new No718().findLength(new int[]{1,2,3,4,5,6,7},new int[]{3,2,4,7,6,5}));
    }

}
