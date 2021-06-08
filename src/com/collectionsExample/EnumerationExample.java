package com.collectionsExample;

import java.util.*;

public class EnumerationExample {
    public static void main(String[] args) {
        ArrayList al= new ArrayList();
        al.add(10);
        al.add("a");

        Enumeration e = Collections.enumeration(al);

        while(e.hasMoreElements()){
            Object o = e.nextElement();
            System.out.println(o);
        }

        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add("aaa");
        lhs.add("bbb");
        lhs.add("dda");

        Iterator itr=lhs.iterator();

        while(itr.hasNext()){
            Object ele=itr.next();
            System.out.println(ele);
        }


    }
}
