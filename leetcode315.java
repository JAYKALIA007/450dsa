import java.util.ArrayList;
import java.util.List;

class CountofSmallerNumbersAfterSelf {
    public static List<Integer> listSmaller(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        if (n == 0)
            return res;

        for (int i = 0; i < n; i++) {
            int ctr = 0;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[i]) {
                    ctr++;
                }
            }
            res.add(ctr);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 6, 5, 4, 8 };
        List<Integer> res = listSmaller(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(res.get(i) + " ");
        }
    }
}