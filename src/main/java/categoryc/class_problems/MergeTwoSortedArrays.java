package categoryc.class_problems;

public class MergeTwoSortedArrays {
    /**
     * Merges two sorted integer arrays into a single sorted array.
     *
     * @param arr1 first sorted array (may be empty)
     * @param arr2 second sorted array (may be empty)
     * @return a new array containing all elements from arr1 and arr2 in sorted order
     */
    public int[] merge(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
        return result;
    }
}
