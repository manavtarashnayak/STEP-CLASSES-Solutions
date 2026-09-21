package categoryc.assigment_problems;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    /**
     * Returns total number of contiguous subarrays whose sum equals k.
     * Uses prefix sums and hash map frequency counting.
     *
     * @param nums array of integers (may contain negative numbers)
     * @param k target sum
     * @return count of contiguous subarrays summing to k
     */
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;
        Map<Integer, Integer> prefixSumMap = new HashMap<>();

        // Base case: prefix sum 0 has frequency 1 (for subarrays starting at index 0)
        prefixSumMap.put(0, 1);

        for (int num : nums) {
            currentSum += num;

            // If (currentSum - k) exists in map, add its frequency to count
            if (prefixSumMap.containsKey(currentSum - k)) {
                count += prefixSumMap.get(currentSum - k);
            }

            // Update frequency of currentSum in the map
            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}
