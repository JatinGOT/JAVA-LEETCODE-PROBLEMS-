public class MaxAndMin {
    /* package whatever //do not write package name here */

    static void maxmin(int arr[], int n) {
        if (n == 0) {
            return;
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max element : " + max);
        System.out.println("Min element : " + min);

    }

    public static void main(String[] args) {
        System.out.println("Finding Maximum and Minimum element of an array");
        int arr[] = { 1, 8, 65, 7, 5 };
        int n = arr.length;
        maxmin(arr, n);

    }
}
