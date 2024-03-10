/**
 * subarraySumusingNestedLoops
 */
public class subarraySumusingNestedLoops {
    static void subsum(int arr[], int sum, int n) {
        for (int i = 0; i < arr.length; i++) {
            int currentSum = arr[i];
            if (currentSum == sum) {
                System.out.println("Sum found at indexes " + i);
                return;
            } else {

                for (int j = i + 1; j < arr.length; j++) {
                    currentSum += arr[j];
                    if (currentSum == sum) {
                        System.out.println("Sum found between " + i + " and " + j);
                        return;
                    }
                }
            }
        }
        System.out.println("sum not found ");
        return;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6, 5 };
        int sum = 10;
        int n = arr.length;
        subsum(arr, sum, n);
    }
}