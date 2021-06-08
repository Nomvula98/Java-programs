package com.collectionsExample;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {

        ArrayList al=new ArrayList();
        al.add("a");
        al.add(5);
        al.add(6);

        ListIterator litr= al.listIterator();

        while (litr.hasNext()){
            Object o = litr.next();
            System.out.println("current element: "+o);
        }
    }
}
