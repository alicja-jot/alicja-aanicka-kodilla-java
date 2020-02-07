package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.dto.RequestDto;
import com.kodilla.good.patterns.food2door.dto.ResponseDto;
import com.kodilla.good.patterns.food2door.shop.ExtraFoodShop;
import com.kodilla.good.patterns.food2door.shop.GlutenFreeShop;
import com.kodilla.good.patterns.food2door.shop.HealthyShop;
import com.kodilla.good.patterns.food2door.shop.Shop;

import java.util.Map;

public class OrderProcessor {
    private Map<String, Shop> shops;

    public OrderProcessor(Map<String, Shop> shops) {
        this.shops = shops;
    }

    public ResponseDto process(RequestDto requestDto) {
        String shopName = requestDto.getShopName();
        Shop shop = shops.get(shopName);
        ResponseDto response = shop.orderInShop(requestDto);
        return response;
    }
}
