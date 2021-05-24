package com.classes;

//Abstraction happens in project design phase
//It designs object operations that will be implemented
//by different sub type programmers of this object
abstract class Bus implements Vehicle{
    abstract void engine(); //must be implemented in all subclasses
    public void breaks(){
        System.out.println("Breaks applied");
    }
    public void wheels(){
        System.out.println("Bus Wheels");
    }
}
