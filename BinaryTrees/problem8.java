import java.util.Stack;

// package BinaryTrees;

class PostorderTraversal {
    // public static void postorder(Node root) {
    // if (root == null)
    // return;
    // postorder(root.left);
    // postorder(root.right);
    // System.out.print(root.val + " ");
    // }
    public static void postorder(Node root) {
        if (root == null)
            return;
        Stack<Node> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.push(root);
        while (!s1.isEmpty()) {
            Node temp = s1.pop();
            s2.push(temp.val);
            if (temp.left != null)
                s1.push(temp.left);
            if (temp.right != null)
                s1.push(temp.right);
        }
        while (!s2.isEmpty()) {
            System.out.print(s2.pop() + " ");
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
        postorder(root);
    }

}
