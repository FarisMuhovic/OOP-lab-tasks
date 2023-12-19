import junit.framework.TestCase;
import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.*;

public class StudentTest  {
    @Test
    public void isGpaInRange() {
        Student stu = new Student("2","fare","ibu","10.2");
        assertTrue("YOU FUCKING FIALURE", Double.parseDouble(stu.getGpa()) > 0 && Double.parseDouble(stu.getGpa()) <= 10);
    }
    @Test
    public void testGetUniversity() {
        Student stu2 = new Student("4","f","sgm","6.9");
        assertTrue("GTFO", !stu2.getUniversity().equals("ius"));
    }
    @Test
    public void testGetName() {
        Student sigma = new Student("23", "sigdma","aa","2,4");
        assertEquals("Ur not a sigma!", "sigma", sigma.getName());
    }
}