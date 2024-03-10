import java.util.Arrays;

/**
 * twoPointerTwoSum
 */
public class twoPointerTwoSum {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] twoSum(int arr[], int target) {

        Arrays.sort(arr); // {0,1,1,2,5}
        int left = 0;
        int right = arr.length - 1;

       

        while (left < right) {
            int cuurentSum = arr[left]+arr[right]; 
            if (arr[left] + arr[right] == target) {
                return new int[] { left, right };
            } else if (cuurentSum < target) {  
                 left++;
            } else {
                right--;
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5 };
        int target = 5;
        int ans[] = twoSum(arr, target);
        printArray(ans);

    }
}