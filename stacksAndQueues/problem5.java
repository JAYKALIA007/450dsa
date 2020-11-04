//package stacksAndQueues;

class KStacksInAnArray {
    int[] arr;
    int[] next;
    int[] top;
    int k;
    int arraySize;
    int free;

    public KStacksInAnArray(int n, int k) {
        arraySize = n;
        this.k = k;
        arr = new int[arraySize];
        next = new int[arraySize];
        top = new int[k];
        for (int i = 0; i < arraySize - 1; i++) {
            next[i] = i + 1;
        }
        next[arraySize - 1] = -1;
        for (int i = 0; i < k; i++) {
            top[i] = -1;
        }
        free = 0;
    }

    public boolean isEmpty(int stackNo) {
        return top[stackNo] == -1;
    }

    public boolean isFull() {
        return free == -1;
    }

    public void push(int stackNo, int data) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        int i = free;
        free = next[i];
        next[i] = top[stackNo];
        top[stackNo] = i;
        arr[i] = data;
    }

    public int pop(int stackNo) {
        if (isEmpty(stackNo)) {
            System.out.println("Underflow");
            return Integer.MIN_VALUE;
        }
        int i = top[stackNo];
        top[stackNo] = next[i];
        next[i] = free;
        free = i;
        return arr[i];
    }

}
