package com.experiment02;

public class User {
    //用户实体类
    private String name;
    private int balance;
    private String address;
    public User(String name, int balance, String address) {
        this.name = name;
        this.balance = balance;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public String getAddress() {
        return address;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
