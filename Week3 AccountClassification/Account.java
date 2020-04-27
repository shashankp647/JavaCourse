package com.example.accountapp.logic;

import com.example.accountapp.ui.OutputInterface;

/**
 * This file defines the Account class.  It provides the basis for a
 * series of improvements you'll need to make as you progress through
 * the lessons in Module 6.
 */
public class Account {
    /**
     * This is the variable that stores our OutputInterface instance.
     * <p/>
     * This is how we will interact with the User Interface
     * [MainActivity.java].
     * </p>
     * This was renamed to 'mOut' from 'out', as it is in the video
     * lessons, to better match Android/Java naming guidelines.
     */
    final OutputInterface mOut;
    public Account(OutputInterface out) {
        mOut = out;
    }




    /**
     * Name of the account holder.
     */
    public Account (String newName , int newNumber, OutputInterface out ){
        name =newName;
        number=newNumber;
        mOut=out;
    }
    public Account (String newName , int newNumber, double initialBalance ,OutputInterface out){

        this(newName,newNumber,out);
        balance=initialBalance;


    }


    private String name;

    public String getName(){
        return(name);

    }
    public void setName(String nm) {
        name =nm ;
    }

    /**
     * Number of the account.
     */
    private int number;

    public int getNumber(){
        return (number);
    }
    public void setNumber(int num){
        number=num;
    }

    /**
     * Current balance in the account.
     */
    private double balance;

    public double getBalance(){
        return (balance);
    }

    /**
     * Constructor initializes the field
     */


    /**
     * Deposit @a amount into the account.
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Withdraw @a amount from the account.  Prints "Insufficient
     * Funds" if there's not enough money in the account.
     */
    public Boolean withdrawal(double amount)
    {
        if (balance > amount){
            balance -= amount;
            return (true);}
        else {
            return (false);
            }
    }

    /**
     * Display the current @a amount in the account.
     */
    public void displayBalance() {
        mOut.println("The balance on account " 
                     + number
                     + " is " 
                     + balance);
    }
}
