package com.collectionsExample;

public class Customer {

        String name;
        int age;
        Address address;


        Customer(String name, int age, Address address){
                this.name=name;
                this.age=age;
                this.address=address;
        }
        public String toString(){
                return("Name: "+name+
                        "\nAge: "+age+
                        " H.no: "+ address.hno +
                        "\n Country:"+address.country+
                        "\n nph: "+address.ph);
        }
}
