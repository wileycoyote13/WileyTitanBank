package com.titanbank.bll;

public class AccountNotFoundException extends Exception
{
    public AccountNotFoundException() 
    {
        super("Account not found.");
    }
}
