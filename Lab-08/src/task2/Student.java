package task2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String id;
    private List<Integer> grades = new ArrayList<>();

    public Student(String name, String id, List<Integer> grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public String printInfo() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", grades=" + grades +
                '}';
    }
}
