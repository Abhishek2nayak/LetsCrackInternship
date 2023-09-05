package Trees.easy;
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> q = new LinkedList<>();
       
        q.add(root);
        while(!q.isEmpty()) {
            List<Integer> inner = new ArrayList<>();
            int n = q.size();
            for(int i = 0; i <n; i++) {
             TreeNode crr = q.poll();
             inner.add(crr.val);
             if(crr.left != null) q.add(crr.left);
             if(crr.right != null) q.add(crr.right);
            }
            list.add(0,inner);
        }

   
           return list;
    }
}