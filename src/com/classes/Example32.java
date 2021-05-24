package com.classes;
//Constructor overloading
public class Example32 {
    Example32(){
        System.out.println("Ex no-arg constructor");

    }
    Example32(int a){
        System.out.println("Ex int-param constructor");
    }
    Example32(String s){
        Example32 e1=new Example32();
        Example32 e2 = new Example32(10);
        Example32 e3=new Example32("Hemanth");
    }

}
