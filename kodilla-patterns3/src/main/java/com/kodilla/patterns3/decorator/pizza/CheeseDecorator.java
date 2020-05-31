package com.kodilla.patterns3.decorator.pizza;

import java.math.BigDecimal;

public class CheeseDecorator extends AbstractPizzaDecorator {

    protected CheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with three cheese";
    }
}
