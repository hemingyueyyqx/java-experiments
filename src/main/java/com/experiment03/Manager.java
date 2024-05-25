package com.experiment03;

public class Manager extends Employee {
    private String name;
    private int grade;
    private double salary;
    public Manager(int salary, int grade) {
        this.salary = salary;
        this.grade = grade;
    }
    @Override
    public void updateName(String name) {
        this.name = name;
    }
    @Override
    public double calculateSalary(double salary) {

        return salary * this.grade * 0.8;
    }
    public double getSalary() {
        return salary;
    }
}
