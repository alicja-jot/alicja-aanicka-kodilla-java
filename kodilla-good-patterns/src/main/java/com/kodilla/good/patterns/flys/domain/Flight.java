package com.kodilla.good.patterns.flys.domain;

public class Flight {
    private City startCity;
    private City destinationCity;

    public Flight(City startCity, City destinationCity) {
        this.startCity = startCity;
        this.destinationCity = destinationCity;
    }

    public City getStartCity() {
        return startCity;
    }

    public City getDestinationCity() {
        return destinationCity;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "startCity=" + startCity +
                ", destinationCity=" + destinationCity +
                '}';
    }
}
