import people.Person;
import people.Student;
import people.Teacher;
import shapes.Circle;
import shapes.FillType;
import shapes.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
//        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
//        System.out.println(pekka);
//        System.out.println(esko);
//
//        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
//        System.out.println(olli);
//        System.out.println("credits " + olli.credits());
//        olli.study();
//        System.out.println("credits "+ olli.credits());

//        Teacher pekka = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
//        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
//        System.out.println( pekka );
//        System.out.println( esko );
//
//
//        Student olli = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
//        for ( int i=0; i < 25; i++ ) {
//            olli.study();
//        }
//        System.out.println( olli );

//        List<Person> people = new ArrayList<Person>();
//        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200 ));
//        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki"));
//        printDepartment(people);

//        Circle filledCircle = new Circle("Red", FillType.FILLED, 5.0);
//
//        Rectangle notFilledRectangle = new Rectangle("Blue", FillType.NOT_FILLED, 4.0, 6.0);
//
//        System.out.print("Filled Circle: ");
//        filledCircle.displayInfo();
//        System.out.println(" Area: " + filledCircle.getArea());
//        System.out.println("Circumference: " + filledCircle.calculateCircumference(6.6));
//
//        System.out.print("Not Filled Rectangle: ");
//        notFilledRectangle.displayInfo();
//        System.out.println(" Area: " + notFilledRectangle.getArea());


        Person person = new Person("Alice", "123 Main Street");
        Student student = new Student("Bob", "456 Elm Street");
        Teacher teacher = new Teacher("Carol", "789 Oak Street", 50000);

        student.addGrade('A');
        student.addGrade('B');
        student.addGrade('C');
        student.study();
        student.study();

        person.setAge(30);
        person.setCountry("BiH");

        System.out.println("Person:");
        System.out.println("Name: " + person.getName());
        System.out.println("Street: " + person.getStreet());
        System.out.println("Age: " + person.getAge());
        System.out.println("Country: " + person.getCountry());

        System.out.println("\nStudent:");
        System.out.println("Name: " + student.getName());
        System.out.println("Street: " + student.getStreet());
        System.out.println("Credits: " + student.credits());
        System.out.println("Grades: " + student.getGrade());

        System.out.println("\nTeacher:");
        System.out.println("Name: " + teacher.getName());
        System.out.println("Street: " + teacher.getStreet());
        System.out.println("Salary: " + teacher.getSalary());
    }
    public static void printDepartment(List<Person> people) {
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
    }
}