package com.kodilla.patterns3.forum;

public class ForumUser implements Observer {

    private final String username;
    private int updateCount;

    public ForumUser(String username) {
        this.username = username;
    }

    @Override
    public void update(ForumTopic forumTopic) {
        updateCount ++;
        System.out.println(username + ": New messages in topic " + forumTopic.getName() + "\n" + " (total: " + forumTopic.getMessages().size() + " messages)");
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }

}
