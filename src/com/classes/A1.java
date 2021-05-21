package com.classes;
//Static members execution flow with inheritance
//1. Super class is loaded before subclass is loaded
//2. All Static variables' memory is allocated default values from superclass to subclass
//3. Static variables initialization and execution is done in order from super class to sub class
//4. Main Method is executed from subclass. If sub class does not have one
//   Jvm will search for main method in Super class. If it's not found,
//   an exception will be thrown

public class A1 {
    static int a=m1();

    static int m1(){
        System.out.println("A sv");
        return 20;
    }
    static{
        System.out.println("A SB");
    }
    public static void main(String[] args){
        System.out.println("A main");
        System.out.println("a : "+ a);
    }
}
