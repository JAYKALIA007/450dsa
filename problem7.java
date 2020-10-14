class RotateByOne {
    public static void rotateArrayBy1(int[] arr, int length) {
        if (length == 1)
            return;
        int temp = arr[length - 1];
        for (int i = length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        rotateArrayBy1(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}