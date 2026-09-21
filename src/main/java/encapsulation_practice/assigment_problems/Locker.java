package encapsulation_practice.assigment_problems;

public class Locker {
    private final int lockerNumber;
    private String code;

    public Locker(int lockerNumber, String code) {
        this.lockerNumber = lockerNumber;
        this.code = code;
    }

    public boolean changeCode(String oldCode, String newCode) {
        if (this.code.equals(oldCode)) {
            this.code = newCode;
            System.out.println("Code changed successfully");
            return true;
        } else {
            System.out.println("Code change rejected: incorrect current code");
            return false;
        }
    }

    public int getLockerNumber() {
        return lockerNumber;
    }
}
