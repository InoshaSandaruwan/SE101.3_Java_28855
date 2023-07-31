
package com.mycompany.lab_08_1;

public class SavingsAccount extends BankAccount 
{
  public SavingsAccount(int accountNumber,double balance)
    {
        super(accountNumber,balance);
    }
    public double calculateInterest()
    {
        double interestRate=0.12;
        return getbalance()*interestRate;
    }  
}
