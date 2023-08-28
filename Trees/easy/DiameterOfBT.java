
// class Solution {
//      int maxHeight = Integer.MIN_VALUE;
//     public int diameterOfBinaryTree(TreeNode root) {
//         helper(root);
//         return maxHeight;
//     }
   

//     public int helper(TreeNode root) {
//         if(root == null) return 0;
//         int leftHeight = helper(root.left);
//         int rightHeight = helper(root.right);
//         if(maxHeight < (leftHeight + rightHeight)) maxHeight = leftHeight + rightHeight;

//         return 1 + Math.max(leftHeight,rightHeight);


//     }
// }
