class UnionAndIntersesctionOfArrays {
    public static void unionOfArrays(int[] arr1, int[] arr2, int n1, int n2) {
        if (n1 == 0 && n2 == 0) {
            return;
        }
        if (n1 == 0) {
            printArray(arr2);
            return;
        } else if (n2 == 0) {
            printArray(arr1);
            return;
        }
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else {
                System.out.print(arr2[j] + " ");
                j++;
            }
        }
        while (i < n1) {
            System.out.print(arr1[i] + " ");
            i++;
        }
        while (j < n2) {
            System.out.print(arr2[j] + " ");
            j++;
        }

    }

    public static void intersectionOfArrays(int[] arr1, int[] arr2, int n1, int n2) {
        if (n1 == 0 || n2 == 0) {
            return;
        }
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 5, 6, 7, 8, 20 };
        int[] arr2 = new int[] { 3, 7, 8, 20, };
        unionOfArrays(arr1, arr2, arr1.length, arr2.length);
        System.out.println();
        intersectionOfArrays(arr1, arr2, arr1.length, arr2.length);
    }
}
