package encapsulation_practice.assigment_problems;

public class AssignmentRunner {
    public static void main(String[] args) {
        System.out.println("====== Running Session 10 (Encapsulation Practice) Assignment Tests ======\n");

        testProblem1();
        testProblem2();
        testProblem3();
        testProblem4();
        testProblem5();

        System.out.println("====== All Session 10 Tests Passed! ======");
    }

    private static void testProblem1() {
        System.out.println("Testing Problem 1: The Piggy Bank...");
        PiggyBank pb = new PiggyBank("PB-1");
        pb.deposit(100);
        assertEquals("P1 deposit", 100.0, pb.getSavings());

        pb.withdraw(30);
        assertEquals("P1 withdraw", 70.0, pb.getSavings());

        pb.withdraw(500);
        assertEquals("P1 rejected withdraw", 70.0, pb.getSavings());
        System.out.println("Problem 1 passed.\n");
    }

    private static void testProblem2() {
        System.out.println("Testing Problem 2: The Quiz Scorecard...");
        Scorecard sc = new Scorecard(4);
        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);

        assertEquals("P2 score", 3, sc.getScore());
        System.out.println("Problem 2 passed.\n");
    }

    private static void testProblem3() {
        System.out.println("Testing Problem 3: The Nickname Tag...");
        NameTag tag = new NameTag("Maria Gomez");
        assertEquals("P3 nickname", "Maria G.", tag.getNickname());
        System.out.println("Problem 3 passed.\n");
    }

    private static void testProblem4() {
        System.out.println("Testing Problem 4: The Locker Code...");
        Locker l = new Locker(101, "1234");
        boolean changed1 = l.changeCode("1234", "5678");
        assertEquals("P4 success change", true, changed1);

        boolean changed2 = l.changeCode("0000", "9999");
        assertEquals("P4 rejected change", false, changed2);
        System.out.println("Problem 4 passed.\n");
    }

    private static void testProblem5() {
        System.out.println("Testing Problem 5: The Attendance Sheet...");
        AttendanceSheet sheet = new AttendanceSheet(30);
        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");

        assertEquals("P5 present count", 2, sheet.getPresentCount());
        assertEquals("P5 isPresent Ben", true, sheet.isPresent("Ben"));
        assertEquals("P5 isPresent Chen", false, sheet.isPresent("Chen"));
        System.out.println("Problem 5 passed.\n");
    }

    private static void assertEquals(String testName, Object expected, Object actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError(testName + " failed! Expected: " + expected + ", Actual: " + actual);
        }
    }
}
