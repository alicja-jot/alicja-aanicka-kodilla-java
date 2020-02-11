package com.kodilla.good.patterns.flys.service;

import com.kodilla.good.patterns.flys.domain.Flight;
import com.kodilla.good.patterns.flys.dto.RequestDto;
import com.kodilla.good.patterns.flys.dto.ResponseDto;

import java.util.List;

public class FlightService {

    private IndirectFlightFinder indirectFlightFinder;
    private DirectFlightFinder directFlightFinder;

    public FlightService(IndirectFlightFinder indirectFlightFinder, DirectFlightFinder directFlightFinder) {
        this.indirectFlightFinder = indirectFlightFinder;
        this.directFlightFinder = directFlightFinder;
    }

    public ResponseDto findFlight(RequestDto request) {
        String start = request.getStartCityName();
        String destination = request.getDestinationCityName();

        List<Flight> directFlights = directFlightFinder.findFlightDirectly(start, destination);
        if (directFlights.size() == 0) {
            List<Flight> indirectFlights = indirectFlightFinder.findFlightsIndirectly(start, destination);
            return new ResponseDto(indirectFlights);
        }
        return new ResponseDto(directFlights);
    }
}
