package com.kodilla.good.patterns.flys;

import com.kodilla.good.patterns.flys.domain.City;
import com.kodilla.good.patterns.flys.domain.Flight;
import com.kodilla.good.patterns.flys.dto.RequestDto;
import com.kodilla.good.patterns.flys.dto.ResponseDto;
import com.kodilla.good.patterns.flys.service.DirectFlightFinder;
import com.kodilla.good.patterns.flys.service.FlightService;
import com.kodilla.good.patterns.flys.service.IndirectFlightFinder;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FlightServiceTest {

    private List<Flight> flights = prepareFlights();
    private DirectFlightFinder directFlightFinder = new DirectFlightFinder(flights);
    private IndirectFlightFinder indirectFlightFinder = new IndirectFlightFinder(flights);
    private FlightService flightService = new FlightService(indirectFlightFinder, directFlightFinder);

    @Test
    public void findFlightFromKrakowToWroclaw() {
        // given
        RequestDto request = new RequestDto("Kraków", "Wrocław");

        // when
        ResponseDto foundFlights = flightService.findFlight(request);

        // then
        assertEquals(foundFlights.getFlights().size(), 1);
    }

    @Test
    public void findFlightFromGdanskToKatowice() {
        // given
        RequestDto request = new RequestDto("Gdańsk", "Katowice");

        // when
        ResponseDto foundFlights = flightService.findFlight(request);

        // then
        assertEquals(foundFlights.getFlights().size(), 1);
    }

    @Test
    public void findFlightFromKrakowToWarszawa() {
        // given
        RequestDto request = new RequestDto("Kraków", "Warszawa");

        // when
        ResponseDto foundFlights = flightService.findFlight(request);

        // then
        assertEquals(foundFlights.getFlights().size(), 2);
    }

    @Test
    public void findFlightFromLublinToKrakow() {
        // given
        RequestDto request = new RequestDto("Lublin", "Kraków");

        // when
        ResponseDto foundFlights = flightService.findFlight(request);

        // then
        assertEquals(foundFlights.getFlights().size(), 2);
    }

    private List<Flight> prepareFlights() {
        List<Flight> flightsList = new ArrayList<>();
        flightsList.add(new Flight(new City("Kraków"), new City("Wrocław")));
        flightsList.add(new Flight(new City("Warszawa"), new City("Wrocław")));
        flightsList.add(new Flight(new City("Gdańsk"), new City("Katowice")));
        flightsList.add(new Flight(new City("Katowice"), new City("Radom")));
        flightsList.add(new Flight(new City("Kraków"), new City("Gdańsk")));
        flightsList.add(new Flight(new City("Warszawa"), new City("Gdańsk")));
        flightsList.add(new Flight(new City("Wrocław"), new City("Warszawa")));
        flightsList.add(new Flight(new City("Wrocław"), new City("Kraków")));
        flightsList.add(new Flight(new City("Lublin"), new City("Wrocław")));
        flightsList.add(new Flight(new City("Wrocław"), new City("Lublin")));
        return flightsList;
    }
}
