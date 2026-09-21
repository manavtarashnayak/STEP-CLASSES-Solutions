package encapsulation_practice.assigment_problems;

public class AttendanceSheet {
    private String[] presentStudents;
    private int presentCount;

    public AttendanceSheet(int maxCapacity) {
        this.presentStudents = new String[maxCapacity];
        this.presentCount = 0;
    }

    public void markPresent(String name) {
        if (isPresent(name)) {
            return; // Avoid duplicates
        }
        if (presentCount < presentStudents.length) {
            presentStudents[presentCount++] = name;
        }
    }

    public boolean isPresent(String name) {
        for (int i = 0; i < presentCount; i++) {
            if (presentStudents[i].equals(name)) {
                return true;
            }
        }
        return false;
    }

    public int getPresentCount() {
        return presentCount;
    }
}
