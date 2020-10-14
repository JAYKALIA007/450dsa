class ReverseAnArray {
    public static void reverse(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverse(arr, left + 1, right - 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1 };
        reverse(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

// Iterative approach
// public int[] reverse(int[] arr)
// {
// if(arr.length<=1)
// return arr;
// int left=0,right=arr.length-1;
// while(left<right)
// {
// int temp=arr[left];
// arr[left]=arr[right];
// arr[right]=temp;
// left++;
// right--;
// }
// return arr;
// }
