package com.experiment02;

public class Item {
    //购买项实体类
    private Product product;
    private int count;
    public Item(Product product, int count) {
        this.product = product;
        this.count = count;
    }
    public Product getProduct() {
        return product;
    }

    public int getCount() {
        return count;
    }
}
