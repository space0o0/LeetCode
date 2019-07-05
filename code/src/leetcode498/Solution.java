package leetcode498;

public class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {

        if (matrix.length == 0) {
            return new int[]{};
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int diagonal[] = new int[m * n];

        int row = 0, col = 0;
        for (int i = 0; i < diagonal.length; i++) {
            diagonal[i] = matrix[row][col];

            //i奇数向下 偶数向上
            if ((row + col) % 2 == 0) {
                //向上
                if (col == n - 1) {//在最右侧,col不变 row++
                    row++;
                } else if (row == 0) {//在第一行 row不变 col++
                    col++;
                } else {
                    row--;
                    col++;
                }

            } else {
                //向下
                if (row == m - 1) {//在最底下一行，row不变 col++
                    col++;
                } else if (col == 0) {//在第一列 row++ col不变
                    row++;
                } else {
                    row++;
                    col--;
                }
            }
        }

        return diagonal;
    }
}
