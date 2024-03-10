import java.util.Arrays;

class twoSum {
    static int[] twoSsum(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    int a[] = { i, j };
                    return a;
                }
            }

        }
        return null;
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 5, 1 };
        int target = 3;
        int a[] = twoSsum(arr, target);
        printArray(a);
    }
}