package categoryc.assigment_problems;

public class ProductOfArrayExceptSelf {
    /**
     * Computes product of all elements in array except self without using division.
     * Uses two passes: forward pass for prefix products and backward pass for suffix products.
     *
     * @param nums input integer array
     * @return answer array where answer[i] is product of all elements except nums[i]
     */
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Forward pass: calculate prefix products
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Backward pass: multiply suffix products
        int rightRunningProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= rightRunningProduct;
            rightRunningProduct *= nums[i];
        }

        return answer;
    }
}
