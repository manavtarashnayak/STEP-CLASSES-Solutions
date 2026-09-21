package hackathon.assigment_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Candidate implements Comparable<Candidate> {
    private String name;
    private double cgpa;
    private int codingScore;

    public Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public int getCodingScore() {
        return codingScore;
    }

    public double getCompositeScore() {
        return (cgpa * 10.0) + (codingScore / 2.0);
    }

    // Overloaded filter 1: CGPA-only quick filter (CGPA >= 7.0)
    public static boolean isEligible(double cgpa) {
        return cgpa >= 7.0;
    }

    // Overloaded filter 2: Combined CGPA and coding score filter (CGPA >= 6.5 && codingScore >= 60)
    public static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }

    public boolean isEligible() {
        return isEligible(cgpa) || isEligible(cgpa, codingScore);
    }

    @Override
    public int compareTo(Candidate other) {
        return Double.compare(other.getCompositeScore(), this.getCompositeScore());
    }

    public static String shortlistAndRank(Candidate[] candidates) {
        if (candidates == null || candidates.length == 0) return "";

        List<Candidate> shortlistedList = new ArrayList<>();
        for (Candidate c : candidates) {
            if (c.isEligible()) {
                shortlistedList.add(c);
            }
        }

        Candidate[] shortlistedArray = shortlistedList.toArray(new Candidate[0]);
        Arrays.sort(shortlistedArray);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shortlistedArray.length; i++) {
            sb.append(i + 1)
              .append(". ")
              .append(shortlistedArray[i].getName())
              .append(" (")
              .append(String.format(Locale.US, "%.1f", shortlistedArray[i].getCompositeScore()))
              .append(")");
            if (i < shortlistedArray.length - 1) {
                sb.append(" | ");
            }
        }

        return sb.toString();
    }
}
