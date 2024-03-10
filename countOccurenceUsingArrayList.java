import java.util.ArrayList;
import java.util.Collections;

public class countOccurenceUsingArrayList {
    static int countOccurence(ArrayList<Integer> cList,int x){
        // returning the frequency of
        // element x in the ArrayList
        // using Collections.frequency() method
        return Collections.frequency(cList, x);
    }
    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
        int x =2;
        ArrayList<Integer> cList = new ArrayList<>();
            
        // adding elements of array to
        // ArrayList
      for (int i : arr) {
        
          cList.add(i);
      }
        
        System.out.println(x+" Occurs "+countOccurence(cList,x)+ " times ");
    }   
}
