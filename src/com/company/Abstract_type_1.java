package com.company;

abstract class Animal {

    abstract void sound(); // abstract method

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    void sound() {
        System.out.println("Cat meows");
    }
}

public class Abstract_type_1 {
    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound(); // Dog barks
        a2.sound(); // Cat meows

        a1.sleep();  // inherited method
    }
}