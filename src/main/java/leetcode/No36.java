package leetcode;

public class No36 {

    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            int[] count = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (count[board[i][j] - '0'] != 0)
                        return false;
                    else
                        count[board[i][j] - '0'] = 1;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            int[] count = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    if (count[board[j][i] - '0'] != 0)
                        return false;
                    else
                        count[board[j][i] - '0'] = 1;
                }
            }
        }
        for (int muli = 0; muli < 3; muli++) {
            for (int mulj = 0; mulj < 3; mulj++) {
                int[] count = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                for (int i = muli * 3; i < muli * 3 + 3; i++) {
                    for (int j = mulj * 3; j < mulj * 3 + 3; j++) {
                        if (board[i][j] != '.') {
                            if (count[board[i][j] - '0'] != 0)
                                return false;
                            else
                                count[board[i][j] - '0'] = 1;
                        }
                    }
                }
            }
        }
        return true;
    }

}
