package com.acabes.arabbank.java.daytwo;

abstract class Animals {
   abstract void cats();
   abstract void dogs();
}
class Cats extends Animals{
    void cats()
    {
        System.out.println("Cats meow");
    }
    void dogs() {

    }
}

class Dogs extends Animals{
    void dogs()
    {
        System.out.println("Dogs bark");
    }
    void cats()
    {

    }
}

public class AboutAnimals
{
    public static void main(String[] args)
    {
        Cats c=new Cats();
        Dogs d=new Dogs();
        c.cats();
        d.dogs();
    }
}