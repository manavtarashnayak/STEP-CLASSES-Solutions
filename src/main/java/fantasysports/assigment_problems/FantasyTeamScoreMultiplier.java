package fantasysports.assigment_problems;

public class FantasyTeamScoreMultiplier {
    /**
     * Applies captain (2x) and vice-captain (1.5x) multipliers directly to playerScores array.
     *
     * @param playerScores array of player scores to modify in place
     * @param captainIndex index of captain
     * @param viceCaptainIndex index of vice-captain
     */
    public static void applyMultipliers(double[] playerScores, int captainIndex, int viceCaptainIndex) {
        if (playerScores == null) return;
        if (captainIndex >= 0 && captainIndex < playerScores.length) {
            playerScores[captainIndex] *= 2.0;
        }
        if (viceCaptainIndex >= 0 && viceCaptainIndex < playerScores.length) {
            playerScores[viceCaptainIndex] *= 1.5;
        }
    }
}
