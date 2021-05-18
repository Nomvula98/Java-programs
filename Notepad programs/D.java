package p2;

import p1.A;
class D{
public static void main(String[] args){

A a=new A();
//System.out.println("a: "+a.a); //a had private access
//System.out.println("b: "+a.b); // cannot be accessed from outside package
//System.out.println("c: "+a.c); // has protected access in A
System.out.println("d: "+a.d);




//To compile use:
	// javac -d . D.java
//To Execute use:
	// java p2.D
}


}