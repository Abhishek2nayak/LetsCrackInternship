package Trees.easy;
class Solution {
    public Node connect(Node root) {
        if(root == null) return root;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            Node crr = q.poll();
              int n = q.size();
            for(int i = 0; i < n; i++) {
                Node nxt = q.poll();
                if(crr.left != null) q.add(crr.left);
                if(crr.right != null) q.add(crr.right);
                crr.next = nxt;
                crr = nxt;

            }
             if(crr.left != null) q.add(crr.left);
             if(crr.right != null) q.add(crr.right);
               crr.next = null;
        }

        return root;
    }
}