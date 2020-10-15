import java.util.*;

class MaximumSumsubArray {
    public static void main(String[] args) {
        // code
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            kadanesAlgo(arr, N);
        }
        sc.close();
    }

    public static void kadanesAlgo(int[] arr, int n) {
        int max = arr[0], cmax = arr[0];
        for (int i = 1; i < n; i++) {
            cmax = Math.max(arr[i], arr[i] + cmax);
            max = Math.max(max, cmax);
        }
        System.out.println(max);
    }
}