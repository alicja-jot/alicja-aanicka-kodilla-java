package com.kodilla.good.patterns.flys.service;

import com.kodilla.good.patterns.flys.domain.Flight;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class IndirectFlightFinder {

    private List<Flight> allFlights;

    public IndirectFlightFinder(List<Flight> allFlights) {
        this.allFlights = allFlights;
    }

    public List<Flight> findFlightsIndirectly(String start, String destination) {
        List<String> middleCitiesNames = allFlights
                .stream()
                .filter(flight -> flight.getStartCity().getCityName().equals(start))
                .map(flight -> flight.getDestinationCity().getCityName())
                .collect(Collectors.toList());

        List<Flight> destinationFlights = allFlights.stream()
                .filter(flight -> middleCitiesNames.contains(flight.getStartCity().getCityName()))
                .filter(flight -> flight.getDestinationCity().getCityName().equals(destination))
                .collect(Collectors.toList());

        if (destinationFlights.size() > 0) {
            Flight secondFlight = destinationFlights.get(0);
            Flight firstFlight = allFlights.stream()
                    .filter(flight -> flight.getStartCity().getCityName().equals(start))
                    .filter(flight -> flight.getDestinationCity().equals(secondFlight.getStartCity()))
                    .collect(Collectors.toList())
                    .get(0);

            List<Flight> flights = new LinkedList<>();
            flights.add(firstFlight);
            flights.add(secondFlight);

            return flights;
        }

        return new LinkedList<>();
    }


}
