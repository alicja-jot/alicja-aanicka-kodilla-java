package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify (String textToDecorate, PoemDecorator poemDecorator){
        String effect = poemDecorator.decorate(textToDecorate);
        System.out.println("Text after decoration: " + effect);
    }

}
