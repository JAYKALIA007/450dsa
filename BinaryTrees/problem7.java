import java.util.Stack;

//package BinaryTrees;

class PreorderTraversal {
    // Recursive approach
    // public static void preorder(Node root) {
    // if (root == null)
    // return;
    // System.out.print(root.val + " ");
    // preorder(root.left);
    // preorder(root.right);
    // }

    // Iterative solution
    public static void preorder(Node root) {
        if (root == null)
            return;
        Stack<Node> stack = new Stack<>();
        Node current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                System.out.print(current.val + " ");
                if (current.right != null) {
                    stack.push(current.right);
                }
                current = current.left;
            }
            if (!stack.isEmpty()) {
                current = stack.pop();
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
        preorder(root);
    }
}
