package com.kodilla.good.patterns.food2door.dto;

import com.kodilla.good.patterns.food2door.Product;

public class RequestDto {
    private String shopName;
    private Product product;
    private int amount;

    public RequestDto(String shopName, Product product, int amount) {
        this.shopName = shopName;
        this.product = product;
        this.amount = amount;
    }

    public String getShopName() {
        return shopName;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }
}

