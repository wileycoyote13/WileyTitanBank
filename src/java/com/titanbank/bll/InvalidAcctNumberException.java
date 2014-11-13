package com.titanbank.bll;

public class InvalidAcctNumberException extends Exception
{
    public InvalidAcctNumberException() 
    {
        super("Invalid Account Number");
    }
}
