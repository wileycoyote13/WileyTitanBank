package com.titanbank.bll;

public enum AccountType 
{
    // Different accounts.
    Checkings("Checkings"), Savings("Savings");
    
    private AccountType(final String text) 
    {
        this.text = text;
    }

    private final String text;

    @Override
    public String toString() 
    {
        return text;
    }

}
