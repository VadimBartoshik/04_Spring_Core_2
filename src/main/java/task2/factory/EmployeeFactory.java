package task2.factory;

import task2.classes.Employee;

public class EmployeeFactory {
    private static Employee employee= new Employee("FactoryBean", 100);

    public static Employee createInstance(){
        return employee;
    }
}
