package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindYourFlight{

    Map <String, Boolean> availableFlightsMap = new HashMap<>();

    FindYourFlight() {
        availableFlightsMap.put("New York", true);
        availableFlightsMap.put("Dubai", false);
        availableFlightsMap.put("Malaga", true);
    }

    boolean findFlight(Flight flight) throws RouteNotFoundException { // Flight (Warszwa -> New York)
        String arrivalAirport = flight.getArrivalAirport(); // Dubai

        if (availableFlightsMap.containsKey(arrivalAirport)){ // Dubai
            return availableFlightsMap.get(arrivalAirport); // false
        } else {
            throw new RouteNotFoundException ("This arrival airport is not available.");
        }

    }

}
