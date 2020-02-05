package com.kodilla.good.patterns.challenges;

public interface Repository {
    void createOrder(User user, Product product, int amount);
}
