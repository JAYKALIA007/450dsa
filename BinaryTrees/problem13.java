import java.util.Stack;

// package BinaryTrees;

class Node {
    int val;
    Node left, right;

    public Node(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

class ZigZagTraversal {
    public static void zigzag(Node root) {
        if (root == null)
            return;
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(root);
        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.isEmpty()) {
                Node temp = s1.pop();
                System.out.print(temp.val + " ");
                if (temp.left != null)
                    s2.push(temp.left);
                if (temp.right != null)
                    s2.push(temp.right);
            }
            while (!s2.isEmpty()) {
                Node temp = s2.pop();
                System.out.print(temp.val + " ");
                if (temp.right != null)
                    s1.push(temp.right);
                if (temp.left != null)
                    s1.push(temp.left);

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
        zigzag(root);
    }
}