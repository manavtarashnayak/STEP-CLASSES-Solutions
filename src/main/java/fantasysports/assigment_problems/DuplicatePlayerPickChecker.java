package fantasysports.assigment_problems;

public class DuplicatePlayerPickChecker {
    /**
     * Checks lineup for repeated player names using plain nested loops.
     *
     * @param playerNames array of player names
     * @return message indicating first duplicate or no duplicates
     */
    public static String findDuplicatePick(String[] playerNames) {
        if (playerNames == null) return "No Duplicates Found";

        for (int i = 0; i < playerNames.length; i++) {
            for (int j = i + 1; j < playerNames.length; j++) {
                if (playerNames[i].equals(playerNames[j])) {
                    return "Duplicate Found: " + playerNames[i];
                }
            }
        }

        return "No Duplicates Found";
    }
}
