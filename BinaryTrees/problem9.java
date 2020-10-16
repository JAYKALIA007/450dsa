
//package BinaryTrees;
import java.util.Queue;
import java.util.LinkedList;

class LeftViewOfBinaryTree {
    public static void leftView(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            int i = 1;
            while (size-- > 0) {
                Node temp = q.poll();
                if (i-- > 0) {
                    System.out.print(temp.val + " ");
                }
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        leftView(root);
    }

}
