package com.kodilla.good.patterns.flys.service;

import com.kodilla.good.patterns.flys.dto.RequestDto;

public class Retriver {

    public RequestDto retrive (){
        String start = "Kraków";
        String destination = "Gdańsk";
        return new RequestDto(start, destination);
    }
}
