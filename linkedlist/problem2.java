// package linkedlist;

class ReverseInGroupsOfGivenSize {
    public static Node reverse(Node head, int k) {
        if (head == null)
            return head;
        Node curr = head, n = null, prev = null;
        int ctr = 0;
        while (curr != null && ctr < k) {
            n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
            ctr++;
        }
        if (n != null) {
            head.next = reverse(n, k);
        }
        return prev;
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
        Node rev = reverse(node, 2);
        printLinkedList(rev);
    }
}
