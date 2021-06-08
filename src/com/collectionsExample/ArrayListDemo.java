package com.collectionsExample;

import java.util.ArrayList;

//Collections framework part11
public class ArrayListDemo {

    public static void main(String[] args){
        //Creating new arrayList
        ArrayList al = new ArrayList(0);
        System.out.println("Initial size of ArrayList: "+ al.size()); //0

        //Adding elements to arrayList
        al.add("Audi");
        al.add("Benz");
        al.add("Volvo");
        al.add("Ferrari");
        System.out.println("Size of ArrayList after adding elements: "+ al.size());

        //Displaying the arrayList
        System.out.println("Contents of Array: "+al);

        //Removing 2nd Index element from arrayList
        al.remove(2);
        System.out.println("Contents after removing index:"+ al);

        //Removing Benz element from arrayList
        al.remove("Benz");
        System.out.println("Contents after removing object"+al);
        System.out.println("Size of ArrayList after deletions:"+al);

        //Retrieving first Index element
        String alElement=(String)(al.get(1));
        System.out.println("al Element:"+alElement);

        //Inserting at first index
        al.add(1,"Ford");
        System.out.println(al);






    }
}
