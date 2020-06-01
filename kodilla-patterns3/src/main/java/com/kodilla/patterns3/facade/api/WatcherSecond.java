package com.kodilla.patterns3.facade.api;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WatcherSecond {

    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherSecond.class);

    @After("execution(* com.kodilla.patterns3.facade.api.OrderFacade.processOrder(..)) && args(OrderDto, Long))")
    public void log(){
        LOGGER.info("Logging after.");
    }

}
