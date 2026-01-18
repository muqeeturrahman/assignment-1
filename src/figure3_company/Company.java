package figure3_company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees = new ArrayList<>();

    public void createSoftware() {
        for (Employee emp : employees) {
            emp.work();
        }
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }
}
