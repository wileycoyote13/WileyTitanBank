package com.titanbank.bll;

import java.util.ArrayList;

public class AuthenticationService 
{
    private final TBUserRepository userRepository;
    private ArrayList<User> loggedIn; 

    public AuthenticationService(TBUserRepository userRepository) 
    {
        this.userRepository = userRepository;
        loggedIn = new ArrayList<>(); 
    }
    
    public Customer logIn(String userName, String userPassword) throws UserNotFoundException, InvalidPasswordException
    {
        User user = this.userRepository.findByUserName(userName);
        Customer customer;
        
        if(user == null)
        {
            throw new UserNotFoundException();
        }
        
        if(user.isValidPassword(userPassword))
        {
            customer = user.getCustomer();
            loggedIn.add(user);
        }
        else
        {
            throw new InvalidPasswordException();
        }
        
        return customer;
    }
    
    public void logOut(String userName)
    {
        User user = findUserByName(userName);
        
        if(user != null)
        {
            loggedIn.remove(user);
        }
    }
    
    public boolean isLoggedIn(String userName)
    {
        boolean results = false;
        
        if(findUserByName(userName) != null)
        {
            results = true;
        }
        
        return results;
    }
    
    public User findUserByName(String userName)
    {
        User user = null;
        
        for(User u : loggedIn)
        {
            if(u.getUserName().equals(userName))
            {
                user = u;
            }
        }
        
        return user;
    }
}
