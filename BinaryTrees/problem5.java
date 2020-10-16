
//package BinaryTrees;
import java.util.Queue;
import java.util.LinkedList;

class MirrorOfABinaryTree {
    public static Node createMirror(Node root) {
        if (root == null)
            return root;
        Node temp = createMirror(root.left);
        root.left = createMirror(root.right);
        root.right = temp;
        return root;
    }

    public static void levelOrder(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.val + " ");
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
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
        levelOrder(root);
        Node mirror_root = createMirror(root);
        System.out.println();
        levelOrder(mirror_root);
    }
}
