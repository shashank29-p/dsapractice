package org.example.dsa.streams;


public class Employee {

  private final String nameV="DAFFY";

  private String id;

  private String name;

  private int salary;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  private String department;

  public Employee(String id, String name, int salary, String department) {
    this.id = id;
    this.name = name;
    this.salary = salary;
    this.department = department;
  }

  public Employee(){}

  @Override
  public String toString() {
    return "Employee{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", salary=" + salary +
        ", department='" + department + '\'' +
        '}';
  }
}
