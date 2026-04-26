package com.company;
import java.util.*;
import java.lang.classfile.attribute.SyntheticAttribute;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double area() {
        return 3.1416 * r * r;
    }
}

class Rectangle extends Shape {
    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    double area() {
        return l * b;
    }
}

public class Abstract_type_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        Shape s1 = new Circle(5);
//        Shape s2 = new Rectangle(4, 6);
//
//        System.out.println(s1.area());
//        System.out.println(s2.area());


        // Circle input
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        Shape s1 = new Circle(r);

        // Rectangle input
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double b = sc.nextDouble();
        Shape s2 = new Rectangle(l, b);

        // Output
        System.out.println("Area of Circle: " + s1.area());
        System.out.println("Area of Rectangle: " + s2.area());
    }
}
