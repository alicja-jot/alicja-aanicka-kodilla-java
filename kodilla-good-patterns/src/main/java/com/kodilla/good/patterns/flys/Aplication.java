package com.kodilla.good.patterns.flys;

import com.kodilla.good.patterns.flys.domain.City;
import com.kodilla.good.patterns.flys.domain.Flight;
import com.kodilla.good.patterns.flys.dto.RequestDto;
import com.kodilla.good.patterns.flys.dto.ResponseDto;
import com.kodilla.good.patterns.flys.service.DirectFlightFinder;
import com.kodilla.good.patterns.flys.service.FlightService;
import com.kodilla.good.patterns.flys.service.IndirectFlightFinder;
import com.kodilla.good.patterns.flys.service.Retriver;

import java.util.ArrayList;
import java.util.List;

public class Aplication {
    public static void main(String[] args) {
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

        IndirectFlightFinder indirectFlightFinder = new IndirectFlightFinder(flightsList);
        DirectFlightFinder directFlightFinder = new DirectFlightFinder(flightsList);

        FlightService flightService = new FlightService(indirectFlightFinder, directFlightFinder);
        Retriver retriver = new Retriver();

        RequestDto request = retriver.retrive();
        ResponseDto foundFlight = flightService.findFlight(request);
        System.out.println(foundFlight);


    }
}
