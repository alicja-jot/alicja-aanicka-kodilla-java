package com.kodilla.good.patterns.challenges;

public class Order {
    private Product product;
    private int amount;
    private User user;

    public Order(Product product, int amount, User user) {
        this.product = product;
        this.amount = amount;
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public User getUser() {
        return user;
    }
}
