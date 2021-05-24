package com.classes;

public class FinalSample extends FinalExample {
    void m1(){
        System.out.println("s m1()");
    }

    //void m2(){
       // System.out.println("s m2");
    //}
    public static void main(String[] args){
        FinalSample s1=new FinalSample();
        s1.m1();
        s1.m2();
        s1.m3();
    }
}
