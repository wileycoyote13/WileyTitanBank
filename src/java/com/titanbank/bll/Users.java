package com.titanbank.bll;

import java.util.ArrayList;

public class Users implements TBUserRepository
{
    private ArrayList<User> users;

    public Users() 
    {
        users = new ArrayList<User>();
        fillUserDataBase();
    }
    
    public void fillUserDataBase()
    {
        users.add(new User("twiley", "goodstuff", new Customer(1411, "Tim", "Wiley")));
        users.add(new User("fred", "badstuff", new Customer(1511, "Fred", "Jones")));
    }

    @Override
    public User findByUserName(String userName) 
    {
        User user = null;
        
        for(User u : users)
        {
            if(u.getUserName().equals(userName))
            {
                user = u;
            }
        }
        
        return user;
    }
}
