import java.util.HashSet;

class LongestConsecutiveSubsequence {
    public static int lengthOfLongestConsecutiveSubseq(int[] arr, int n) {
        if (n == 0)
            return 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int temp = arr[i] - 1;
            if (set.contains(temp))
                continue;

            int j = temp + 1;
            while (set.contains(j))
                j++;
            max = Math.max(max, j - temp - 1);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 9, 3, 10, 4, 20, 2 };
        int res = lengthOfLongestConsecutiveSubseq(arr, arr.length);
        System.out.println(res);
    }
}