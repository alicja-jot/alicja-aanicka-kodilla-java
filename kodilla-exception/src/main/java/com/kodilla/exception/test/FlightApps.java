package com.kodilla.exception.test;

public class FlightApps {
    public static void main(String[] args) {

        FindYourFlight findYourFlight = new FindYourFlight();

        try {
            boolean isFlight = findYourFlight.findFlight(new Flight("New Delhi", "msmdsn"));
            System.out.println("Flight is available: " + isFlight);
        } catch (RouteNotFoundException e) {
            System.out.println("You can't fly there! Cause: " + e.getMessage());
        }


    }
}
