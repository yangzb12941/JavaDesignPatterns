package VisitorPattern;

import java.util.HashMap;

public class ObjectStructure {
    private HashMap<String, Employee> employees;

    public ObjectStructure() {
        employees = new HashMap();
    }

    public void Attach(Employee employee) {
        employees.put(employee.getName(), employee);
    }

    public void Detach(Employee employee) {
        employees.remove(employee);
    }

    public Employee getEmployee(String name) {
        return employees.get(name);
    }

    public void Accept(Visitor visitor) {
        for (Employee e : employees.values()) {
            e.Accept(visitor);
        }
    }
}
