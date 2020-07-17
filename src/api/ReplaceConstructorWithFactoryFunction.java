package api;

public class ReplaceConstructorWithFactoryFunction {
    void getEmployee() {
        Employee employee = new Employee("name", "E");
    }

    void getEmployeeRefactor() {
        Employee employee = createEmployee("name");

    }

    private Employee createEmployee(String name) {
        return new Employee(name, "E");
    }
}


class Employee {
    String name;
    String type;

    public Employee(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}