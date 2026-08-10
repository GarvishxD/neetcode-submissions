class Solution {
    public int kthSmallest(TreeNode root, int k) {

        if(root == null) return 0;
        List<Integer> ans= new ArrayList<>();
        inorder(root,ans);
        return ans.get(k-1);
    }
    void inorder(TreeNode root , List<Integer> ans){
        if(root == null) return;
        inorder(root.left , ans);
        ans.add(root.val);
        inorder(root.right , ans);
    }
}
    




