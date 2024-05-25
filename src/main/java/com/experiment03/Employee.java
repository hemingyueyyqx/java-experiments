package com.experiment03;

public class Employee implements Workable{
    private String name;
    private double salary;

    @Override
    public void updateName(String name) {
        this.name = name;
    }

    @Override
    public double calculateSalary(double salary) {
        return this.salary;
    }
}
