class Solution {
    public int[][] transpose(int[][] matrix) {
        int origrow = matrix.length;
        int origcol = matrix[0].length;

        int newrow = origcol;
        int newcol = origrow;

        int[][] transposed = new int[newrow][newcol];

        for (int i = 0; i < origrow; i++) {
            for (int j = 0; j < origcol; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
}