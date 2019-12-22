package com.kodilla.stream.sand;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        // Given
        List<Country> countries = new LinkedList<>();
        countries.add(new Country("Poland", new BigDecimal(38_000_000)));
        countries.add(new Country("Germany", new BigDecimal(80_000_000)));
        countries.add(new Country("France", new BigDecimal(60_000_000)));

        List<Continent> continents = new LinkedList<>();
        continents.add(new Continent(countries));

        // When
        World world = new World(continents);

        // Then
        assertEquals(new BigDecimal(178_000_000), world.getPeopleQuantity());
    }
}
