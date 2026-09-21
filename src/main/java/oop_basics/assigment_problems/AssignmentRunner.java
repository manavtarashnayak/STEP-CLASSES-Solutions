package oop_basics.assigment_problems;

public class AssignmentRunner {
    public static void main(String[] args) {
        System.out.println("====== Running Session 7 (OOP Basics) Assignment Tests ======\n");

        testM1();
        testM2();
        testM3();
        testM4();
        testM5();

        System.out.println("====== All Session 7 Tests Passed! ======");
    }

    private static void testM1() {
        System.out.println("Testing M1: Library Inventory Management...");
        BookInventory[] books = {
            new BookInventory("Clean Code", "Robert C. Martin", 3),
            new BookInventory("Effective Java", "Joshua Bloch", 5),
            new BookInventory("Refactoring", "Martin Fowler", 0),
            new BookInventory("Design Patterns", "GoF", 2)
        };

        for (BookInventory b : books) {
            b.printEntry();
        }
        System.out.println("M1 passed.\n");
    }

    private static void testM2() {
        System.out.println("Testing M2: Payroll Salary Management...");
        PayrollAccount account = new PayrollAccount(50000);
        account.creditBonus(5000);
        account.deductTax(10);
        double net = account.getNetSalary();
        if (net != 50000.0) {
            throw new AssertionError("M2 failed! Expected 50000.0, got: " + net);
        }
        System.out.println("Net salary: Rs " + net);
        System.out.println("M2 passed.\n");
    }

    private static void testM3() {
        System.out.println("Testing M3: Employee Profile Creation...");
        Employee perm = new Employee("E-101", "Divya", 65000);
        Employee intern = new Employee("E-102", "Arjun");

        perm.printProfile();
        intern.printProfile();

        if (!perm.getFormattedProfile().equals("E-101 | Divya | Rs 65000.0 | Intern: false")) {
            throw new AssertionError("M3 Permanent Employee profile mismatch!");
        }
        if (!intern.getFormattedProfile().equals("E-102 | Arjun | Rs 0.0 | Intern: true")) {
            throw new AssertionError("M3 Intern profile mismatch!");
        }
        System.out.println("M3 passed.\n");
    }

    private static void testM4() {
        System.out.println("Testing M4: Exam Hall Ticket Reference Management...");
        HallTicket priya = new HallTicket("Priya", 0);
        HallTicket copy = priya;
        copy.seatNumber = 45;

        System.out.println("Priya's seatNumber (via first variable): " + priya.seatNumber);
        System.out.println("copy == priya: " + (copy == priya));

        HallTicket separate = new HallTicket("Priya", 45);
        System.out.println("separate == priya: " + (separate == priya));

        if (priya.seatNumber != 45 || !(copy == priya) || (separate == priya)) {
            throw new AssertionError("M4 reference equality checks failed!");
        }
        System.out.println("M4 passed.\n");
    }

    private static void testM5() {
        System.out.println("Testing M5: Employee and Company Information Management...");
        CompanyEmployee.employeeCount = 0; // reset
        new CompanyEmployee("Emp1", 50000);
        new CompanyEmployee("Emp2", 60000);
        new CompanyEmployee("Emp3", 70000);

        CompanyEmployee.printCompanyInfo();
        if (CompanyEmployee.employeeCount != 3) {
            throw new AssertionError("M5 failed! Expected employeeCount 3, got: " + CompanyEmployee.employeeCount);
        }
        System.out.println("M5 passed.\n");
    }
}
