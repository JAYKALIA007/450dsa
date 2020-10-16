class findMinAndMax {
    // Brute force using linear search
    // public static void minMax(int[] arr, int n) {
    // if (arr.length == 0)
    // return;
    // if (arr.length == 1) {
    // System.out.println(arr[0]);
    // return;
    // }
    // int max = arr[0];
    // int min = arr[0];
    // for (int i = 1; i < n; i++) {
    // max = Math.max(max, arr[i]);
    // min = Math.min(min, arr[i]);
    // }
    // System.out.println(max + " " + min);
    // }

    public static void minMax(int[] arr, int n) {
        if (arr.length == 0)
            return;
        if (arr.length == 1) {
            System.out.println(arr[0]);
            return;
        }
        int min1 = arr[0], max1 = arr[0];
        int min2 = arr[n / 2], max2 = arr[n / 2];
        for (int i = 1; i < n / 2; i++) {
            min1 = Math.min(min1, arr[i]);
            max1 = Math.max(max1, arr[i]);
        }
        for (int i = n / 2 + 1; i < n; i++) {
            min2 = Math.min(min2, arr[i]);
            max2 = Math.max(max2, arr[i]);
        }
        System.out.println(Math.max(max1, max2));
        System.out.println(Math.min(min1, min2));
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 44, 55, 33, 66, 87, 91, 3 };
        minMax(arr, arr.length);
    }
}
