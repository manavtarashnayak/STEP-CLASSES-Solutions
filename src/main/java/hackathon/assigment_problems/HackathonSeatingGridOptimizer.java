package hackathon.assigment_problems;

public class HackathonSeatingGridOptimizer {
    /**
     * Calculates average of a single seating row.
     *
     * @param row array of scores for a seating row
     * @return row average score
     */
    private static double rowAverage(int[] row) {
        if (row == null || row.length == 0) return 0.0;
        double sum = 0;
        for (int val : row) {
            sum += val;
        }
        return sum / row.length;
    }

    /**
     * Classifies each row as "Quiet Zone" or "Buzzing Zone" based on threshold.
     *
     * @param seatingScores 2D array of seating row scores
     * @param threshold classification threshold
     * @return formatted summary string
     */
    public static String classifyRows(int[][] seatingScores, int threshold) {
        if (seatingScores == null || seatingScores.length == 0) return "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < seatingScores.length; i++) {
            double avg = rowAverage(seatingScores[i]);
            String status = (avg >= threshold) ? "Buzzing Zone" : "Quiet Zone";
            sb.append("Row ").append(i).append(": ").append(status);
            if (i < seatingScores.length - 1) {
                sb.append(" | ");
            }
        }

        return sb.toString();
    }
}
