package week_2;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {


    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> adjustedGrades = new ArrayList<>();

        for (Integer grade : grades) {
            if (grade <= 37 || grade % 5 <= 2) {
                adjustedGrades.add(grade);
            } else {
                adjustedGrades.add(grade + (5 - grade % 5));
            }
        }
        return adjustedGrades;
    }

}
