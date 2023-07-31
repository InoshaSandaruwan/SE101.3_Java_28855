
package com.mycompany.lab_08_1;

abstract class BankAccount
{
    private int accountNumber;
    private double balance;
    public BankAccount(int an,double bl)
    {
        accountNumber=an;
        balance=bl;
    }
    public void setaccountNumber(int an)
    {
        accountNumber=an;
    }
    public int getaccountNumber()
    {
        return accountNumber;
    }
     public void setbalance(double bl)
    {
        balance=bl;
    }
    public double getbalance()
    {
        return balance;
    }
    public abstract double calculateInterest(); 
}
