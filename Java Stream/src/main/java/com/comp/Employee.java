package com.comp;

public class Employee implements Comparable<Employee> {
    public int id;
    public String name;
    public int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int compareTo(Employee emp) {
        if(id == emp.getId()) {
            return 0;
        }
        else if(id > emp.getId()) {
            return 1;
        }
        else {
            return -1;
        }


    }
}
