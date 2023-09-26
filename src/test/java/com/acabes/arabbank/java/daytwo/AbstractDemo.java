package com.acabes.arabbank.java.daytwo;

abstract class AboutAbstract{
    abstract void a_method();
    public void na_method(){
        System.out.println("This is a normal method of abstract class");
    }
    public AboutAbstract(){
        System.out.println("This is constructor of abstract class");
    }
}
class SubClass extends AboutAbstract{
    @Override
    void a_method() {
        System.out.println("This is abstract method");
    }
}



public class AbstractDemo {
    public static void main(String[] args){
        SubClass obj=new SubClass();
        obj.a_method();
        obj.na_method();


    }

}
