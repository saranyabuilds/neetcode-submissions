class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> res = new ArrayList<>();
        /*row = how many rows are still left
col = how many columns to move in current direction
r = current row position
c = current column position
dr = row direction
dc = column direction*/
        dfs(m, n, 0, -1, 0, 1, matrix, res);
        return res;
    }
    private void dfs(int row, int col, int r, int c, int dr, int dc, int[][] matrix, List<Integer> res) {
        if(row == 0 || col == 0) {
            return;
        }
        for (int i = 0; i < col; i++) {
            r += dr;
            c += dc;
            res.add(matrix[r][c]);
        }
        dfs(col, row-1, r, c, dc, -dr,matrix,res );
    }
}
