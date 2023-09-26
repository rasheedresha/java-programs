package com.acabes.arabbank.java.daytwo;
abstract class BankAccount{
    private long accountNumber;
    private String accountholder;
    private double balance;
    float amount;
    BankAccount(float amount){
        this.amount=amount;
    }
    void deposit(float amount){
        System.out.println("");
    }
    void withdraw(float amount)
    {
        //v_a < balance
    }
}

class SavingAccount extends BankAccount{
    public float InterestRate;
    SavingAccount()
    {

    }
}

class InterestRate extends BankAccount{
    InterestRate()
    {

    }
}









public class Banks {
    public static void main(String[] args)
    {
        class Demo{

        }
    }

}
