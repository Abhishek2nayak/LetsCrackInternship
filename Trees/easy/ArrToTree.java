class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
       
       int l = 0;
       int h = nums.length -1;
       return helper(nums,l,h);

    }
    public TreeNode helper(int[] nums , int low , int high) {
       
       if(low > high) return null;
       int m = low + (high - low)/2;
       TreeNode root = new TreeNode(nums[m]);
       root.left = helper(nums,low,m-1);
       root.right = helper(nums,m + 1, high);
       return root;
      
          
    }
}