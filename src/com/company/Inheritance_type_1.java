package com.company;
import java.util.*;
class parent{
    void parent()
    {
        System.out.println("Hi From Parent class");
    }
}
class child1 extends parent{
    void child1()
    {
        System.out.println("Hello From Child class");
    }
}
public class Inheritance_type_1 {
    public static void main(String[] args) {
    Scanner st = new Scanner(System.in);

    child1 obj = new child1();
    obj.child1();
    obj.parent();



    }
}
