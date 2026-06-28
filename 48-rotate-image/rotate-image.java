class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int row = 0; row < n; row++) {
            for (int col = row; col < n; col++) {
                // Basically swap kardengee...
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        for (int row = 0; row < n; row++) {
            int stcol = 0 ;
            int endcol = n - 1;
            while (stcol < endcol) {
                // hame row reverse krni h..
                int temp = matrix[row][stcol];
                matrix[row][stcol] = matrix[row][endcol];
                matrix[row][endcol] = temp;

                stcol++;
                endcol--;
            }
        }

    }
}