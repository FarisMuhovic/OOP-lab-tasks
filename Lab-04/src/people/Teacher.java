package people;

public class Teacher extends Person{
    private int salary;

    public Teacher(String n, String s, int salary) {
        super(n,s);
        this.salary = salary;
    }
    public int getSalary(){
        return this.salary;
    }
    public String toString() {
        return super.toString() + "\n" + " Salary " + this.getSalary();
    }
}
