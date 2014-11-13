
package com.titanbank.bll;

/**
 *
 * @author w_coyote13
 */
public class BankAccount
{    
    // Fields
    private int accountNumber;
    private int customerID;
    private double balance;
    private AccountType accountType;

    // Constructor
    public BankAccount(int accountNumber, int customerID, double intialFunds, AccountType accountType) 
    {
        this.accountNumber = accountNumber;
        this.customerID = customerID;
        this.balance = intialFunds;
        this.accountType = accountType;
    }
    
    // Getters
    public int getAccountNumber()
    {
        return accountNumber;
    }
    
    public AccountType getAccountType() 
    {
        return accountType;
    }

    public int getCustomerID() 
    {
        return customerID;
    }

    public double getBalance() 
    {
        return balance;
    }
    
    public boolean hasSufficientFunds(double amount)
    {
        return this.balance >= amount;
    }

    public void withdrawal(Double amount) throws InsufficientFundsException
    {
        if(this.hasSufficientFunds(amount))
        {
            this.balance -= amount;
        }
        else
        {
            throw new InsufficientFundsException();
        }
    }
    
    public void deposit(Double amount)
    {
        this.balance += amount;
    }
}
