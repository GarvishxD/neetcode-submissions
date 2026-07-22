class Solution {
    public int orangesRotting(int[][] grid) {
    if(grid == null || grid.length == 0) return 0;
    int [][]time = new int[grid.length][grid[0].length];
    for(int i = 0 ; i< grid.length ; i++){
        Arrays.fill(time[i] , Integer.MAX_VALUE);
    }   
    for(int i = 0 ; i< grid.length ; i++){
        for(int j = 0 ; j< grid[0].length ; j++){
            if(grid[i][j] == 2){
                dfs(i,j,grid,0,time);
            }
        }
    }
    int totaltime = 0;
    for(int i = 0 ; i< grid.length ; i++){
        for(int j = 0 ; j< grid[0].length ; j++){
            if(grid[i][j] == 1){
            if(time[i][j] == Integer.MAX_VALUE) return -1;
                totaltime = Math.max(totaltime , time[i][j]);
            }
        }
    }
    return totaltime;
    }
    void dfs(int i , int j , int [][]grid , int currtime ,int[][] time){
        if(i >= grid.length || j >= grid[0].length || i<0 || j<0 ||grid[i][j] == 0 || currtime >= time[i][j]){
            return;
        } 
        time[i][j] = currtime;
        dfs(i+1 , j , grid , currtime+1 , time);
        dfs(i-1 , j , grid , currtime+1 , time);
        dfs(i , j+1 , grid , currtime+1 , time);
        dfs(i , j-1 , grid , currtime+1 , time);
    }
}
