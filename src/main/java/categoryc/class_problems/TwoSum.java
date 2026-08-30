package categoryc.class_problems;

public class TwoSum {
    /**
     * Returns indices of the two numbers such that they add up to target.
     * Assumes exactly one solution exists and the same element cannot be used twice.
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // Should never happen based on problem guarantees
        throw new IllegalArgumentException("No two-sum solution");
    }
}
