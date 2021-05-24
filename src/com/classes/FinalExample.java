package com.classes;

public class FinalExample {
    void m1(){
        System.out.println("ex M1()");
    }
    final void m2(){ //final method cannot be overwritten

        System.out.println("ex m2()");
    }
    void m3(){
        System.out.println("ex m3()");
    }


}
