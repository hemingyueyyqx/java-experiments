package com.experiment02;

public class Test {
    //测试类
    static User user1 = new User("He", 10, "Harbin");
    static Product product1 = new Product("book", 30);
    static Product product2 = new Product("pen", 10);
    static Item item1 = new Item(product1, 2);
    static Item item2 = new Item(product2, 1);
    static Item[] items = new Item[] {item1, item2};

    public static void main(String[] args) {
        Order order1 = OrderService.addOrder(user1, items);
        if(order1 != null) {
            System.out.println("商品总额："+order1.getExpense() + " 用户余额：" + user1.getBalance() + " 快递地址：" + user1.getAddress());
        } else {
            System.out.println("用户余额不足！");
        }
    }

}
