package categoryc.assigment_problems;

public class MaximumSubarray {
    /**
     * Finds contiguous subarray with largest sum using Kadane's Algorithm.
     *
     * @param nums integer array (may contain negative numbers)
     * @return maximum contiguous subarray sum
     */
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Decide whether to extend current subarray or start fresh from nums[i]
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        return maxSoFar;
    }
}
