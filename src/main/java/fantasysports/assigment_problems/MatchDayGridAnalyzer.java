package fantasysports.assigment_problems;

public class MatchDayGridAnalyzer {
    /**
     * Calculates average of a single row.
     *
     * @param row array of runs per over for a match
     * @return average runs per over
     */
    private static double rowAverage(int[] row) {
        if (row == null || row.length == 0) return 0.0;
        double sum = 0;
        for (int runs : row) {
            sum += runs;
        }
        return sum / row.length;
    }

    /**
     * Classifies matches as "Power Surge" or "Normal" based on average runs per over threshold.
     *
     * @param runsPerOver 2D grid of matches and runs per over
     * @param threshold score rate threshold
     * @return formatted summary string
     */
    public static String classifyMatches(int[][] runsPerOver, int threshold) {
        if (runsPerOver == null || runsPerOver.length == 0) return "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < runsPerOver.length; i++) {
            double avg = rowAverage(runsPerOver[i]);
            String status = (avg >= threshold) ? "Power Surge" : "Normal";
            sb.append("Match ").append(i).append(": ").append(status);
            if (i < runsPerOver.length - 1) {
                sb.append(" | ");
            }
        }

        return sb.toString();
    }
}
