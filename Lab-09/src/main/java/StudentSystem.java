import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class StudentSystem {
    private List<Student> students;

    public StudentSystem(String filename) {
        students = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
            }
            reader.close();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    public List<Student> readStudents(String filename) {
        ArrayList<String> studen = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                studen.add(line);
            }
            for (String s : studen) {
                String[] oneline = s.split(",");
                this.students.add(new Student(oneline[0], oneline[1], oneline[2], oneline[4]));
            }
            reader.close();
        } catch (IOException io) {
            io.printStackTrace();
        }
        return this.students;
    }
    public Optional<Student> getStudentById(String id) {
        if (students.isEmpty())
            throw new EmptyStudentListException("List of students is empty");

        for (Student student : students) {
            if (student.getId().equals(id)){
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }
    public Optional<Student> getHighestGPAStudent() {
        if (students.isEmpty())
            throw new EmptyStudentListException("List of students is empty");

        double highestgpa = 0.0;
            String studentID = "";
            for (Student student : this.students) {
                if (Double.parseDouble(student.getGpa()) > highestgpa) {
                    highestgpa = Double.parseDouble(student.getGpa());
                    studentID = student.getId();
                }
            }
            return getStudentById(studentID);
    }
    public Student getLongestNameStudent() {
        if (students.isEmpty())
            throw new EmptyStudentListException("List of students is empty");

        Student longestNameStudent = students.get(0);
        for (Student student : students) {
            if (student.getName().length() > longestNameStudent.getName().length())
                longestNameStudent = student;
        }
        return longestNameStudent;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}