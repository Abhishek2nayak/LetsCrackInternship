
package Trees.explanation;
import java.util.*;

class Solution {
    public void printLevelWise(Node root) {
        Queue<Node> q = new LinkedList();
        q.add(root);
        while(!q.isEmpty()) {
            Node crr = q.poll();
            System.out.println(crr.data);

            if(crr.left != null) {
                q.add(crr.left);
            }
            if(crr.right != null) {
                q.add(crr.right);
            }
        }


    }
}