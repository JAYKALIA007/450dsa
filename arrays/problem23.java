class MaximumProductSubArray {
    public static int maxProduct(int[] arr, int n) {
        if (arr.length == 0)
            return 0;
        int cmax = arr[0], cmin = arr[0], max = arr[0];
        for (int i = 1; i < n; i++) {
            int temp = cmax;
            cmax = Math.max(Math.max(temp * arr[i], cmin * arr[i]), arr[i]);
            cmin = Math.min(Math.min(temp * arr[i], cmin * arr[i]), arr[i]);
            max = Math.max(cmax, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 4, 5, -1, 0 };
        System.out.println(maxProduct(arr, arr.length));
    }
}
