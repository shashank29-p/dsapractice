package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Average {

  public static void main(String[] args) {
    Employee employee=new Employee(1,"corona",25,20000);
    Employee employee1=new Employee(2,"fever",23,40000);
    Employee employee3=new Employee(3,"fever",26,30000);
    Employee employee4=new Employee(4,"fever",22,10000);

    List<Employee> employees=new ArrayList<>();
    employees.add(employee);
    employees.add(employee1);
    employees.add(employee3);
    employees.add(employee4);
    Double list=employees.stream().filter(e-> e.getName().equals("fever") && e.getAge()>20)
        .collect(Collectors.averagingDouble(Employee::getCharge));
    System.out.println(list);

  }
}
