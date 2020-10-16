import java.util.*;

//package BinaryTrees;
class Node {
    int val, hd;
    Node left, right;

    public Node(int val) {
        this.val = val;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}

class TopViewOfBinaryTree {
    public static void topView(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        int hd = 0;
        root.hd = hd;
        Map<Integer, Integer> map = new TreeMap<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            if (!map.containsKey(temp.hd)) {
                map.put(temp.hd, temp.val);
            }
            if (temp.left != null) {
                temp.left.hd = temp.hd - 1;
                q.add(temp.left);

            }
            if (temp.right != null) {
                temp.right.hd = temp.hd + 1;
                q.add(temp.right);
            }
        }

        // printing the top view
        Set<Integer> set = map.keySet();
        for (int i : set) {
            System.out.print(map.get(i) + " ");
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
        topView(root);
    }
}
