//package stacksAndQueues;

class TwoStacksInAnArray {
    int[] stack;
    int index1, index2;
    int max;

    public TwoStacksInAnArray(int capacity) {
        max = capacity;
        index1 = -1;
        index2 = max;
        stack = new int[max];
    }

    public void add(int stackNo, int data) {
        if (index1 + 1 >= index2) {
            System.out.println("Overflow");
            return;
        }
        if (stackNo == 1)
            stack[++index1] = data;
        else if (stackNo == 2)
            stack[++index2] = data;
    }

    public int pop(int stackNo) {
        if ((stackNo == 1 && index1 < 0) || (stackNo == 2 && index2 >= max)) {
            System.out.println("Underflow");
            return Integer.MIN_VALUE;
        }
        if (stackNo == 1) {
            int poppedElement = stack[index1--];
            return poppedElement;
        } else if (stackNo == 2) {
            int poppedElement = stack[index2++];
            return poppedElement;
        }
    }

    public int peek(int stackNo) {
        if ((stackNo == 1 && index1 < 0) || (stackNo == 2 && index2 >= max)) {
            System.out.println("Underflow");
            return Integer.MIN_VALUE;
        }
        if (stackNo == 1) {
            int peekedElement = stack[index1];
            return peekedElement;
        } else if (stackNo == 2) {
            int peekedElement = stack[index2];
            return peekedElement;
        }
    }

    public boolean isEmpty(int stackNo) {
        if (stackNo == 1) {
            return index1 < 0;
        } else {
            return index2 >= max;
        }
    }
}