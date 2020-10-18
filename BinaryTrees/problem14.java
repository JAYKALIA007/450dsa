//package BinaryTrees;

class CheckIfAtreeIsBalanced {
    public static boolean isHeightBalanced(Node root) {
        if (root == null)
            return true;
        int lh = height(root.left);
        int rh = height(root.right);
        if (Math.abs(lh - rh) <= 1 && isHeightBalanced(root.left) && isHeightBalanced(root.right))
            return true;

        return false;
    }

    public static int height(Node root) {
        if (root == null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        // root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);
        boolean res = isHeightBalanced(root);
        System.out.println(res);
    }
}
