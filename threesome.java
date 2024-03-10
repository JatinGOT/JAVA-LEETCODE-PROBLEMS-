import java.util.Arrays;

public class threesome {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] threesome(int arr[], int target) {

        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {

            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int currentSum = arr[left] + arr[right] + arr[i];
                if (currentSum == target) {
                    int a[] = { i, left, right };
                    return a;
                } else if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }

        }
        return null;

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,8,2};
        int target = 13;
        int ans[] = threesome(arr, target);
        if (ans != null) {
            printArray(ans);
        } else {
            System.out.println("No triplet found.");
        }
    }
}
// import java.util.Arrays;

// public class ThreeSum {
// public static void threeSum(int[] nums, int target) {
// Arrays.sort(nums);

// for (int i = 0; i < nums.length - 2; i++) {
// // Skip duplicates
// if (i > 0 && nums[i] == nums[i - 1]) {
// continue;
// }

// int left = i + 1;
// int right = nums.length - 1;

// while (left < right) {
// int currentSum = nums[i] + nums[left] + nums[right];

// if (currentSum == target) {
// System.out.println(nums[i] + ", " + nums[left] + ", " + nums[right]);

// // Skip duplicates
// while (left < right && nums[left] == nums[left + 1]) {
// left++;
// }
// while (left < right && nums[right] == nums[right - 1]) {
// right--;
// }

// left++;
// right--;
// } else if (currentSum < target) {
// left++;
// } else {
// right--;
// }
// }
// }
// }

// public static void main(String[] args) {
// int[] nums = {-1, 0, 1, 2, -1, -4};
// int target = 0;

// threeSum(nums, target);
// }
// }
