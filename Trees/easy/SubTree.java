class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        return helper(root,subRoot);


    }

    public  boolean helper(TreeNode root, TreeNode subRoot) {
       
       if(root == null) return false;
       boolean ans = false;
       if(root.val == subRoot.val) {
           ans = check(root,subRoot);
       }
       if(ans) {
           return true;
       }

       return helper(root.left,subRoot) || helper(root.right,subRoot);

    }

   

    public boolean check(TreeNode root, TreeNode subRoot) {
       if(root == null && subRoot == null) return true;
       if(root == null || subRoot == null) return false;
       if(root.val != subRoot.val) return false;
       return check(root.left,subRoot.left) && check(root.right,subRoot.right);
    }
}