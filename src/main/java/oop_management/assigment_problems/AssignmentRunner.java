package oop_management.assigment_problems;

public class AssignmentRunner {
    public static void main(String[] args) {
        System.out.println("====== Running Session 8 (OOP Management) Assignment Tests ======\n");

        testM1();
        testM2();
        testM3();
        testM4();
        testM5();

        System.out.println("====== All Session 8 Tests Passed! ======");
    }

    private static void testM1() {
        System.out.println("Testing M1: Student Placement Record Management...");
        PlacementRecord[] records = {
            new PlacementRecord("Ravi", "TCS", 4.5),
            new PlacementRecord("Anitha", "Zoho", 6.2),
            new PlacementRecord("Karthik", "Infosys", 4.0)
        };

        for (PlacementRecord r : records) {
            r.printRecord();
        }
        System.out.println("M1 passed.\n");
    }

    private static void testM2() {
        System.out.println("Testing M2: Hostel Mess Wallet Management...");
        MessWallet wallet = new MessWallet(500);
        wallet.topUp(200);
        wallet.deduct(1000);
        double bal = wallet.getBalance();
        if (bal != 700.0) {
            throw new AssertionError("M2 failed! Expected balance 700.0, got: " + bal);
        }
        System.out.println("Final balance: " + bal);
        System.out.println("M2 passed.\n");
    }

    private static void testM3() {
        System.out.println("Testing M3: Course Credit Management...");
        Course c1 = new Course("21CSC201J", "Data Structures", 4);
        Course c2 = new Course("21CSC205L", "DSA Lab", 3, 1);

        System.out.println(c1.getCode() + " total credits: " + c1.totalCredits());
        System.out.println(c2.getCode() + " total credits: " + c2.totalCredits());

        if (c1.totalCredits() != 4 || c2.totalCredits() != 4) {
            throw new AssertionError("M3 totalCredits mismatch!");
        }
        System.out.println("M3 passed.\n");
    }

    private static void testM4() {
        System.out.println("Testing M4: Library ID Card Management...");
        IdCard ravi = new IdCard("Ravi", 0);
        IdCard duplicate = ravi;
        duplicate.booksIssued = 3;

        System.out.println("Ravi's booksIssued (via first variable): " + ravi.booksIssued);
        System.out.println("duplicate == ravi: " + (duplicate == ravi));

        IdCard separate = new IdCard("Ravi", 3);
        System.out.println("separate == ravi: " + (separate == ravi));

        if (ravi.booksIssued != 3 || !(duplicate == ravi) || (separate == ravi)) {
            throw new AssertionError("M4 reference equality checks failed!");
        }
        System.out.println("M4 passed.\n");
    }

    private static void testM5() {
        System.out.println("Testing M5: Student and College Information Management...");
        Student.studentCount = 0; // reset
        new Student("S1", 90);
        new Student("S2", 85);

        Student.printCollegeInfo();
        if (Student.studentCount != 2) {
            throw new AssertionError("M5 failed! Expected studentCount 2, got: " + Student.studentCount);
        }
        System.out.println("M5 passed.\n");
    }
}
