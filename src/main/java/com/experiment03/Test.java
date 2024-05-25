package com.experiment03;

public class Test {
    public static void main(String[] args) {
        Manager manager1 = new Manager(5000, 2);
        Seller seller1 = new Seller(3000, 20000, 0.15);
        System.out.println("Manage1的工资是：" + manager1.calculateSalary(manager1.getSalary()));
        System.out.println("Seller1的工资是：" + seller1.calculateSalary(seller1.getSalary()));
        double totalsalaries = SalarySerice.getTotalSalaries(manager1.calculateSalary(manager1.getSalary()), seller1.calculateSalary(seller1.getSalary()));
        System.out.println("员工总工资是：" + totalsalaries);
    }
}
