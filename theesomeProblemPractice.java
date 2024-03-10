import java.util.*;

public class theesomeProblemPractice {
    static void input(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] threesome(int arr[], int target) {

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int left = 1;
            int right = arr.length - 1;
            int currentSum = arr[left] + arr[right] + arr[i];
            while (left < right) {
                if (arr[left] + arr[right] + arr[i] == target) {
                    int a[] = { i, left, right };
                    return a;
                } else if (currentSum < target) {
                    left++;
                } else {
                    right--;
                    ;
                }

            }
            
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Given input : ");
        input(arr); 
        System.out.println("Enter Target : ");
        int target = sc.nextInt();

       int ans[] = threesome(arr, target);
        input(ans);
    }
}
