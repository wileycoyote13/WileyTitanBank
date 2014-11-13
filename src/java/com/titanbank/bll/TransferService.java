
package com.titanbank.bll;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author w_coyote13
 */
public class TransferService 
{
    private ArrayList<Transfer> transactions;
    
    public void transferFunds(Transfer transfer)
    {
        Date currentDate = new Date();
        
        if(currentDate.before(transfer.getDate()))
        {
            transactions.add(transfer);
        }
        else
        {
            try 
            {
                transfer.getSourceAccount().withdrawal(transfer.getAmount());
                transfer.getDestinationAccount().deposit(transfer.getAmount());
                transfer.completeTransaction();
                transactions.add(transfer);
            } 
            catch (InsufficientFundsException ex) 
            {
                Logger.getLogger(TransferService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public List getTransfers(TransactionStatus status)
    {
        ArrayList<Transfer> results = new ArrayList<>();
        
        for(Transfer t: transactions)
        {
            if(t.getStatus().equals(status))
            {
                results.add(t);
            }
        }
        
        return results;
    }

}
