import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentSystem system = new StudentSystem("students.csv");
        List<Student> students = system.readStudents("students.csv");
        for (Student student : students) {
//            System.out.println(student);
        }
        Optional<Student> studentten = system.getStudentById("59");
        System.out.println(system.getHighestGPAStudent());
    }
}
