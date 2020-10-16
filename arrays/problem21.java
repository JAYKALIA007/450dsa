import java.util.HashSet;

class ZeroSumSubarray {

    public static boolean isPresent(int[] arr, int n) {
        if (arr.length == 0)
            return false;
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (arr[i] == 0 || sum == 0 || set.contains(sum))
                return true;
            set.add(sum);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 4, 2, 4, 1, 6 };
        System.out.println(isPresent(arr, arr.length));
    }
}
