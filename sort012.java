public class sort012 {

    static void sortArray(int arr[], int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {

                // int temp = arr[low];
                // arr[low] = arr[mid];
                // arr[mid] = temp;
                swap(arr, low, mid);
                mid++;
                low++;

            } else if (arr[mid] == 1) {
                mid++;
            } else {
                // int temp = arr[mid];
                // arr[mid] = arr[high];
                // arr[high] = temp;
                swap(arr, mid, high);
                high--;

            }
        }

    }
    static void swap(int arr[],int i , int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={0, 1 , 1 , 0 , 1 , 2 , 1 , 2 , 0 , 0 , 0 };
        int n = arr.length;
        System.out.println("Unsorted Array");
        printArray(arr);
        sortArray(arr,n);
        System.out.println("Sorted Array");

        printArray(arr);
    }
}
