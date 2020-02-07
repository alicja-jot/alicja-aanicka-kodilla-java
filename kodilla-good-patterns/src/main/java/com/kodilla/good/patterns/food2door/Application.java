package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.dto.RequestDto;
import com.kodilla.good.patterns.food2door.dto.ResponseDto;
import com.kodilla.good.patterns.food2door.shop.ExtraFoodShop;
import com.kodilla.good.patterns.food2door.shop.GlutenFreeShop;
import com.kodilla.good.patterns.food2door.shop.HealthyShop;
import com.kodilla.good.patterns.food2door.shop.Shop;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        RequestRetriver requestRetriver = new RequestRetriver();

        Map<String, Shop> shops = new HashMap<>();
        shops.put("ExtraFoodShop", new ExtraFoodShop());
        shops.put("GlutenFreeShop", new GlutenFreeShop());
        shops.put("HealthyShop", new HealthyShop());

        OrderProcessor orderProcessor = new OrderProcessor(shops);

        RequestDto request = requestRetriver.retrieve();
        ResponseDto responseDto = orderProcessor.process(request);
        System.out.println("Response: obsłużone przez " + responseDto.getSupplier().getName());
    }
}
