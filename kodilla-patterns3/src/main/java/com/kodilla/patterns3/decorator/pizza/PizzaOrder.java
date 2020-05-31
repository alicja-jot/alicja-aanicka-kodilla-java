package com.kodilla.patterns3.decorator.pizza;

import java.math.BigDecimal;

public interface PizzaOrder {
    BigDecimal getCost();
    String getDescription();
}
