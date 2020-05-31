package com.kodilla.patterns3.decorator.pizza;

import java.math.BigDecimal;

public class SalamiDecorator extends AbstractPizzaDecorator {
    protected SalamiDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " with salami";
    }

}
