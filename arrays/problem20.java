class RearrangeTheArrayNegativePositive {
    public static void rearrange(int[] arr, int n) {

        dutchAlgoArrangement(arr, arr.length);
        int i = 1, j = firstPositive(arr, n);
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i += 2;
            j++;
        }
        print(arr);
    }

    public static void dutchAlgoArrangement(int[] arr, int n) {
        int low = 0, high = 0;
        while (high < n) {
            if (arr[high] < 0) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high++;
            } else {
                high++;
            }
        }
    }

    public static int firstPositive(int[] arr, int n) {
        int l = 0, h = n - 1;
        while (l < h) {
            int mid = (l + h) / 2;
            if (arr[mid] < 0) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }
        // System.out.println(l);
        return l;
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[] { -5, -2, 5, 2, -4, -7, -1, 8, 0, -8 };
        System.out.println("Before");
        print(arr);
        System.out.println("After rearranging");
        rearrange(arr, arr.length);
    }
}