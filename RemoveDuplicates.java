public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] sortedArray = { 1,1,2,2,3,4,4,4,5 }; // Replace this array with your sorted array
        // int k = removeDuplicates(sortedArray);

        // // Print the modified array
        // for (int i = 0; i < k; i++) {
        //     System.out.print(sortedArray[i] + " ");
        // }
        // System.out.println();

        removeDuplicates(sortedArray);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }

    static int removeDuplicates(int[] nums) {

        int uniqueIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        // The uniqueIndex is the index of the last unique element, so the length of the
        // modified array is uniqueIndex + 1
        return uniqueIndex + 1;
    }
}
