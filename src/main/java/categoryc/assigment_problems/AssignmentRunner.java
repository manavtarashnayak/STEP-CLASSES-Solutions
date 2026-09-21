package categoryc.assigment_problems;

import java.util.Arrays;

public class AssignmentRunner {
    public static void main(String[] args) {
        System.out.println("====== Running Category C Assignment Tests ======\n");

        testProductExceptSelf();
        testMaxSubArray();
        testThreeSum();
        testSubarraySum();
        testFindMin();

        System.out.println("====== All Category C Tests Passed Successfully! ======");
    }

    private static void testProductExceptSelf() {
        System.out.println("Testing A1: Product of Array Except Self...");
        ProductOfArrayExceptSelf solver = new ProductOfArrayExceptSelf();

        int[] input1 = {1, 2, 3, 4};
        int[] expected1 = {24, 12, 8, 6};
        int[] actual1 = solver.productExceptSelf(input1);
        assertArrayEquals("A1 Sample 1", expected1, actual1);

        int[] input2 = {-1, 1, 0, -3, 3};
        int[] expected2 = {0, 0, 9, 0, 0};
        int[] actual2 = solver.productExceptSelf(input2);
        assertArrayEquals("A1 Sample 2", expected2, actual2);

        System.out.println("A1 passed.\n");
    }

    private static void testMaxSubArray() {
        System.out.println("Testing A2: Maximum Subarray...");
        MaximumSubarray solver = new MaximumSubarray();

        int[] input1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals("A2 Sample 1", 6, solver.maxSubArray(input1));

        int[] input2 = {-3, -1, -2};
        assertEquals("A2 Sample 2", -1, solver.maxSubArray(input2));

        System.out.println("A2 passed.\n");
    }

    private static void testThreeSum() {
        System.out.println("Testing A3: 3Sum...");
        ThreeSum solver = new ThreeSum();

        int[] input1 = {-1, 0, 1, 2, -1, -4};
        int[][] expected1 = {{-1, -1, 2}, {-1, 0, 1}};
        int[][] actual1 = solver.threeSum(input1);
        assert2DArrayEquals("A3 Sample 1", expected1, actual1);

        int[] input2 = {0, 0, 0};
        int[][] expected2 = {{0, 0, 0}};
        int[][] actual2 = solver.threeSum(input2);
        assert2DArrayEquals("A3 Sample 2", expected2, actual2);

        System.out.println("A3 passed.\n");
    }

    private static void testSubarraySum() {
        System.out.println("Testing A4: Subarray Sum Equals K...");
        SubarraySumEqualsK solver = new SubarraySumEqualsK();

        int[] input1 = {1, 1, 1};
        assertEquals("A4 Sample 1", 2, solver.subarraySum(input1, 2));

        int[] input2 = {1, -1, 0};
        assertEquals("A4 Sample 2", 3, solver.subarraySum(input2, 0));

        System.out.println("A4 passed.\n");
    }

    private static void testFindMin() {
        System.out.println("Testing A5: Find Minimum in Rotated Sorted Array...");
        FindMinInRotatedSortedArray solver = new FindMinInRotatedSortedArray();

        int[] input1 = {3, 4, 5, 1, 2};
        assertEquals("A5 Sample 1", 1, solver.findMin(input1));

        int[] input2 = {4, 5, 6, 7, 0, 1, 2};
        assertEquals("A5 Sample 2", 0, solver.findMin(input2));

        int[] input3 = {11, 13, 15, 17};
        assertEquals("A5 Sample 3", 11, solver.findMin(input3));

        System.out.println("A5 passed.\n");
    }

    private static void assertEquals(String testName, int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError(testName + " failed! Expected: " + expected + ", Actual: " + actual);
        }
    }

    private static void assertArrayEquals(String testName, int[] expected, int[] actual) {
        if (!Arrays.equals(expected, actual)) {
            throw new AssertionError(testName + " failed! Expected: " + Arrays.toString(expected) + ", Actual: " + Arrays.toString(actual));
        }
    }

    private static void assert2DArrayEquals(String testName, int[][] expected, int[][] actual) {
        if (expected.length != actual.length) {
            throw new AssertionError(testName + " failed! Length mismatch: Expected " + expected.length + ", Actual " + actual.length);
        }
        for (int i = 0; i < expected.length; i++) {
            if (!Arrays.equals(expected[i], actual[i])) {
                throw new AssertionError(testName + " failed at row " + i + "! Expected: " + Arrays.toString(expected[i]) + ", Actual: " + Arrays.toString(actual[i]));
            }
        }
    }
}
