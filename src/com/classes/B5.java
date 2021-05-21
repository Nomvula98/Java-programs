package com.classes;

public class B5 extends A5 {
    static void m1(){ // method hiding
        System.out.println("B m1");
    }
    void m2(){
        System.out.println("B m2"); //Method overriding
    }
    void m3(float f, int x){
        System.out.println("B m3 float, int param");//Method Overloading
    }
}
