package com.kodilla.good.patterns.challenges;

import com.sun.org.apache.xpath.internal.operations.Or;

public class ProductOrderService implements Service {

    @Override
    public boolean order(OrderRequest orderRequest) {
        System.out.println("Przyjąłem zamówienie. Produkt: " + orderRequest.getProduct().getName() + ", ilość: " + orderRequest.getAmount());
        return true;
    }
}

