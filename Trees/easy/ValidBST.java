class Solution {
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        helper(root,list);
        for(int i = 1; i < list.size(); i++) {
            if(list.get(i-1) >= list.get(i)) return false;
        }
        return true;
    }
    public void helper(TreeNode root, ArrayList<Integer> list) {
        if(root == null) return ;
        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);

    }
}