public class countNumberOfOccurence {
    static int countOccurence(int x, int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }

        }
        return count;
        // System.out.println(count);

    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int x = 5;
        int arr[] = { 1, 2, 55, 5, 5, 1, 5, 4, 1, 2 };
        // System.out.println(countOccurence(arr, x));
        System.out.println(countOccurence(x, arr));
    }
}
