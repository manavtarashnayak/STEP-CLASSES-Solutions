package hackathon.assigment_problems;

public class DuplicateTeamNameFinder {
    /**
     * Scans registered team names using plain nested loops to find the first duplicate.
     *
     * @param teamNames array of team names
     * @return result string indicating duplicate found or no duplicates
     */
    public static String findDuplicateTeam(String[] teamNames) {
        if (teamNames == null) return "No Duplicates Found";

        for (int i = 0; i < teamNames.length; i++) {
            for (int j = i + 1; j < teamNames.length; j++) {
                if (teamNames[i].equals(teamNames[j])) {
                    return "Duplicate Found: " + teamNames[i];
                }
            }
        }

        return "No Duplicates Found";
    }
}
