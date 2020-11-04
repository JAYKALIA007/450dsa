//package stacksAndQueues;

class MyQueue {
    int[] queue;
    int max;
    int front, rear;

    public MyQueue(int capacity) {
        max = capacity;
        queue = new int[max];
        front = rear = 0;
    }

    public void add(int data) {
        if (rear + 1 >= max) {
            System.out.println("Overflow");
            return;
        }
        queue[rear] = data;
        rear++;
    }

    public int poll() {
        if (front == rear) {
            System.out.println("Underflow");
            return Integer.MIN_VALUE;
        }
        int polledElement = queue[front];
        for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
        return polledElement;
    }

    public int peek() {
        if (front == rear) {
            System.out.println("Underflow");
            return Integer.MIN_VALUE;
        }
        int peekedElement = queue[front];
        return peekedElement;
    }

    public boolean isEmpty() {
        return front == rear;
    }
}

class QueueObject {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue(5);
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

/*
 * add()->O(1) ,poll()->O(n) //because shifting takes place, peek()->O(1)
 * isEmpty()->O(1)
 */