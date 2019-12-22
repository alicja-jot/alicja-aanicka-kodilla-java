package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public final class World {
private final List<Continent> listOfContinents;

    public World(final List<Continent> listOfContinents) {
        this.listOfContinents = listOfContinents;
    }

    public List<Continent> getListOfContinents() {
        return listOfContinents;
    }

    public BigDecimal getPeopleQuantity(){
        return listOfContinents.stream() // Continent
                .flatMap(continent -> continent.getListOfCountries().stream()) // Country
                .map(country -> country.getPeopleQuantity()) // Big Decimal
                .reduce(BigDecimal.ZERO, (peopleQuantity, accumulator) -> accumulator.add(peopleQuantity));
    }
}


