class Solution {
    void transpose(int [][]matrix){
        for(int i = 0 ; i< matrix.length ; i++){
            for(int j = i ; j< matrix[0].length ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    void reverse(int [][]matrix){
        for(int i = 0 ; i< matrix.length/2 ; i++){
           int []temp = matrix[i];
           matrix[i] = matrix[matrix.length - i - 1];
           matrix[matrix.length - i - 1] = temp;
        }
    }
    public void rotate(int[][] matrix) {
        reverse(matrix);
        transpose(matrix);
    }
}
