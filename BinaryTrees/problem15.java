import java.util.*;

class Node {
    int val;
    int d;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
        d = Integer.MAX_VALUE;
        left = right = null;
    }
}

class DiagonalTraversalOfBinaryTree {

    // -----------------O(n^2)space and O(n)time---------------------------------

    // public static void traversal(Node root) {
    // if (root == null)
    // return;
    // Map<Integer, List<Integer>> map = new HashMap<>();
    // int d = 0;
    // Queue<Node> q = new LinkedList<>();
    // root.d = 0;
    // q.add(root);
    // List<Integer> res = new ArrayList<>();
    // map.put(d, res.add(root.val));
    // while (!q.isEmpty()) {
    // Node temp = q.peek();
    // q.poll();
    // int d1 = temp.d;
    // if (!map.containsKey(d1)) {
    // res = new ArrayList<>();
    // res.add(temp.val);
    // map.put(d1, res);
    // }

    // else if (map.containsKey(d1)) {
    // map.put(d1, map.get(d1).add(temp.val));
    // }
    // if (temp.right != null) {
    // temp.right.d = d1;
    // q.add(temp.right);
    // }
    // if (temp.left != null) {
    // temp.left.d = d1 + 1;
    // q.add(temp.left);
    // }

    // }
    // Set<Integer> set = map.keySet();
    // for (int i : set) {
    // printDiagonal(map.get(i));
    // }
    // }

    // -----------------O(n)space and O(n)time---------------------------------
    public static void traversal(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            if (temp == null) {
                if (q.isEmpty())
                    return;
                System.out.println(); // to go to the next line
                q.add(null); // this is done for the next diagonal row
            } else {
                while (temp != null) {
                    System.out.print(temp.val + " ");
                    if (temp.left != null) {
                        q.add(temp.left);
                    }
                    temp = temp.right;
                }
            }
        }

    }

    public static void printDiagonal(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);
        Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);
        root.left.right.left = new Node(4);
        root.left.right.right = new Node(7);
        traversal(root);
    }
}