import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MergeUniqueArrays {

    public static ArrayList<Integer> getUniqueElements(int[] arr1, int[] arr2) {
        // Combine elements into a Set for efficient duplicate removal
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : arr1) {
            uniqueElements.add(num);
        }
        for (int num : arr2) {
            uniqueElements.add(num);
        }

        // Convert the Set back to an ArrayList
        return new ArrayList<>(uniqueElements);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        ArrayList<Integer> uniqueList = getUniqueElements(arr1, arr2);

        System.out.println(uniqueList);  // Output: [1, 2, 6, 7]
    }
}

