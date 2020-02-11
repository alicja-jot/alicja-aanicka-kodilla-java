package com.kodilla.good.patterns.flys.dto;

public class RequestDto {
    private String startCityName;
    private String destinationCityName;

    public RequestDto(String startCityName, String destinationCityName) {
        this.startCityName = startCityName;
        this.destinationCityName = destinationCityName;
    }

    public String getStartCityName() {
        return startCityName;
    }

    public String getDestinationCityName() {
        return destinationCityName;
    }
}
