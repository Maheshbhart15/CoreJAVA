package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

    // Method to remove duplicates from an array using Set
    public static int[] removeDuplicates(int[] array) {
        // Create a HashSet to store unique elements
        Set<Integer> set = new HashSet<>();

        // Add elements to the HashSet
        for (int num : array) {
            set.add(num);
        }

        // Convert the HashSet back to an array
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }

    // Main method to test the removeDuplicates function
    public static void main(String[] args) {
        int[] array = {2,3,4,3,2,5,6,7,6};
        int[] uniqueArray = removeDuplicates(array);

        // Print the result
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }
}
