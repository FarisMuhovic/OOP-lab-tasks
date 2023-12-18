package task2;

import java.util.ArrayList;
import java.util.List;

public class GradeAnalyser {
    private List<Integer> grades = new ArrayList<>();

    public GradeAnalyser(List<Integer> grades) {
        this.grades = grades;
    }
    public double averageGrade(){
        double sum = 0.0;
        for (Integer grade : grades) {
            sum+=grade;
        }
        return sum/this.grades.size();
    }
    public void printSummary() {
        System.out.println("Grades: " + grades);
        System.out.println("Average Grade: " + averageGrade());
    }
}
