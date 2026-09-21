package fantasysports.assigment_problems;

import java.util.Arrays;

public class AssignmentRunner {
    public static void main(String[] args) {
        System.out.println("====== Running Fantasy Sports Assignment Tests ======\n");

        testProblem1();
        testProblem2();
        testProblem3();
        testProblem4();
        testProblem5();

        System.out.println("====== All Fantasy Sports Tests Passed! ======");
    }

    private static void testProblem1() {
        System.out.println("Testing Problem 1: Fantasy Team Score Multiplier...");
        double[] scores = {40, 55, 30, 62};
        FantasyTeamScoreMultiplier.applyMultipliers(scores, 1, 3);
        String actual = Arrays.toString(scores);
        String expected = "[40.0, 110.0, 30.0, 93.0]";
        assertEquals("Problem 1", expected, actual);
        System.out.println("Problem 1 passed.\n");
    }

    private static void testProblem2() {
        System.out.println("Testing Problem 2: Duplicate Player Pick Checker...");
        String[] lineup1 = {"Kohli", "Bumrah", "Kohli", "Rohit"};
        assertEquals("Problem 2 Sample 1", "Duplicate Found: Kohli", DuplicatePlayerPickChecker.findDuplicatePick(lineup1));

        String[] lineup2 = {"Kohli", "Bumrah", "Rohit"};
        assertEquals("Problem 2 Sample 2", "No Duplicates Found", DuplicatePlayerPickChecker.findDuplicatePick(lineup2));
        System.out.println("Problem 2 passed.\n");
    }

    private static void testProblem3() {
        System.out.println("Testing Problem 3: Top Performer Tracker...");
        int[] scores = {45, 82, 79, 90, 33, 90, 61};
        String expected = "Min: 33 | Max: 90 | Spread: 57";
        assertEquals("Problem 3", expected, TopPerformerTracker.findMinMaxSpread(scores));
        System.out.println("Problem 3 passed.\n");
    }

    private static void testProblem4() {
        System.out.println("Testing Problem 4: Match Day Grid Analyzer...");
        int[][] runsPerOver = {
            {4, 6, 8},
            {10, 12, 14},
            {2, 3, 1}
        };
        String expected = "Match 0: Normal | Match 1: Power Surge | Match 2: Normal";
        assertEquals("Problem 4", expected, MatchDayGridAnalyzer.classifyMatches(runsPerOver, 8));
        System.out.println("Problem 4 passed.\n");
    }

    private static void testProblem5() {
        System.out.println("Testing Problem 5: Fantasy League Auto-Draft Ranking Engine...");
        Player[] players = {
            new Player("Virat", 15, 48.0, false),
            new Player("Rahul", 7, 55.0, false),
            new Player("Sameer", 3, 60.0, false),
            new Player("Dev", 12, 20.0, true)
        };
        String expected = "1. Rahul | 2. Virat | 3. Dev";
        assertEquals("Problem 5", expected, Player.draftAndRank(players));
        System.out.println("Problem 5 passed.\n");
    }

    private static void assertEquals(String testName, String expected, String actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError(testName + " failed!\nExpected: " + expected + "\nActual:   " + actual);
        }
    }
}
