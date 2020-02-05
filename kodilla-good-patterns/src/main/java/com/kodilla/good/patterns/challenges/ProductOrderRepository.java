package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository implements Repository {

    @Override
    public void createOrder(User user, Product product, int amount){
        System.out.println("Zapisałem w bazie danych.");
    }

}
