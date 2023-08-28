
// class Solution {
//     public TreeNode invertTree(TreeNode root) {
//         helper(root);
//         return root;
//     }
//     public void helper(TreeNode root) {
//         if(root == null) return;
//         helper(root.left); //left iterate
//         helper(root.right);//right iterate
//         TreeNode temp = root.left;
//         root.left = root.right;
//         root.right= temp;

//     }
// }