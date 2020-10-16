class MoveNegativeToStart {
    public static void shiftNegatives(int[] arr, int length) {
        if (arr.length <= 1)
            return;
        int high = 0, low = 0;
        while (high < length) {
            if (arr[high] < 0) {
                swap(arr, low, high);
                low++;
                high++;
            } else {
                high++;
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
        int[] arr = new int[] { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        shiftNegatives(arr, arr.length);
    }
}
