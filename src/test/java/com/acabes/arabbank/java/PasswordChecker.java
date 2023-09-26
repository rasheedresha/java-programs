package com.acabes.arabbank.java;

import java.util.*;
public class PasswordChecker {
    public static void isStrongPassword(String password)
    {
        if ((password.length()) <8) {
            System.out.println("Password should be at least 8 characters.");

        } else
        {
            boolean isUpper=false;
            boolean islower=false;
            boolean isDigit=false;
            for(int i=0;i<password.length();i++)
            {
                if(Character.isUpperCase(password.charAt(i)))
                {
                    isUpper=true;
                }
            }
            for(int i=0;i<password.length();i++)
            {
                if(Character.isLowerCase(password.charAt(i)))
                {
                    islower=true;
                }
            }
            for(int i=0;i<password.length();i++)
            {
                if(Character.isDigit(password.charAt(i)))
                {
                    isDigit=true;
                }
            }
            if(isUpper && islower && isDigit)
            {
                System.out.println("Strong Password");
            }
            else
            {
                System.out.println("Not s strong Password");
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your password:");
        String password = s.nextLine();
        isStrongPassword(password);
    }

}

