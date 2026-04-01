package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public void getEmployeeList(List<Employee> employeeList) {
       employeeList.stream()
                .filter(e->e.getId()>1).forEach(employee -> System.out.println(employee.getId()));
    }

    /**
     * This block of code filters employee based on the id
     * @param args
     */

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee(1, "Raaj");
        Employee employee1 = new Employee(2, "raani");
        employeeList.add(employee);
        employeeList.add(employee1);
        Main main=new Main();
        main.getEmployeeList(employeeList);
    }
}