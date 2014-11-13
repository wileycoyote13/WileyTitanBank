package com.titanbank.bll;

class InsufficientFundsException extends Exception 
{
    public InsufficientFundsException() 
    {
        super("Insufficient funds.");
    }
    
}
