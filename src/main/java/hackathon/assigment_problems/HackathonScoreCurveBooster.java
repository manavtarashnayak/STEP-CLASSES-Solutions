package hackathon.assigment_problems;

public class HackathonScoreCurveBooster {
    /**
     * Boosts every score in place by adding a flat bonus.
     *
     * @param scores array of team scores to modify directly
     * @param bonus flat bonus points to add
     */
    public static void curveScores(int[] scores, int bonus) {
        if (scores == null) return;
        for (int i = 0; i < scores.length; i++) {
            scores[i] += bonus;
        }
    }
}
