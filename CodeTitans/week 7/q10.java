public class q10 {
    public int minDays(int[][] grid) {
        if (countIslands(grid) != 1)
            return 0;
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j] = 0;
                    if (countIslands(grid) != 1)
                        return 1;
                    grid[i][j] = 1;
                }
            }
        }
        return 2;
    }

    int countIslands(int[][] grid) {
        int m = grid.length, n = grid[0].length, count = 0;
        boolean[][] vis = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    dfs(grid, vis, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    void dfs(int[][] grid, boolean[][] vis, int i, int j) {
        int m = grid.length, n = grid[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0 || vis[i][j])
            return;
        vis[i][j] = true;
        dfs(grid, vis, i + 1, j);
        dfs(grid, vis, i - 1, j);
        dfs(grid, vis, i, j + 1);
        dfs(grid, vis, i, j - 1);
    }
}
