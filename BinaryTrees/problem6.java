
//package BinaryTrees;
import java.util.Stack;

class InorderTraversal {
    // The recursive solution
    // public static void inorder(Node root) {
    // if (root == null)
    // return;
    // inorder(root.left);
    // System.out.print(root.val + " ");
    // inorder(root.right);
    // }

    // Iterative Solution
    public static void inorder(Node root) {
        if (root == null)
            return;
        Node current = root;
        Stack<Node> stack = new Stack<>();
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.val + " ");
            current = current.right;

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
        inorder(root);
    }
}
