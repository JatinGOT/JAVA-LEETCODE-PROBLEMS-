import java.util.Arrays;

public class kthLargestAndSmallestElement {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int kthSmallestElement(int arr[], int k) {
        Arrays.sort(arr);
        printArray(arr);
        int n = arr.length;
        return arr[k - 1];
    }
    static int kthLargestElement(int arr[], int k) {
        Arrays.sort(arr);
        printArray(arr);
        int n = arr.length;
        return arr[n-k];
    }

    public static void main(String[] args) {
        int arr[] = { 5, 12, 4, 6, 2, 4 };
        int k = 2;
        // kthSmallestElement(arr,k);
        // printArray(arr);
        System.out.println(kthSmallestElement(arr, k));
        System.out.println(kthLargestElement(arr, k));

    }
}
