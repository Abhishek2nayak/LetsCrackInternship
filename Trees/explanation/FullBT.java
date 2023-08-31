package Trees.explanation;

class Node {
    int data;
    Node left = null;
    Node right = null;
    Node(int data) {
        this.data = data;
    }
}

public class FullBT {
   static Node root;
    public static void insert(int data) {
        Node new_node = new Node(data);
        //assign to the root of null
        if(root == null) {
            root = new_node;
        } else {
            Node crr = root;
            while(true) {
                if(crr.left == null) {
                    crr.left = new_node;
                    break;
                } else if(crr.right == null) {
                    crr.right = new_node;
                    break;
                }

                crr = crr.left;
            }
        }
    }
}