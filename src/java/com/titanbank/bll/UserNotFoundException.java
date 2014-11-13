package com.titanbank.bll;

public class UserNotFoundException extends Exception 
{

    public UserNotFoundException() 
    {
        super("User not found.");
    }
    
}
