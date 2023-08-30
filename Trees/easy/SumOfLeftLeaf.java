class Solution {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        
       helper(root,false);
       return sum;
    }
     public void helper(TreeNode root,boolean lft) {
        if(root == null) return;
        if(lft == true && (root.left == null && root.right == null)) {
            sum += root.val;
        }
        helper(root.left,true);
         helper(root.right,false);
         
        
      
    }
  
}