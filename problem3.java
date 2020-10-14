import java.util.PriorityQueue;

class FindKthSmallest {
    public static int kthSmallest(int[] arr, int size, int k) {
        if (k > size) {
            k %= size;
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);
        minHeap.add(arr[0]);
        for (int i = 1; i < size; i++) {
            minHeap.add(arr[i]);
        }
        for (int i = 1; i < k; i++) {
            minHeap.remove();
        }
        int ans = minHeap.remove();
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 7, 10, 4, 20, 15 };
        System.out.println(kthSmallest(arr, arr.length, 4));
    }
}

// time -> O(n + klogn)
