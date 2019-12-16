package com.kodilla.testing.forum.statistics;
import java.util.List;
public class CalculateStatistics {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageNumberOfPosts;
    private double averageNumberOfComments;
    private double averageNumbersOfCommentsOnPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberOfPosts() {
        return averageNumberOfPosts;
    }

    public double getAverageNumberOfComments() {
        return averageNumberOfComments;
    }

    public double getAverageNumbersOfCommentsOnPost() {
        return averageNumbersOfCommentsOnPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        averageNumberOfPosts = (double)  statistics.postsCount() / statistics.usersNames().size();
        averageNumberOfComments = (double) statistics.commentsCount() / statistics.usersNames().size();
        averageNumbersOfCommentsOnPost = (double) statistics.commentsCount() / statistics.postsCount();
    }

    public void showStatistics(){
        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number of posts: " + numberOfPosts);
        System.out.println("Number of comments: "+ numberOfComments);
        System.out.println("Average number of post on one user:" + averageNumberOfPosts);
        System.out.println("Averaage number of comments on one user: " + averageNumberOfComments);
        System.out.println("Average numer of cooments on one post: " + averageNumbersOfCommentsOnPost);
    }


}
