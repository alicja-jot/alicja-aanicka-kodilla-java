package com.kodilla.good.patterns.flys.service;

import com.kodilla.good.patterns.flys.domain.Flight;
import com.kodilla.good.patterns.flys.dto.RequestDto;
import com.kodilla.good.patterns.flys.dto.ResponseDto;

import java.util.List;
import java.util.stream.Collectors;

public class DirectFlightFinder {

    private List<Flight> allFlights;

    public DirectFlightFinder(List<Flight> allFlights) {
        this.allFlights = allFlights;
    }

    public List<Flight> findFlightDirectly(String start, String destination) {
        List<Flight> foundFlights = allFlights.stream()
                .filter(flight -> flight.getStartCity().getCityName().equals(start))
                .filter(flight -> flight.getDestinationCity().getCityName().equals(destination))
                .collect(Collectors.toList());
        return foundFlights;
    }
}
