/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        Queue<TreeNode> qt = new LinkedList<>();
        qt.add(root);
        while(qt.size() != 0){
            TreeNode x = qt.poll();
            TreeNode temp = x.left;
            x.left = x.right;
            x.right = temp;
            if(x.left != null) qt.add(x.left);
            if(x.right != null) qt.add(x.right);
        }
        return root;
    }
}
