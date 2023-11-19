import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeManagmentSystem {
    List<Employee> data = new ArrayList<>();

    public EmployeeManagmentSystem(List<Employee> data) {
        this.data = data;
    }
    public List<Employee> filterEmployeesBySalary(List<Employee> employees, double minsalary) {
        return employees.stream().filter
                (employee -> employee.salary() >= minsalary)
                .collect(Collectors.toList());
    }
    public double calculateTotalSalary(List<Employee> employees) {
        double totalsalary = 0.0;
        for (int i = 0 ; i < employees.size(); i++ ) {
            totalsalary+= employees.get(i).salary();
        }
        return totalsalary;
    }
    public void printEmployeeData(List<Employee> employees) {
        employees.forEach(employee -> System.out.println(employee.toString()));
    }
}
