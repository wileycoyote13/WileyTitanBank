
package com.titanbank.bll;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author w_coyote13
 */
public class Customer
{   
    // Fields
    private int customerID;
    private String firstName;
    private String lastName;
    
    // Constructor
    public Customer(int customerID, String firstName, String lastName) 
    {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    // Getters
    public int getCustomerID() 
    {
        return customerID;
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }
    
}
