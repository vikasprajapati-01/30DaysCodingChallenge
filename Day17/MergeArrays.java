import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};

        int[] mergedArray = mergeArrays(array1, array2);

        // Print the merged array
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    // Method to merge two arrays without using System.arraycopy
    private static int[] mergeArrays(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;

        int[] result = new int[length1 + length2];

        // Copy elements from the first array to the result array
        for (int i = 0; i < length1; i++) {
            result[i] = arr1[i];
        }

        // Copy elements from the second array to the result array
        for (int i = 0; i < length2; i++) {
            result[length1 + i] = arr2[i];
        }

        return result;
    }
}