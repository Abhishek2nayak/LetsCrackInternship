package Trees.easy;
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list  = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        int i = 0;
        while(!s.empty()) {
            List<Integer> l = new ArrayList<>();
            Queue<TreeNode> q = new LinkedList<>();
            while(!s.empty()) {
               TreeNode crr = s.peek();
               l.add(crr.val);
                q.offer(s.peek());
                s.pop();
            }

          while(!q.isEmpty()) {
              TreeNode crr = q.poll();
              if(i % 2 == 0) {
                if(crr.left != null) s.push(crr.left);
                if(crr.right != null) s.push(crr.right);

              } else {
                  
                if(crr.right != null) s.push(crr.right);
                 if(crr.left != null) s.push(crr.left);
              }
          }
          i++;
          list.add(l);

        }
        return list;
    }
}