class SortAnArrayOf_012 {
    public static void ducthFlagAlgo(int[] arr, int size) {
        if (arr.length <= 1)
            return;
        int low = 0, mid = 0, high = size - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
            }

        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 1, 2, 1, 0, 0, 1, 0, 2, 0, 1, 2, 0 };
        ducthFlagAlgo(arr, arr.length);
    }

}
