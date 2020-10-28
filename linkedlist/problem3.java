//package linkedlist;

class DetectALoopInLinkedList {

    public boolean hasCycle(Node head) {
        if (head == null || head.next == null)
            return false;
        Node fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == null)
                return false;
            if (fast.val == slow.val)
                return true;
        }
        return false;
    }

}
