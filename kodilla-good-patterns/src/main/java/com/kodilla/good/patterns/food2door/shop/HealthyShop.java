package com.kodilla.good.patterns.food2door.shop;

import com.kodilla.good.patterns.food2door.Supplier;
import com.kodilla.good.patterns.food2door.dto.RequestDto;
import com.kodilla.good.patterns.food2door.dto.ResponseDto;
import com.kodilla.good.patterns.food2door.shop.Shop;

public class HealthyShop implements Shop {


    @Override
    public ResponseDto orderInShop(RequestDto requestDto) {
        System.out.println("Obsluzone przez HealthyShop. Produkt: "+ requestDto.getProduct().getName() + " ilosc: " + requestDto.getAmount());
        return new ResponseDto(true, new Supplier("HealthyShop"));
    }
}
