package com.kodilla.patterns3.facade;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class Authenticator {

    public boolean isAuthenticated(Long userId) {
        Random random = new Random();
        return random.nextBoolean();
    }

}
