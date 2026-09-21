package encapsulation_assignment.assigment_problems;

public class PasswordChecker {
    private String password;

    public PasswordChecker(String password) {
        this.password = password;
    }

    public String getStrength() {
        if (password == null) return "Weak";
        int len = password.length();
        if (len < 6) {
            return "Weak";
        } else if (len <= 9) {
            return "Medium";
        } else {
            return "Strong";
        }
    }
}
