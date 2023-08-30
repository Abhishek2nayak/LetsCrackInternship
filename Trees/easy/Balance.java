class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int left  = height(root.left);
        int right = height(root.right);
        if(Math.abs(left - right) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int height(TreeNode root) {
        if(root == null) return 0;
        int leftH = height(root.left);
        int rightH = height(root.right);

        int h = Math.max(leftH,rightH) + 1;
        return h; 

    }
}