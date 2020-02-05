package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){
        User user = new User("Jan", "Kowalski");
        LocalDate dateOfOrder = LocalDate.of(2020, 02, 05);
        Product product = new Product("slippers", 20);
        int amount = 4;
        return new OrderRequest (user, dateOfOrder, amount, product);
    }
}
