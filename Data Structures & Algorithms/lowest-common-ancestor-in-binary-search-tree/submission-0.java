class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == root || q == root) return root;
        TreeNode right = lowestCommonAncestor(root.right , p , q);
        TreeNode left = lowestCommonAncestor(root.left , p , q);
        if(Math.max(p.val , q.val) < root.val){
            return left;
        }
        else if(Math.min(p.val , q.val) > root.val){
            return right;
        }
        else{
            return root;
        }
    }
}
