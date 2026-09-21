package categoryc.assigment_problems;

public class FindMinInRotatedSortedArray {
    /**
     * Finds minimum element in a rotated sorted array of unique elements.
     * Uses binary search comparing mid with right element.
     *
     * @param nums array of unique integers sorted in ascending order and rotated
     * @return minimum element in nums
     */
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than right element, minimum must be in right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // Minimum is in left half (including mid)
                right = mid;
            }
        }

        return nums[left];
    }
}
