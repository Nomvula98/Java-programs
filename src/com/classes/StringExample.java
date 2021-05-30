package com.classes;

public class StringExample {

    public static void main(String[] args){
        String str="Nomvula";

        if(str.equals("john")){
            System.out.println("Hi john");
        }
        else
        {
            System.out.println("Who are you?");
        }

        //String Buffer object
        StringBuffer sb=new StringBuffer("Hamanth");
        System.out.println(sb);

        sb.insert(3," ");
        System.out.println(sb);

        //String(String value)
        String s1=new String("ABC");
        System.out.println(s1);

        //String(StringBuffer sb)
        String s3=new String(sb);
        System.out.println(s3);

        //String(StringBuilder sb3)
        StringBuilder sb3  = new StringBuilder("John");
        String s4=new String(sb3);
        System.out.println(s4);

        //String(char[] ch)
        char[] ch={'a','b','c','d'};
        String s5=new String(ch);
        System.out.println(s5);

        //String(char[] ch,int,offset,int,count)
        char[] ch1={'w','r','t','s'};
        String s6=new String(ch1,2,2);
        System.out.println(s6);

        //String(byte[]b)
        byte[] b={97,98,99};
        String s8=new String(b);
        System.out.println(s8);


    }
}
