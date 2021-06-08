package com.collectionsExample;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(new Integer(10));
        st.push(new Integer(20));
        st.push(new Integer(30));
        st.push(new Integer(40));

        System.out.println(st);
        System.out.println("pop:"+st.pop()); //pop removes object at top of stack and returns the removed object/element
        System.out.println(st);

        System.out.println("peek: "+st.peek());//peek returns object at top of stack but does not remove it
        System.out.println(st);
    }
}
