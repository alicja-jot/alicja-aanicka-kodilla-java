package com.kodilla.good.patterns.flys.dto;

import com.kodilla.good.patterns.flys.domain.Flight;

import java.util.List;

public class ResponseDto {
    private List<Flight> flights;

    public ResponseDto(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    @Override
    public String toString() {
        return "ResponseDto{" +
                "flights=" + flights +
                '}';
    }
}
