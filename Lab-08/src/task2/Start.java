package task2;

import java.lang.reflect.*;
import java.util.*;

public class Start {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        List<Integer> grades = new ArrayList<>(Arrays.asList(90,80,70,100));

        GradeAnalyser analyser = new GradeAnalyser(grades);
        Field[] fields = analyser.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println("Field name: " + field.getName() + " Value: " + field.get(analyser));
        }

        Method[] methods = analyser.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("calculate") || method.getName().startsWith("print")) {
                System.out.println("Method name: " + method.getName() + " Result: " + method.invoke(analyser));
            }
        }

        Student faris = new Student("Faris", "2401", grades);

        Field[] field = faris.getClass().getDeclaredFields();
        Method[] method = faris.getClass().getDeclaredMethods();

        for (Field field1 : field) {
            field1.setAccessible(true);
            System.out.println(field1.getName() + " " + field1.get(faris));
        }
        for (Method method1 : method) {
            if (method1.getName().startsWith("printInfo")) {
                System.out.println("Method name: " + method1.getName() + " Result: " + method1.invoke(faris));
            }
        }
    }
}
