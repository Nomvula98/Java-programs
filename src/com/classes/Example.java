package com.classes;

public class Example {
    Example(){
        System.out.println("Ex no-arg constructor");

    }
    Example(int a){
        System.out.println("Ex int-param constructor");
    }
    Example(String s){
        System.out.println("EX string-param");
    }
    public static void main(String[] args){
        Example B1 = new Example();
        Example B2 = new Example(10);
        Example B3 = new Example("Hamanth");
    }

}
