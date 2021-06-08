package com.collectionsExample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClassesDemo {
    public static void main(String[] args) {
        //set objects creation
        HashSet hs=new HashSet();
        LinkedHashSet lhs=new LinkedHashSet();
        TreeSet ts = new TreeSet();

        //printing initial size of collection objects
        System.out.println("hs length:"+hs.size());
        System.out.println("hs length: "+ lhs.size());
        System.out.println("ts length: "+ts.size());



        //adding elements to hs
        System.out.println("Is 20 added:"+hs.add(Integer.toString(10)));
        System.out.println("is added:"+hs.add(new Character('a')));
        System.out.println("is added:"+hs.add(new Character('b')));
        System.out.println("Is abc added:" + hs.add("abc"));

        //printing lhs elements and size
        System.out.println(lhs.size());
        System.out.println("lhs: "+lhs);

        //adding elements to ts
        //returns true or false
        System.out.println("Is abs added:"+ts.add("abc"));
        System.out.println("Is abs added:"+ts.add("xyz"));
        System.out.println("Is abs added:"+ts.add("bbc"));
        System.out.println("Is abs added:"+ts.add("pqr"));

        //printing ts size and elements
        System.out.println(ts.size());
        System.out.println("ts: "+ts);

    }
}
