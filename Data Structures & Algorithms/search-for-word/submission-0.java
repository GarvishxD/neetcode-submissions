class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length , n = board[0].length;
        boolean [][]vis = new boolean[m][n];
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(solve(0,i,j,board,word,vis)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean solve(int idx,int i , int j , char [][]board , String word , boolean [][] vis){
        if(idx == word.length()) return true;
        if(i<0 || j<0 || i>=board.length || j>= board[0].length || vis[i][j]
        || board[i][j] != word.charAt(idx)){
            return false;
        }
        vis[i][j] = true;
        if(solve(idx+1 ,i+1 , j , board , word , vis)||
        solve(idx+1 ,i , j+1 , board , word , vis)||
        solve(idx+1 ,i-1 , j , board , word , vis)||
        solve(idx+1 ,i , j-1 , board , word , vis)){
            return true;
        }
        vis[i][j] = false;
        return false;
    }
}
