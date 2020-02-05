package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequest {

    private User user;
    private LocalDate dateOfOrder;
    private int amount;
    private Product product;

    public OrderRequest(User user, LocalDate dateOfOrder, int amount, Product product) {
        this.user = user;
        this.dateOfOrder = dateOfOrder;
        this.amount = amount;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public int getAmount() {
        return amount;
    }

    public Product getProduct() {
        return product;
    }
}
