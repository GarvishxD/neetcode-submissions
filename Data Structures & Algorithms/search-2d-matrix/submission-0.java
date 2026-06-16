class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int rows = mat.length , cols = mat[0].length;
        int l = 0 , r = rows*cols - 1;
        while(l<=r){
            int m = r+l/2;
            int R = m/cols , C = m%cols;
            if(target == mat[R][C]){
                return true;
            }
            else if(target > mat[R][C]){
                l = m+1;
            }
            else{
                r = m-1;
            }
        }
        return false;
    }
}
