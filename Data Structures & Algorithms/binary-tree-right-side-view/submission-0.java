class Solution {
    public List<Integer> rightSideView(TreeNode root) {
    List<Integer> ans = new ArrayList<>();
    if(root == null) return ans;
    Queue<TreeNode> qt = new LinkedList<>();
    qt.add(root);
    while(qt.size() != 0){
        int size = qt.size();
        for(int i = 0 ; i< size;  i++){
            TreeNode x = qt.poll();
            if(i == size - 1) ans.add(x.val);
            if(x.left != null) qt.add(x.left);
            if(x.right != null) qt.add(x.right);
        }
    }        
    return ans;
    }
}
