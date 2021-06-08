package com.collectionsExample;

import com.collectionsExample.Address;

import java.util.Vector;

public class VectorCapacityDemo {
    public static void main(String[] args) {
        Vector v = new Vector();

        System.out.println("Initial capacity and size of vector:" + v);
        System.out.println("Capacity: "+v.capacity()); //default capacity is 10
        System.out.println("Size: "+v.size());

        System.out.println();
        Customer c1=new Customer("hemanth",30,new Address("9-99-555","India","1234"));

        v.add("c1");
        System.out.println("Capacity and size of vector:" + v);
        System.out.println("Capacity: "+v.capacity()); //default capacity is 10
        System.out.println("Size: "+v.size());// size is 1 since we added one

        Customer c2=new Customer("Nomvula",30,new Address("9-99-222","Russia","4567"));
        Customer c3=new Customer("B",31,new Address("9-99-111","Germany","1111"));
        Customer c4=new Customer("C",32,new Address("9-99-121","Japan","1222"));
        Customer c5=new Customer("D",33,new Address("9-99-333","China","1233"));
        Customer c6=new Customer("E",34,new Address("9-99-444","Dubai","1232"));
        Customer c7=new Customer("F",35,new Address("9-99-666","Paris","1244"));
        Customer c8=new Customer("G",36,new Address("9-99-777","Poland","1334"));
        Customer c9=new Customer("H",37,new Address("9-99-888","Uk","1288"));
        Customer c10=new Customer("H",37,new Address("9-99-888","Uk","1288"));

        Customer c11=new Customer("H",37,new Address("9-99-888","Uk","1288"));

        v.add("c2");
        System.out.println("Capacity and size of vector:" + v);
        System.out.println("Capacity: "+v.capacity()); //default capacity is 10
        System.out.println("Size: "+v.size());// size is 1 since we added one

        v.add("c3");
        System.out.println("Capacity and size of vector:" + v);
        System.out.println("Capacity: "+v.capacity()); //default capacity is 10
        System.out.println("Size: "+v.size());// size is 1 since we added one

        v.add("c4");
        System.out.println("Capacity and size of vector:" + v);
        System.out.println("Capacity: "+v.capacity()); //default capacity is 10
        System.out.println("Size: "+v.size());// size is 1 since we added one

        v.add("c5");
        System.out.println("Capacity and size of vector:" + v);
        System.out.println("Capacity: "+v.capacity()); //default capacity is 10
        System.out.println("Size: "+v.size());// size is 1 since we added one

        //Capacity will increase to 20 if Its more than 10
        v.add("c6");
        System.out.println("Capacity and size of vector:" + v);
        System.out.println("Capacity: "+v.capacity()); //default capacity is 10
        System.out.println("Size: "+v.size());// size is 1 since we added one

        v.add("c7");
        System.out.println("Capacity and size of vector:" + v);
        System.out.println("Capacity: "+v.capacity()); //default capacity is 10
        System.out.println("Size: "+v.size());// size is 1 since we added one
        v.add("c8");
        System.out.println("Capacity and size of vector:" + v);
        System.out.println("Capacity: "+v.capacity()); //default capacity is 10
        System.out.println("Size: "+v.size());// size is 1 since we added one
        v.add("c9");
        System.out.println("Capacity and size of vector:" + v);
        System.out.println("Capacity: "+v.capacity()); //default capacity is 10
        System.out.println("Size: "+v.size());// size is 1 since we added one
        v.add("c10");
        System.out.println("Capacity and size of vector:" + v);
        System.out.println("Capacity: "+v.capacity()); //default capacity is 10
        System.out.println("Size: "+v.size());// size is 1 since we added one
        v.add("c11");
        System.out.println("Capacity and size of vector:" + v);
        System.out.println("Capacity: "+v.capacity()); //default capacity is 10
        System.out.println("Size: "+v.size());// size is 1 since we added one
        //Capacity will increase to 20 if Its more than 10

        for (int i=0;i<v.size();i++){
            System.out.println(v.get(i));
            System.out.println();
        }


    }

}
