//package BinaryTrees;

class DiameterofABinaryTree {
    public static int diameter(Node root) {
        if (root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int diameter = leftHeight + rightHeight + 1;
        return Math.max(diameter, Math.max(diameter(root.left), diameter(root.right)));
    }

    public static int height(Node root) {
        if (root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);
        System.out.println(diameter(root));
    }
}
