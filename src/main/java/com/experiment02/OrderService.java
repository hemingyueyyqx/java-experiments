package com.experiment02;

public class OrderService {
    //订单业务逻辑处理类
    public static Order addOrder(User user, Item[] items) {
        int expense = 0;
        for(Item i: items) {
           expense += i.getCount() * i.getProduct().getPrice();
        }
        //System.out.println(expense);
        if(user.getBalance()>= expense) {
            Order order1 = new Order(user, items, expense);
            int balance1 = user.getBalance() - expense;
            //System.out.println(balance1);
            user.setBalance(balance1);
            return order1;
            //System.out.println( user.getBalance() );
            //System.out.println(user.getAddress());
        } else {
            return null;

        }

    }
}
