package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew(){
        // Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("z sezamem")
                .burgers(2)
                .sauce("barbecue")
                .ingredient("ser")
                .ingredient("pieczarki")
                .build();
        System.out.println(bigmac);
        // When
        int howManyIngredients = bigmac.getIngredients().size();
        // Then
        Assert.assertEquals(2, howManyIngredients);
    }

    @Test
    public void testBigmacGetSauce(){
        // Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("zwykła")
                .burgers(1)
                .sauce("tysiąc wysp")
                .build();
        System.out.println(bigmac);
        // When
        String sauce = bigmac.getSauce();
        // Then
        Assert.assertEquals("tysiąc wysp", sauce);
    }


}
