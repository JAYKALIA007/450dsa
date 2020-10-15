class CountInversions {
    public static int mergeSort(int[] arr, int l, int h) {
        int count = 0;
        if (l < h) {
            int mid = l + (h - l) / 2;
            count += mergeSort(arr, l, mid);
            count += mergeSort(arr, mid + 1, h);
            count += merge(arr, l, mid, h);
        }
        return count;
    }

    public static int merge(int[] arr, int low, int mid, int hi) {
        int n1 = mid - low + 1;
        int n2 = hi - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[low + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[mid + 1 + i];
        }
        int i = 0, j = 0, k = low;
        int count = 0;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i++];
            } else {
                arr[k] = R[j++];
                count += n1 - i;// everything is similar to merge sort, with only one addition
                                // i.e,this line increases the count everytime we come across a condition
                                // that the right half array has something which is lower than the left half
                                // subarray
            }
            k++;
        }
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 20, 6, 4, 5 };
        int res = mergeSort(arr, 0, arr.length - 1);
        System.out.println(res);
    }
}
