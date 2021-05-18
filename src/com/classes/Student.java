package com.classes;

//IS-A relationship (Inheritance), between Student and Person(Super class)
public class Student extends Person {

    public Student(String name, double height, double weight) {
        super(name, height, weight);
    }
    //HAS-A relationship with address,
    // Student class was not gonna exist without an address.
    Address add = new Address();

    //USES-A relationship
    //When an object uses another object to perform a business logic (Method)
    void goingToCollege(Bike b){
      System.out.println("Student goes to college: ");


  }





}
