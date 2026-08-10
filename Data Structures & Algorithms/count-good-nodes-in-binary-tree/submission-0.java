class Solution {
    int counting(TreeNode root , int max){
        if(root == null) return 0;
        int count = 0;
        if(root.val >= max){
            count = 1;
            max = root.val;
        }
        count+=counting(root.left , max);
        count+=counting(root.right , max);
        return count;
    }
    public int goodNodes(TreeNode root) {
        return counting(root , root.val);
    }
}
