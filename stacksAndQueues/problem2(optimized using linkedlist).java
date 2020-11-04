//package stacksAndQueues;
class Node {

    int data;
    Node next = null;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

class MyQueue {
    Node front, rear;

    public MyQueue() {
        front = rear = null;
    }

    public void add(int data) {
        Node new_node = new Node(data);
        if (front == null) {
            front = rear = new_node;
            return;
        }
        rear.next = new_node;
        rear = rear.next;
    }

    public int poll() {
        if (front == null) {
            System.out.println("Underflow");
            return Integer.MIN_VALUE;
        }
        int polledElement = front.data;
        front = front.next;
        return polledElement;
    }

    public int peek() {
        if (front == null) {
            System.out.println("Underflow");
            return Integer.MIN_VALUE;
        }
        int peekedElement = front.data;

        return peekedElement;
    }

    public boolean isEmpty() {
        return front == null;
    }

}

class QueueObject {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        int peek1 = obj.peek();
        int pop1 = obj.poll();
        int pop2 = obj.poll();
        int pop3 = obj.poll();
        boolean res = obj.isEmpty();
        System.out.println(peek1);
        System.out.println(pop1);
        System.out.println(pop2);
        System.out.println(pop3);
        System.out.println(res);
    }
}
