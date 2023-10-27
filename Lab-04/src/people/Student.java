package people;

import java.util.ArrayList;

public class Student extends Person{
    private int credits = 0;
    private int student_id;
    private ArrayList<Character> grades = new ArrayList<>();
    public Student(String n, String s){
        super(n,s);
    }
    public int credits() {
        return credits;
    }
    public int getStudent_id() { return this.student_id; }
    public ArrayList<Character> getGrade() { return  this.grades; }
    public void study(){
        this.credits++;
    }
    public void addGrade(Character grade) {
        this.grades.add(grade);
    }
    public String toString() {
        return super.toString() + " Credits " + this.credits();
    }
}
