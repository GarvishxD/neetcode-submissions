class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
       int rows = mat.length , cols = mat[0].length;
       int l = 0 , r = rows*cols-1;
       while(l <= r){
        int mid = l + (r - l)/2;
        int R = mid / cols , C = mid % cols;
        if(mat[R][C] == target) return true;
        else if(mat[R][C] < target){
            l = mid+1;
        }
        else{
            r = mid-1;
        }
       }
       return false;
    }
}
