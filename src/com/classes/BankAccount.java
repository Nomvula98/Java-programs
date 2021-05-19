package com.classes;

//Encapsulated class
public class BankAccount {
    //Encapsulation: Process of crating a class by binding variables and methods
        //as one unit and then operating variables only through
        //these methods
    //1. Declare all variables as private
    //2. Create a pair of getter and setter methods

    private double balance;

    public void setBalance(double balance){
        if (balance <=0) {
            System.out.println("Do not enter a negative amount");
        }else{
            this.balance=balance;
        }
    }
    public double getBalance(){
        return balance;
    }



}