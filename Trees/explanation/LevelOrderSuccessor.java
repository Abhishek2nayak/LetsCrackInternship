package Trees.explanation;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public TreeNode levelOrderSucc(TreeNode root, int target) {
        Queue<Integer> q = new LinkedList<>();
        TreeNode ans = null;
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode crr= q.poll();
            if(crr.val == target && !q.isEmpty()) {
                ans = q.poll();
                break;
            }
            if(crr.left != null) q.add(crr.left);
            if(crr.right != null) q.add(crr.right);
        }

        return ans;
    }
}
