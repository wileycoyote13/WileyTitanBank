package com.titanbank.bll;

import java.util.ArrayList;

public interface TBAcctRepository 
{
    BankAccount findByAccountNumber(int accountNumber);
    ArrayList<BankAccount> findByCustomerID(int customerID);
}
