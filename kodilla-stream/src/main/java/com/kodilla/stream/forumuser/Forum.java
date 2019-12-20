package com.kodilla.stream.forumuser;
import com.kodilla.stream.book.Book;

import java.util.ArrayList;
import java.util.List;

public class Forum {

   private final List<ForumUser> listOfUsers = new ArrayList<>();

   public Forum (){
       listOfUsers.add(new ForumUser(01,"neo",'M', 1980, 10, 20, 100));
       listOfUsers.add(new ForumUser(02,"linda",'F', 2008, 1, 2, 0));
       listOfUsers.add(new ForumUser(03,"ervin",'M', 1979, 3, 4, 34));
       listOfUsers.add(new ForumUser(04,"liam",'M', 2005, 12, 30, 7));
       listOfUsers.add(new ForumUser(05,"keira",'F', 1996, 7, 25, 12));

   }

    public List <ForumUser> getUserList(){
        return new ArrayList<>(listOfUsers);
    }

}
