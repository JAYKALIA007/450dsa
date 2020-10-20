// L
// 1   2   3
// K    4   5   6     lr          ->  1 2 3 6 9 8 7 4 5
// 7   8   9    
// lc
class PrintMatrixInSpiralOrder {
    public static void spiral(int[][] arr, int rows, int cols) {
        int k = 0, l = 0;
        int lastRow = rows - 1;
        int lastCol = cols - 1;
        while (k < rows && l < cols) {
            for (int i = l; i <= lastCol; i++) // 1st row
            {
                System.out.print(arr[k][i] + " ");
            }
            k++;

            for (int i = k; i <= lastRow; i++) // last col
            {
                System.out.print(arr[i][lastCol] + " ");
            }
            lastCol--;
            if (k <= lastRow) {
                for (int i = lastCol; i >= l; i--) // last row
                {
                    System.out.print(arr[lastRow][i] + " ");
                }
                lastRow--;
            }

            if (l <= lastCol) {
                for (int i = lastRow; i >= k; i--) {
                    System.out.print(arr[i][l] + " ");
                }
                l++;
            }

        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[][] { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } };
        spiral(arr, arr.length, arr[0].length);
    }

}
