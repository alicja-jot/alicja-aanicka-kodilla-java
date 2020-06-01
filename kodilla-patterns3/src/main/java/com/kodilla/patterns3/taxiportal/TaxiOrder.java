package com.kodilla.patterns3.taxiportal;

import java.math.BigDecimal;

public interface TaxiOrder {
    BigDecimal getCost();

    String getDescription();

}
