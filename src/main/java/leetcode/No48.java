package leetcode;

public class No48 {

	public void rotate(int[][] matrix) {
		int length = matrix.length;
		int[] temp = new int[length - 1];
		for (int i = 0; i < length / 2; i++) {
			int stride = length - 1 - 2 * i;
			int k = 0;
			for (int j = i; j < length - 1 - i; j++) {
				temp[k++] = matrix[j][i + stride];
				matrix[j][i + stride] = matrix[i][j];
			}
			k = 0;
			for (int j = length - 1 - i; j > i; j--) {
				int tmp = matrix[length - 1 - i][j];
				matrix[length - 1 - i][j] = temp[k];
				temp[k++] = tmp;
			}
			k = 0;
			for (int j = length - 1 - i; j > i; j--) {
				int tmp = matrix[j][i];
				matrix[j][i] = temp[k];
				temp[k++] = tmp;
			}
			k = 0;
			for (int j = i; j < length - 1 - i; j++) {
				matrix[i][j] = temp[k++];
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1,2,3,6,7,8 }, { 1,2,3,6,7,8 }, { 1,2,3,6,7,8 }, { 1,2,3,6,7,8 }, { 1,2,3,6,7,8 }, { 1,2,3,6,7,8 } };
		new No48().rotate(matrix);
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++)
				System.out.print(matrix[i][j]);
			System.out.println();
		}
	}

}
