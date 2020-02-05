package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new ProductOrderService(), new SmsSender(), new ProductOrderRepository());
        OrderDto orderDto = orderProcessor.process(orderRequest);

        System.out.println(orderDto.getUser().getName() + " " + orderDto.isOrdered());
    }
}
