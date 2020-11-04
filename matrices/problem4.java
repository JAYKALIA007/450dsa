//package matrices;

class FindRowWithMaximum1s // return the index of the row(0 based index)
{
    public static int max1sRowIndex(int[][] matrix, int rows, int cols) {
        if (matrix == null)
            return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        int res = 0;
        for (int i = 0; i < rows; i++) {
            int left = 0, right = cols - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (matrix[i][mid] == 0) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            int countOf1s = cols - left;
            if (countOf1s > max) {
                max = countOf1s;
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] { { 0, 0, 0, 1 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 1, 1 } };
        int res = max1sRowIndex(matrix, matrix.length, matrix[0].length);
        System.out.println(res);
    }
}
