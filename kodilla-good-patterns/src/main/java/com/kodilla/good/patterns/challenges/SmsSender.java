package com.kodilla.good.patterns.challenges;

public class SmsSender implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Sms is sending.");
    }
}
