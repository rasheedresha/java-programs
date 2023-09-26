package com.acabes.arabbank.java;

import java.util.Arrays;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args){
        int[] array=new int[3];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        for(int i=0;i<=2;i++)
        {
            array[i]= s.nextInt();
        }
        Arrays.sort(array);
        System.out.println("The greatest number is "+array[2]);


    }

}
