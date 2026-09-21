package hackathon.assigment_problems;

import java.util.Arrays;

public class AssignmentRunner {
    public static void main(String[] args) {
        System.out.println("====== Running Hackathon & Placement Drive Assignment Tests ======\n");

        testProblem1();
        testProblem2();
        testProblem3();
        testProblem4();
        testProblem5();

        System.out.println("====== All Hackathon Assignment Tests Passed! ======");
    }

    private static void testProblem1() {
        System.out.println("Testing Problem 1: Hackathon Score Curve Booster...");
        int[] scores = {70, 85, 60};
        HackathonScoreCurveBooster.curveScores(scores, 10);
        String actual = Arrays.toString(scores);
        String expected = "[80, 95, 70]";
        assertEquals("Problem 1", expected, actual);
        System.out.println("Problem 1 passed.\n");
    }

    private static void testProblem2() {
        System.out.println("Testing Problem 2: Duplicate Team Name Finder...");
        String[] teams1 = {"ByteForce", "CodeCrafters", "ByteForce"};
        assertEquals("Problem 2 Sample 1", "Duplicate Found: ByteForce", DuplicateTeamNameFinder.findDuplicateTeam(teams1));

        String[] teams2 = {"ByteForce", "CodeCrafters", "NullPointers"};
        assertEquals("Problem 2 Sample 2", "No Duplicates Found", DuplicateTeamNameFinder.findDuplicateTeam(teams2));
        System.out.println("Problem 2 passed.\n");
    }

    private static void testProblem3() {
        System.out.println("Testing Problem 3: Top-3 Podium Finder...");
        int[] scores = {45, 82, 79, 90, 33, 90, 61};
        int[] actual = Top3PodiumFinder.findTopThreeScores(scores);
        int[] expected = {90, 90, 82};
        if (!Arrays.equals(expected, actual)) {
            throw new AssertionError("Problem 3 failed! Expected: " + Arrays.toString(expected) + ", Actual: " + Arrays.toString(actual));
        }
        System.out.println("Problem 3 passed.\n");
    }

    private static void testProblem4() {
        System.out.println("Testing Problem 4: Hackathon Seating Grid Optimizer...");
        int[][] seating = {
            {40, 50, 45},
            {85, 90, 95},
            {30, 20, 25}
        };
        String expected = "Row 0: Quiet Zone | Row 1: Buzzing Zone | Row 2: Quiet Zone";
        assertEquals("Problem 4", expected, HackathonSeatingGridOptimizer.classifyRows(seating, 60));
        System.out.println("Problem 4 passed.\n");
    }

    private static void testProblem5() {
        System.out.println("Testing Problem 5: Placement Drive Shortlisting & Ranking Engine...");
        Candidate[] candidates = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };
        String expected = "1. Aisha (102.0) | 2. Rohit (100.5) | 3. Karan (85.0)";
        assertEquals("Problem 5", expected, Candidate.shortlistAndRank(candidates));
        System.out.println("Problem 5 passed.\n");
    }

    private static void assertEquals(String testName, String expected, String actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError(testName + " failed!\nExpected: " + expected + "\nActual:   " + actual);
        }
    }
}
