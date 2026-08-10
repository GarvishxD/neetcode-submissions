class Solution {
    int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left) , height(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        int sum = lh+ rh;
        int sum2 = Math.max(diameterOfBinaryTree(root.left) , diameterOfBinaryTree(root.right));
        return Math.max(sum , sum2);
    }
}
