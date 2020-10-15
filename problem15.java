class NextPermutation {
    public static void nextPermu(int[] nums) {
        int n = nums.length;
        if (n <= 1)
            return;
        int i = n - 2;
        while (i >= 0 && nums[i] > nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = n - 1;
            while (nums[i] > nums[j]) {
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        reverse(nums, i + 1, n - 1);
        for (int j : nums) {
            System.out.print(j + " ");
        }
    }

    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 3, 2, 1 };
        nextPermu(nums);
    }
}
