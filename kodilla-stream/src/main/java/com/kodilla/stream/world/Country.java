package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String countryName;
    private final BigDecimal quantityOfPeople;

public Country (final String countryName, final BigDecimal quantityOfPeople){
    this.countryName = countryName;
    this.quantityOfPeople = quantityOfPeople;
}

    public BigDecimal getPeopleQuantity (){
    return quantityOfPeople;
    }

    public String getCountryName() {
        return countryName;
    }


    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", quantityOfPeople=" + quantityOfPeople +
                '}';
    }
}
