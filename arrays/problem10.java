class minJumpsToReachEnd {
    public static int minJumps(int[] arr, int length) {
        if (length == 1 || arr[0] == 0)
            return 0;
        int jumps = 0, currFar = 0, currEnd = 0;
        for (int i = 0; i < length - 1; i++) {
            currFar = Math.max(currFar, i + arr[i]);
            if (i == currEnd) {
                jumps++;
                currEnd = currFar;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 1, 1, 4 };
        int res = minJumps(arr, arr.length);
        System.out.print(res);
    }
}
