package by.itstep.OlgaRabushko.javalessons.lesson22.model.logic;

public class SchoolManager {
    public static double calculateAvgMark(int[][] groups) {
        double sum = 0;

        for (int i = 0; i < groups.length; i++) {
            sum += calculateAvgMark(groups[i]);
        }
        return sum / groups.length;
    }

    private static double calculateAvgMark(int[] group) {
        double sum = 0;

        for (int i = 0; i < group.length; i++) {
            sum += group[i];

        }
        return sum / group.length;
    }

}
