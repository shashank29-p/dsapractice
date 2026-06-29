package org.example.dsa.streams;

import java.awt.print.Pageable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class ExperimentEmployee {

  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
    Employee employee = new Employee("1", "dinesh", 50000, "IT");
    Employee employee1 = new Employee("2", "Ramesh", 60000, "DEV");
    Employee employee2 = new Employee("3", "Ganesh", 70000, "SAP");
    Employee employee3 = new Employee("4", "Mahesh", 80000, "IT");
    Employee employee4 = new Employee("5", "Vignesh", 90000, "SALES");

    List<Employee> employeeList = new ArrayList<>(
        List.of(employee, employee1, employee2, employee3, employee4));
    Optional<Integer> salary = employeeList.stream().map(Employee::getSalary)
        .sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
    //map.sorted(comparator.reverseOrder()).distinct.skip(1).findFirst()
    System.out.println("Second Highest salary: " + salary);

    Map<String, List<String>> empList = employeeList.stream()
        .collect(Collectors.groupingBy(Employee::getDepartment,
            Collectors.mapping(Employee::getName, Collectors.toList())));
    //collect(Collectors.groupingBy(Employee::getDepartment, collectors.mapping(Employee::getName,
    // Collectors.toList()));
    System.out.println("Employees per department:" + empList);

    Collection<Optional<Employee>> values = employeeList.stream()
        .collect(Collectors.groupingBy(Employee::getDepartment,
            Collectors.maxBy(Comparator.comparing(Employee::getSalary)))).values();
    values.forEach(System.out::println);

    employeeList.stream().filter(e -> e.getSalary() > 70000).forEach(System.out::println);

    System.out.println("------------------");

    System.out.println("Avg salary per department");

    Map<String, Double> avgSal = employeeList.stream()
        .collect(Collectors.groupingBy(Employee::getDepartment
            , Collectors.averagingDouble(Employee::getSalary)));
    System.out.println(avgSal);

    System.out.println("Second Highest Salary per Department");
    //collect(Collectors.groupingBy(dept, collectors.collectingAndThen( collectors.toList
    //list-> list.stream.map.sorted.distinc.skip.findfirst().flatmap(sal->
    //list.stream.filter(e->e.getsalary=sal).findFirst()
    Map<String, Employee> secondHighestPerDept = employeeList.stream()
        .collect(Collectors.groupingBy(Employee::getDepartment
            , Collectors.collectingAndThen(Collectors.toList(), list -> list.stream()
                .map(Employee::getSalary).sorted(Comparator.reverseOrder()).distinct().skip(1)
                .findFirst().flatMap(sal->
                    list.stream().filter(e-> e.getSalary()==sal).findFirst()).orElse(null))));

    System.out.println(secondHighestPerDept);

    System.out.println("Highest salary 3 person in a department");
    Map<String,List<String>> highRate= employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
        Collectors.collectingAndThen(Collectors.toList(),l->l.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(3).map(Employee::getName).toList())));

    System.out.println(highRate);

    Map<String,Long> numOfEmp= employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
        Collectors.counting()));
    System.out.println("No of employees in dept"+ numOfEmp);

    Map<String,Double> salaryTotalPerDept= employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
        Collectors.summingDouble(Employee::getSalary)));
    System.out.println("Total salary per dept"+ salaryTotalPerDept);

    System.out.println("________________");

    String dept= employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()))
        .entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
    //entryset.max(Map.Entry.ComparingByValue().map(Map.Entry::getKey)
    System.out.println("Dept with most no of employees"+dept);

    System.out.println("________________");

    Map<String,Long> result=employeeList.stream().filter(e->e.getSalary()>100000).collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

    System.out.println("Employee with more than 1lakh salary"+ result);

    System.out.println("________________");

    List<String> empResult=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)))
        .entrySet().stream().filter(e->e.getValue()>80000)
        .map(Map.Entry::getKey).toList();

    System.out.println("Departments Where Average Salary > 80K"+ empResult);

    System.out.println("________________");
    Set<String> duplicates=employeeList.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()))
            .entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet());
    System.out.println("Find Duplicate Employee Names"+ duplicates);

    System.out.println("________________");

    List<Employee> uniqueEmployees= new ArrayList<>(employeeList.stream().collect(Collectors.toMap(Employee::getSalary,e->e,(e1,e2)->e1)).values());
    System.out.println("Remove Duplicate Employees Based on Salary"+ uniqueEmployees);
  }

}
