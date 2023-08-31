class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        int crr = root.val;
        if(crr < p.val && crr < q.val) {
            return lowestCommonAncestor(root.right,p,q);
        }
        if(crr > p.val && crr > q.val) {
            return lowestCommonAncestor(root.left,p,q);
        }
        return root;
    }
}