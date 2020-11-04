//Implement a stack from scratch
class MyStack {
    int max;
    int[] stack;
    int index;

    public MyStack(int capacity) {
        max = capacity;
        stack = new int[max];
        index = -1;
    }

    public void push(int data) {
        if (index + 1 >= max) {
            System.out.println("Overflow");
            return;
        }
        stack[++index] = data;
    }

    public int pop() {
        if (index < 0) {
            System.out.println("Underflow");
            return Integer.MIN_VALUE;
        }
        int poppedElement = stack[index--];
        return poppedElement;
    }

    public int peek() {
        if (index < 0) {
            System.out.println("Underflow");
            return Integer.MIN_VALUE;
        }
        int peekElement = stack[index];
        return peekElement;
    }

    public boolean isEmpty() {
        return index == -1;
    }
}

class StackObject {
    public static void main(String[] args) {
        MyStack obj = new MyStack(10);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        int temp = obj.peek();
        System.out.println(temp);
        temp = obj.pop();
        System.out.println(temp);
        temp = obj.peek();
        System.out.println(temp);
        obj.pop();
        obj.pop();
        obj.pop();
    }
}
