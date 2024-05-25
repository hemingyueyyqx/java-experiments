package com.experiment02;

public class Order {
    //订单实体类
    private User user;
    private Item[] items;
    private int expense;
    public Order(User user, Item[] items, int expense) {
        this.user = user;
        this.items = items;
        this.expense = expense;
    }

    public User getUser() {
        return user;
    }

    public Item[] getItems() {
        return items;
    }

    public int getExpense() {
        return expense;
    }
}
