class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows = grid.length, cols = grid[0].length;
        int total = rows * cols;
        k %= total; 

        int[][] shifted = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int from = r * cols + c;
                int to = (from + k) % total;
                shifted[to / cols][to % cols] = grid[r][c];
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int r = 0; r < rows; r++) {
            List<Integer> row = new ArrayList<>();
            for (int c = 0; c < cols; c++) row.add(shifted[r][c]);
            ans.add(row);
        }
        return ans;
    }
}
