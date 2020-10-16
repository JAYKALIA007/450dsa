class FindDuplicates {
    // This approach is very similar to Floyd's cycle detection algorithm used in
    // linked lists
    public static int findDups(int[] arr, int n) {
        if (n <= 1) {
            System.out.print("No duplicates");
            return Integer.MIN_VALUE;
        }
        int slow = arr[0], fast = arr[0];
        do {
            fast = arr[arr[fast]];
            slow = arr[slow];
        } while (fast != slow);
        fast = arr[0];
        while (fast != slow) {
            fast = arr[fast];
            slow = arr[slow];
        }
        return slow;

    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 3, 4, 2, 2 };
        int duplicate = findDups(arr, arr.length);
        System.out.println(duplicate);
    }
}
