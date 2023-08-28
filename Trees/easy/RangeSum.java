// class Solution {
//     public int rangeSumBST(TreeNode root, int low, int high) {
//         if(root == null) return 0;
//         int leftSum = rangeSumBST(root.left,low,high);
//         int rightSum = rangeSumBST(root.right,low,high);
//         if(root.val >= low && root.val <= high) {
//             return (root.val + leftSum + rightSum);
//         }
//         return  (leftSum + rightSum);
//     }
// }