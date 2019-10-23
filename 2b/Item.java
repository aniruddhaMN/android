package com.example.a2b;

public class Item {
    String name;
    double price;
    int qty;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.qty = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
