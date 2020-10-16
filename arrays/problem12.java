class MergeSortedArrays {
    public static void merge(int[] arr1, int[] arr2, int length1, int length2) {
        if (length1 == 0) {
            printArray(arr2);
            return;
        }
        if (length2 == 0) {
            printArray(arr1);
            return;
        }
        for (int i = 0; i < length1; i++) {
            if (arr2[0] < arr1[i]) {
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
            }
            for (int j = 0; j < length2 - 1; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                } else {
                    break;
                }
            }
        }
        printArray(arr1);
        printArray(arr2);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 4, 7, 13, 19, 55 };
        int[] arr2 = new int[] { 2, 3, 8, 13 };
        merge(arr1, arr2, arr1.length, arr2.length);
    }
}
