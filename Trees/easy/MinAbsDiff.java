class Solution {
    private TreeNode prev = null;
    int h = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
      findMin(root);
      return h;
    }
   
    public void findMin(TreeNode root) {
        if(root == null) return;
        findMin(root.left);
        if(prev != null) {
            h = Math.min(h,Math.abs(prev.val - root.val));
        }
        prev = root;
        findMin(root.right);
        
       
    }


}