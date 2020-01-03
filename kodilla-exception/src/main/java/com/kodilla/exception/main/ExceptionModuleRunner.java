package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

import java.io.File;
import java.io.IOException;

public class ExceptionModuleRunner {
    public static void main (String [] args){

        FileReaderWithoutHandling fileReaderWithoutHandling = new FileReaderWithoutHandling();
        try {
            fileReaderWithoutHandling.readFile();
        } catch (IOException e) {
        }

        FileReader fileReader = new FileReader();
        try{
            fileReader.readFile();
        } catch (FileReaderException e){
            System.out.println("Problem while reading a file!");
        }


    }
}
