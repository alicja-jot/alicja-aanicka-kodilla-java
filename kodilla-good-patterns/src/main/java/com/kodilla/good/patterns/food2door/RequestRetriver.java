package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.dto.RequestDto;

public class RequestRetriver {

    public RequestDto retrieve() {
        String shopName = "ExtraFoodShop";
        Product product = new Product("jabłka", 2);
        int amount = 20;
        return new RequestDto(shopName, product, amount);
    }
}
