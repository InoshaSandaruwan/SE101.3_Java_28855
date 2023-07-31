
package com.mycompany.lab_08_1;

public class Lab_08_1 
{

    public static void main(String[] args) 
    {
        SavingsAccount SA1=new SavingsAccount(1234,20000000);
        CheckingAccount CA1=new CheckingAccount(7856,100000);
        SA1.calculateInterest();
        CA1.calculateInterest();
        System.out.println("Your Saving Account Interest is: "+SA1.calculateInterest());
        System.out.println("Your Checking Account Interest is: "+CA1.calculateInterest());
        
    }
}
