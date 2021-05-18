package com.classes;

public class Employee extends Person {
    public Employee(String name, double height, double weight) {
        super(name, height, weight);
    }
    //HAS-A relationship
    Address add = new Address();

    //USES-A relationship
        //When an object uses another object to perform a business logic (Method)
    void goingToWork(Car a) {
        System.out.println("Employee goes to work: ");

    }
}
