
package com.titanbank.bll;

import java.util.ArrayList;

/**
 *
 * @author w_coyote13
 */

public class User 
{   
    // Fields
    private final String userName;
    private final String userPassword;
    private final Customer customer;

    // Constuctors
    public User(String userName, String userPassword, Customer customer) 
    {
        this.userName = userName;
        this.userPassword = userPassword;
        this.customer = customer;
    }

    //Getters
    public String getUserName() 
    {
        return this.userName;
    }
    
    public Customer getCustomer()
    {
        return this.customer;
    }
    
    // Tests for a valid password.
    public boolean isValidPassword(String password)
    {   
        return this.userPassword.equals(password);
    }
}
