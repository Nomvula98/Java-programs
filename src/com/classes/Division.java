package com.classes;

public class Division {
    public static void main(String[] args){
        //Exception handling
        //Try{...} -> Exception causing or its related statements
        //Catch{...} -> Statements that takes proper actions againsts some exception,
           //you can have multiple catch statements
        //Finally{...} ->Statements for  compulsory execution



        try {

            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("Result: " + c);
        }
        catch (ArrayIndexOutOfBoundsException aiob){
            System.out.println("Please pass atleast two integer numbers");
        }
        catch(ArithmeticException ae){
            System.out.println("Please do not pass second value as zero");
        }
        catch (NumberFormatException nfe){
            System.out.println("Please pass only integer values");
        }
        finally {//
            System.out.println("Finally block");
        }

        //Exception propagate
        System.out.println("MAin method start");
        try {
            m1();
        }
        catch(ArithmeticException ae){
            System.out.println("MAin method start");
        }
        System.out.println("MAin method end");


        //Throw-> Used to throw exception manually from a method or constructor
        //Throws->used to report that raised exception to this method caller
        try{
            throw new InterruptedException();
        }
        catch(InterruptedException ie){
            System.out.println(ie);
        }
    }

static void m1(){
    try{
        System.out.println("In m1() method start");
        System.out.println(10/0);
        System.out.println("In m1() method end");
    }
    catch(ArithmeticException ae){
        System.out.println("In m1() method catch");
    }



}
}