package task2.classes;

import java.util.List;
import java.util.Objects;

public class Position {
    private String positionName;
    private int salary;
    private int countPlace;
    private List<Employee> employeeList;

    public Position() {
    }

    public Position(String positionName, int salary, int countPlace, List<Employee> employeeList) {
        this.positionName = positionName;
        this.salary = salary;
        this.countPlace = countPlace;
        this.employeeList = employeeList;
    }

    public Position(String positionName, int salary, int countPlace) {
        this.positionName = positionName;
        this.salary = salary;
        this.countPlace = countPlace;
    }


    public void fireEmployee(Employee employee) {
        if (findEmployee(employee)) {
            employeeList.remove(employee);
        }
        else
            System.out.println("Уволить сотрудника не удалось");
    }

    public void hireEmployee(Employee employee) {
        if (checkFreePlace() && checkRepetitions(employee)) {
            employeeList.add(employee);
        }
        else
            System.out.println("Нанять сотрудника не удалось");
    }

    public void printEmployeeList() {
        for (Employee employee : employeeList) {
            System.out.println(employee.getName());
        }
    }

    public boolean findEmployee(Employee employee) {
        for (Employee emp : employeeList) {
            if (emp.equals(employee)) {
                return true;
            }
        }
        return false;
    }



    public boolean checkFreePlace() {
        if (employeeList.size() < countPlace) {
            return true;
        } else
            return false;
    }

    public boolean checkRepetitions(Employee employee) {
        for (Employee emp : employeeList) {
            if (emp.equals(employee)){
                return false;
            }
        }
        return true;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getCountPlace() {
        return countPlace;
    }

    public void setCountPlace(int countPlace) {
        this.countPlace = countPlace;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        employeeList = employeeList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return salary == position.salary &&
                countPlace == position.countPlace &&
                Objects.equals(positionName, position.positionName) &&
                Objects.equals(employeeList, position.employeeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(positionName, salary, countPlace, employeeList);
    }

    @Override
    public String toString() {
        return "Position{" +
                "positionName='" + positionName + '\'' +
                ", salary=" + salary +
                ", countPlace=" + countPlace +
                ", employeeList=" + employeeList +
                '}';
    }
}
