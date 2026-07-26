class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null) return ans;
    Queue<TreeNode> qt = new LinkedList<>();
    qt.add(root);
    while(qt.size() != 0){
        int size  = qt.size();
        List<Integer> level = new ArrayList<>();
        for(int i = 0 ; i< size ; i++){
            TreeNode x = qt.poll();
            level.add(x.val);
            if(x.left != null) qt.add(x.left);
            if(x.right != null) qt.add(x.right);
        }
        ans.add(level);
    }        
    return ans;
    }
}
