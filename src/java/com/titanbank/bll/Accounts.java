package com.titanbank.bll;

import java.util.ArrayList;

public class Accounts implements TBAcctRepository
{
    private ArrayList<BankAccount> accounts;

    public Accounts() 
    {
        accounts = new ArrayList<BankAccount>();
        fillAccountDataBase();
    }
    
    public void fillAccountDataBase()
    {
        accounts.add(new BankAccount(10, 1411, 55.00, AccountType.Checkings));
        accounts.add(new BankAccount(20, 1411, 110.00, AccountType.Savings));
        accounts.add(new BankAccount(30, 1511, 33.00, AccountType.Checkings));
        accounts.add(new BankAccount(40, 1511, 690.00, AccountType.Savings));
    }

    @Override
    public BankAccount findByAccountNumber(int accountNumber) 
    {
        BankAccount result = null;
        
        for(BankAccount a : accounts)
        {
            if(a.getAccountNumber() == accountNumber)
            {
                result = a;
            }
        }
        
        return result;
    }
    
    @Override
    public ArrayList<BankAccount> findByCustomerID(int customerID)
    {
        ArrayList<BankAccount> results = new ArrayList<>();
        
        for(BankAccount a : accounts)
        {
            if(a.getCustomerID() == customerID)
            {
                results.add(a);
            }
        }
        
        return results;
    }
}
