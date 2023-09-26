package com.acabes.arabbank.java;

//to remove duplicates from string
public class Duplicates {
    public static void main(String[] args) {
        String s1 = "Resha Cheriyil Rasheed";
        System.out.println("The string is: " + s1);
        System.out.println("The string without duplicates is: " + resString(s1));
    }

    public static String resString(String string1)
    {
        char[] a=string1.toCharArray();
        String opString="";
        for(char z:a)
        {
            if(opString.indexOf(z)==-1)
            {
                opString+=z;
            }
        }
        return opString;
    }


}

