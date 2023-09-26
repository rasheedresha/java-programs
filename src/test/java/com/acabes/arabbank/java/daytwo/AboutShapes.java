package com.acabes.arabbank.java.daytwo;

abstract class Shapes {
    String name;
    public Shapes(String name) {
        this.name = name;
    }

    void move(int x, int y) {
        System.out.println("it has moved by " + x + "and " + y);
    }
    void draw(){
        System.out.println("Function of drawing");
    }
    void area(int x, int y){
        double area=x*y;
        System.out.println("the area is: "+area);
    }
}

class Rectangle extends Shapes{
     Rectangle(String name){
         super(name);
    }

    void draw(){
        System.out.println("Function of drawing");
    }
    void area(int length, int breadth){
        double area=length*breadth;
        System.out.println("Area of rectangle is: "+area);
    }
}
class Circle extends Shapes{
    Circle(String name){
        super(name);
    }
    void draw(){
        System.out.println("Function of drawing");
    }


    void area(int radius){
        double area=3.14*radius*radius;
        System.out.println("Area of circle is: "+area);
    }
}


public class AboutShapes {
    public static void main(String[] args){
        Rectangle rect=new Rectangle("rectangle");
        Circle cir=new Circle("circle") ;
        rect.area(12,10);
        cir.area(10);

    }
}
