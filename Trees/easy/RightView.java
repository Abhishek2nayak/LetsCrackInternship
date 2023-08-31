class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        int h = maxHeight(root);
        int[] arr = new int[h + 1];
        helper(root,arr,1);
       
      
        for(int i = 1; i < h +1; i++) {
            list.add(arr[i]);
        }
          return list;
    }

    public void helper(TreeNode root, int [] arr, int level) {
        if(root == null) return;
        arr[level] = root.val;
        helper(root.left,arr, level + 1);
        helper(root.right,arr, level + 1);

    }
    public int maxHeight(TreeNode root) {
        if(root == null) return 0;
        int lft = maxHeight(root.left);
        int rght = maxHeight(root.right);
        return 1 + Math.max(lft,rght);
    }
}