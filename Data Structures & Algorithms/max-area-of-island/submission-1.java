class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length , n = grid[0].length;
        boolean [][]vis = new boolean[m][n];
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(grid[i][j] == 1 && !vis[i][j]){
                    int area = dfs(i,j,grid,vis);
                   
                    max = Math.max(max , area);
                }
            }
        }
        if(max == Integer.MIN_VALUE) return 0;
        return max;
    }
   int dfs(int i , int j , int [][]grid , boolean [][]vis){
        if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || grid[i][j] == 0 || vis[i][j]){
            return 0;
        }
        vis[i][j] = true;
        return 1 + dfs(i+1 ,j , grid , vis )+
         dfs(i-1 ,j , grid , vis )+
          dfs(i,j+1 , grid , vis )+
           dfs(i ,j-1 , grid , vis );
    }
}
