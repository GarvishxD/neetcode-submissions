class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        if(subRoot == null) return true;
        if(sametree(root , subRoot)) return true;
        return isSubtree(root.left , subRoot) || isSubtree(root.right , subRoot);
    }
    boolean sametree(TreeNode root , TreeNode subRoot){
        if(root == null && subRoot == null) return true;
        if(root != null && subRoot != null && root.val == subRoot.val){
            return sametree(root.left , subRoot.left) && sametree(root.right , subRoot.right);
        }
        return false;
    }
}
