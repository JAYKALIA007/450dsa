//package matrices;

class SearchInA2dMatrix {
    public static boolean isPresent(int[][] matrix, int rows, int cols, int target) {
        if (rows == 0 || cols == 0)
            return false;
        int left = 0;
        int right = (rows * cols) - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int index1 = mid / cols;
            int index2 = mid % cols;
            if (matrix[index1][index2] == target)
                return true;
            else if (matrix[index1][index2] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 13;
        boolean res = isPresent(matrix, matrix.length, matrix[0].length, target);
        System.out.println(res);
    }
}