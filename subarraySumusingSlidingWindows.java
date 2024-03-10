public class subarraySumusingSlidingWindows {
    static void subsum(int arr[], int sum, int n) {

        int left = 0;
        int right = 0;
        int currentSum = 0;
        while (right <n) {
            currentSum += arr[right];

            while (currentSum > sum) {
                currentSum -= arr[left];
                left++;
            }
            if (currentSum == sum) {
                System.out.println("Subarray with sum " + sum + " found between indices " + left + " and " + right);
                return;
            }
            right++;
        }
        System.out.println("SubArray not found ");

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6, 5 };
        int sum = 10;
        int n = arr.length;
        subsum(arr, sum, n);
    }
}
