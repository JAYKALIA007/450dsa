import java.util.Arrays;
import java.util.Stack;

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class MergeOverlappingIntervals {
    public static void mergeIntervals(Interval[] arr) {
        if (arr.length == 0) {
            System.out.println("empty input");
            return;
        }
        Arrays.sort(arr, (a, b) -> a.start - b.start);
        Stack<Interval> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            Interval temp = stack.peek();
            if (temp.end < arr[i].start) {
                stack.push(arr[i]);
            } else if (temp.end < arr[i].end) {
                stack.pop();
                temp.end = arr[i].end;
                stack.push(temp);
            }
        }
        while (!stack.isEmpty()) {
            Interval temp = stack.pop();
            System.out.println("[" + temp.start + "," + temp.end + "]");
        }
    }

    public static void main(String[] args) {
        int[] start = new int[] { 1, 2, 8, 15 };
        int[] end = new int[] { 3, 6, 10, 18 };
        int n = start.length;
        Interval[] arr = new Interval[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Interval(start[i], end[i]);
        }
        mergeIntervals(arr);
    }
}
