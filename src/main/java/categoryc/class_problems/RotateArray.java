package categoryc.class_problems;

public class RotateArray {
    /**
     * Rotates the array to the right by k steps.
     * Uses three-step reversal algorithm.
     */
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) return;
        int n = nums.length;
        k = k % n;
        if (k < 0) k += n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }
}
