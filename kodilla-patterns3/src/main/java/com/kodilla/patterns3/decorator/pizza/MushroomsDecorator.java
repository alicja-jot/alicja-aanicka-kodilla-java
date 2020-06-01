package com.kodilla.patterns3.decorator.pizza;

import java.math.BigDecimal;

public class MushroomsDecorator extends AbstractPizzaDecorator {
    protected MushroomsDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(7));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " with mushrooms";
    }
}
