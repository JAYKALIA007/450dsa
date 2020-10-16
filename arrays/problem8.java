class MaximumSumSubArray {
    public static int kadanesAlgo(int[] arr, int length) {
        if (arr.length == 0)
            return 0;
        if (arr.length == 1)
            return arr[0];
        int cmax = arr[0];
        int max = arr[0];
        for (int i = 1; i < length; i++) {
            cmax = Math.max(arr[i], arr[i] + cmax);
            max = Math.max(max, cmax);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { -1, -2, -3, -4 };
        int res = kadanesAlgo(arr, arr.length);
        System.out.println(res);
    }
}
