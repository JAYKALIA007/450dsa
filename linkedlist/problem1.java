// package linkedlist;
class Node {
    Node next;
    int val;

    public Node(int val) {
        this.val = val;
    }
}

class ReverseALinkedList {
    /*
     * Iterative approach
     * 
     * public static void reverse(Node head) { if (head == null || head.next ==
     * null) return; Node curr = head, n = null, prev = null; while (curr != null) {
     * n = curr.next; curr.next = prev; prev = curr; curr = n; }
     * printLinkedList(prev); }
     */

    // Recursive approach
    public static Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;
        Node rest = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }

    public static void printLinkedList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        printLinkedList(node);
        reverse(node);
    }
}
