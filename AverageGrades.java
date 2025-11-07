import java.util.Arrays;

public class AverageGrades {
    public static void main(String[] args) {
        average_grades(new int[][]{{51, 83, 28}, {0, 38, 95}}, new int[]{30, 40, 30});
        int[] results = average_grades(new int[][]{{51, 83, 28}, {0, 38, 95}}, new int[]{30, 40, 30});
        System.out.println(Arrays.toString(results));
    }

    static int[] average_grades(int[][] grades, int[] weights) {
        int[] averages = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            double total = 0.0;
            for (int j = 0; j < grades[i].length; j++) {
                total += grades[i][j] * weights[j];
            }
            averages[i] = (int)(total / 100);
        }
        return averages;
    }
}
