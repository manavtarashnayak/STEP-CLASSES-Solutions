package encapsulation_assignment.assigment_problems;

public class AssignmentRunner {
    public static void main(String[] args) {
        System.out.println("====== Running Session 9 (Encapsulation Assignment) Tests ======\n");

        testProblem1();
        testProblem2();
        testProblem3();
        testProblem4();
        testProblem5();

        System.out.println("====== All Session 9 Tests Passed! ======");
    }

    private static void testProblem1() {
        System.out.println("Testing Problem 1: The Health Bar...");
        Character c = new Character(100);
        c.takeDamage(30);
        assertEquals("P1 damage", 70, c.getHealth());

        c.heal(50);
        assertEquals("P1 capped heal", 100, c.getHealth());

        c.takeDamage(150);
        assertEquals("P1 floored damage", 0, c.getHealth());
        System.out.println("Problem 1 passed.\n");
    }

    private static void testProblem2() {
        System.out.println("Testing Problem 2: The Playlist...");
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();
        copy[0] = "Hacked";

        if (!p.getSongs()[0].equals("Song A")) {
            throw new AssertionError("P2 failed! Returned array mutation affected internal playlist state.");
        }
        assertEquals("P2 song count", 2, p.getSongCount());
        System.out.println("Problem 2 passed.\n");
    }

    private static void testProblem3() {
        System.out.println("Testing Problem 3: The Password Checker...");
        PasswordChecker pc1 = new PasswordChecker("abcd");
        assertEquals("P3 weak", "Weak", pc1.getStrength());

        PasswordChecker pc2 = new PasswordChecker("abcdefghij");
        assertEquals("P3 strong", "Strong", pc2.getStrength());
        System.out.println("Problem 3 passed.\n");
    }

    private static void testProblem4() {
        System.out.println("Testing Problem 4: The Traffic Light...");
        TrafficLight t = new TrafficLight("TL-9");
        assertEquals("P4 initial RED", "RED", t.getColor());

        t.next();
        assertEquals("P4 next GREEN", "GREEN", t.getColor());

        t.next();
        assertEquals("P4 next YELLOW", "YELLOW", t.getColor());

        t.next();
        assertEquals("P4 next RED", "RED", t.getColor());
        System.out.println("Problem 4 passed.\n");
    }

    private static void testProblem5() {
        System.out.println("Testing Problem 5: The Shopping Cart...");
        Cart cart = new Cart("CART-5", 20);
        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        if (cart.getTotal() != 500.0) {
            throw new AssertionError("P5 failed! Expected total 500.0, got: " + cart.getTotal());
        }
        assertEquals("P5 item count", 3, cart.getItemCount());
        System.out.println("Problem 5 passed.\n");
    }

    private static void assertEquals(String testName, Object expected, Object actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError(testName + " failed! Expected: " + expected + ", Actual: " + actual);
        }
    }
}
