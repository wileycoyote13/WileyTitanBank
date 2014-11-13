
package com.titanbank.bll;

/**
 *
 * @author w_coyote13
 */
public class InvalidPasswordException extends Exception 
{

    public InvalidPasswordException() 
    {
        super("Invalid password.");
    }
    
}
