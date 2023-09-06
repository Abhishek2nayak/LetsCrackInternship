package Trees.easy;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      if(preorder.length == 0) return null;
      int i;
      for(i = 0; i < inorder.length; i++) {
          if(inorder[i] == preorder[0]) break;
      }
      TreeNode x =  new TreeNode(preorder[0]);
      x.left= buildTree(Arrays.copyOfRange(preorder,1,1 + i),Arrays.copyOfRange(inorder,0,i));
    x.right= buildTree(Arrays.copyOfRange(preorder,i + 1,preorder.length),Arrays.copyOfRange(inorder,i + 1,inorder.length));
    return x;

   
     
    }
}