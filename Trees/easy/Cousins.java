package Trees.easy;

class Solution {
    TreeNode xParent = null;
    TreeNode yParent = null;
    int xd = -1;
    int yd = -1;

    public boolean isCousins(TreeNode root, int x, int y) {

        helper(root, x, y, 0, null);
        return (xParent != yParent && xd == yd) ? true : false;

    }

    public void helper(TreeNode root, int x, int y, int d, TreeNode par) {
        if (root == null)
            return;
        if (root.val == x) {
            xParent = par;
            xd = d;
        } else if (root.val == y) {
            yParent = par;
            yd = d;
        }
        helper(root.left, x, y, d + 1, root);
        helper(root.right, x, y, d + 1, root);
    }

}
