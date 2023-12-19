import junit.framework.TestCase;

public class StudentSystemTest extends TestCase {

    public void testGetStudents() {
        StudentSystem sys = new StudentSystem("students.csv");
        sys.readStudents("students.csv");
        assertEquals(70,sys.getStudents().size());

    }
    public void testSameStudent(){
        StudentSystem sys = new StudentSystem("students.csv");
        sys.readStudents("students.csv");
        assertSame(sys.getHighestGPAStudent().get(),sys.getStudentById("12").get());
    }
    public void testStudentWithId100(){
        StudentSystem sys = new StudentSystem("students.csv");
        sys.readStudents("students.csv");
        assertFalse ("Nostudent", sys.getStudentById("100").isPresent());
    }
}