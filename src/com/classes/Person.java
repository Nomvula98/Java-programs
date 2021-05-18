package com.classes;

public class Person {
    public String toString(){
        return "pname: " +name+"\n"+
                "eyes : " +eyes+"\n"+
                "ears : " +ears+"\n"+
                "hands : " +hands+"\n"+
                "legs : " +legs+"\n"+
                "height : " +height+"\n"+
                "weight : " +weight+"\n";
    }

    //Constants
    static final int eyes=2;
    static final int ears=2;
    static final int legs=2;
    static final int hands=2;

    String name;
    double height;
    double weight;

    public void Person(){};

    //Person Constructor
    public  Person (String name, double height, double weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
    }
}
