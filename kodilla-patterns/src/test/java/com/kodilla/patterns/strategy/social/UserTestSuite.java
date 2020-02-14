package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        // Given
        User keise = new Millenials("Keise");
        User john = new YGeneration("John");
        User brian = new ZGeneration("Brian");

        // When
        String keiseShare = keise.sharePost();
        System.out.println("Keise say: " + keiseShare);

        String johnShare = john.sharePost();
        System.out.println("John say: " + johnShare);

        String brianShare = brian.sharePost();
        System.out.println("Brian say: " + brianShare);

        // Then
        Assert.assertEquals("Używam Facebooka", keiseShare);
        Assert.assertEquals("Używam Snapchata", johnShare);
        Assert.assertEquals("Używam Twittera", brianShare);

    }

    @Test
    public void testIndividualSharingStrategy() {
        // Given
        User keise = new Millenials("Keise");

        // When
        String keiseShare = keise.sharePost();
        System.out.println("Keise say: " + keiseShare);

        keise.setSocialPublisher(new SnapchatPublisher());
        keiseShare = keise.sharePost();
        System.out.println("Keise now say: " + keiseShare);

        // Then
        Assert.assertEquals("Używam Snapchata", keiseShare);

    }
}
