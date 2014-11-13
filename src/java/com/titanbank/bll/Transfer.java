package com.titanbank.bll;

import java.util.Date;

/**
 *
 * @author w_coyote13
 */
public class Transfer 
{
    private int transferNumber;
    private BankAccount destinationAccount;
    private BankAccount sourceAccount;
    private double amount;
    private Date date;
    private TransactionStatus status;

    public Transfer(int transferNumber, BankAccount to, BankAccount from, double amount, TransactionStatus status) 
    {
        this.transferNumber = transferNumber;
        this.destinationAccount = to;
        this.sourceAccount = from;
        this.amount = amount;
        this.status = status;
        this.date = new Date();
    }

    public Transfer(BankAccount to, BankAccount from, double amount, TransactionStatus status, Date date) 
    {
        this.destinationAccount = to;
        this.sourceAccount = from;
        this.amount = amount;
        this.status = status;
        this.date = date;
    }

    // Getters
    public int getTransferNumber() 
    {
        return transferNumber;
    }
    
    public BankAccount getDestinationAccount() 
    {
        return destinationAccount;
    }

    public BankAccount getSourceAccount() 
    {
        return sourceAccount;
    }

    public double getAmount() 
    {
        return amount;
    }

    public Date getDate() 
    {
        return date;
    }

    public TransactionStatus getStatus() 
    {
        return status;
    }
    
    // Transfer complete.
    public void completeTransaction() 
    {
        this.status = TransactionStatus.Completed;
    }
    
}
