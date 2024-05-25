package com.experiment03;

public class Seller extends Employee {
    private String name;
    private double salary;
    private double sales;
    private double commission;
    public Seller(double salary, double sales, double commission) {
        this.salary = salary;
        this.sales = sales;
        this.commission = commission;
    }
    @Override
    public void updateName(String name) {
        this.name = name;
    }
    @Override
    public double calculateSalary(double salary) {
        return salary + this.sales * this.commission;
    }
    public double getSalary() {
        return salary;
    }
}
