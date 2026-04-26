package com.company;
import java.util.*;

abstract class person {
    private String name;
    private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

     abstract void displayRole();
}

class Student extends person {
    private int studentid;

    public Student(String name, int age, int studentid) {
        super(name, age);
        this.studentid = studentid;
    }

    public void displayRole() {
        System.out.println(getName() + " is a Student ID = " + studentid);
    }
}

class Teacher extends person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println(getName() + " is a teacher of " + subject);
    }
}

public class Abstract_type_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

////
////        person S1 = new Student("Arib", 22, 251030);
////        person T1 = new Teacher("Fagun", 30, "MATH");
//
//        S1.displayRole();
//        T1.displayRole();

        // Student Info :
        System.out.print("Enter Student Name : ");
        String s = sc.nextLine();

        System.out.print("Student Age : ");
        int a = sc.nextInt();

        System.out.print("Studet Id : ");
        int id = sc.nextInt();
        sc.nextLine();


        //Teacher Info :
        System.out.print("Enter Teacher's Name : ");
        String s2 = sc.nextLine();

        System.out.print("Teacher's Age : ");
        int a2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Teacher's Subject : ");
        String sub = sc.nextLine();


        person S1 = new Student(s,a,id);
        person T1 = new Teacher(s2,a2,sub);

        S1.displayRole();
        T1.displayRole();



    }
}
