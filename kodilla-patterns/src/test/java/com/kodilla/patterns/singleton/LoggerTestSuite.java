package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class LoggerTestSuite {

    @BeforeClass
    public static void log(){
        Logger.getInstance().log("Hello everyone!");
    }

    @Test
    public void testGetLastLog(){
        //GIVEN
        Logger loggerInstance = Logger.getInstance();
        //WHEN
        String lastLog = loggerInstance.getLastLog();
        //THEN
        Assert.assertEquals("Hello everyone!", lastLog);

    }

}
