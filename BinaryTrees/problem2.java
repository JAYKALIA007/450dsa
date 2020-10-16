
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class ReverseLevelOrderTraversal {
    public static void reverseLevelOrder(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            stack.push(temp.val);
            if (temp.right != null) {
                q.add(temp.right);
            }
            if (temp.left != null) {
                q.add(temp.left);
            }

        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
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
        reverseLevelOrder(root);
    }
}

class Node {
    int val;
    Node left, right;

    public Node(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}