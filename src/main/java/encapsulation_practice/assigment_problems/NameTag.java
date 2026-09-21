package encapsulation_practice.assigment_problems;

public class NameTag {
    private final String firstName;
    private final String lastNameInitial;

    public NameTag(String fullName) {
        String[] parts = fullName.split(" ");
        this.firstName = parts[0];
        if (parts.length > 1 && !parts[1].isEmpty()) {
            this.lastNameInitial = parts[1].substring(0, 1);
        } else {
            this.lastNameInitial = "";
        }
    }

    public String getNickname() {
        return firstName + " " + lastNameInitial + ".";
    }
}
