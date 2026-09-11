class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length , n = matrix[0].length;
        boolean [][]vis = new boolean[m][n];
        for(int i = 0 ; i< m ; i++){
            for(int j = 0 ; j< n ; j++){
                if(matrix[i][j] == 0){
                    vis[i][j] = true;
                }
            }
        }
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j< n ; j++){
                if(vis[i][j]){
                    dfs(i , j , matrix);
                }
            }
        }
    }
    void dfs(int i , int j , int[][] matrix){
        for(int row = 0 ; row < matrix.length ; row++){
            matrix[row][j] = 0;
        }
        for(int col = 0 ;col < matrix[0].length ; col++){
            matrix[i][col] = 0;
        }
    }
}
