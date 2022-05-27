package app;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    public static List<Employee> listEmployees() {
        List<Employee> list = new ArrayList<Employee>();

        Employee e1 = new Employee("E01", "Ivan", 200.0, 1, null);
        Employee e2 = new Employee("E02", "Petr", 100.2, 2, null);
        Employee e3 = new Employee("E03", "Abram", 150.0, 2, null);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        return list;
    }

}