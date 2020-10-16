import java.util.*;

class CountOfTwoSum {
    public static int PairSumCount(int[] arr, int n, int target) {
        if (n <= 1)
            return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, 0);
            }
            map.put(i, map.get(i) + 1);
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.get(target - arr[i]) != null) {
                count += map.get(target - arr[i]);
            }
            if (target - arr[i] == arr[i]) {
                count--;
            }
        }
        return count / 2;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 1, 1 };
        int result = PairSumCount(arr, arr.length, 2);
        System.out.println(result);
    }
}
