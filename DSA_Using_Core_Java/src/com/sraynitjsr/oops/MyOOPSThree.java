package com.sraynitjsr.oops;

abstract class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getDetails();

    public void displayInfo() {
        System.out.println("Employee Info: " + name + ", Age: " + age);
    }

    public static void showGreeting() {
        System.out.println("Welcome to the Employee System");
    }
}

class EmployeeImpl extends Employee {
    private String department;

    public EmployeeImpl(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public String getDetails() {
        return "Department: " + department;
    }
}

public class MyOOPSThree {
    public static void start() {
        Employee.showGreeting();
        EmployeeImpl emp = new EmployeeImpl("CR7", 32, "Football");
        emp.displayInfo();
        System.out.println(emp.getDetails());
    }
}
