package com.classes;

//Non-static members execution flow with inheritance
public class B3 extends A3 {
    int y =m2();

    int m2(){
        System.out.println("B NSV");
        return 20;
    }
    {
        System.out.println("B NSB");
    }
    B3(){
        System.out.println("B3 Constructor");
    }

    public static void main(String[] args){
        System.out.println("B main");
        B3 b = new B3();

        System.out.println("b main " + b.x);
        System.out.println("b main " + b.y);
    }
}
