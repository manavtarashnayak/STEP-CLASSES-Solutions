package categoryc.assigment_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    /**
     * Finds all unique triplets in the array which sum to zero.
     *
     * @param nums input integer array
     * @return 2D array of unique triplets
     */
    public int[][] threeSum(int[] nums) {
        Arrays.sort(nums);
        List<int[]> result = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate values for the first element of the triplet
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;
            int target = -nums[i];

            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    result.add(new int[]{nums[i], nums[left], nums[right]});

                    // Skip duplicates for the second and third elements
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
