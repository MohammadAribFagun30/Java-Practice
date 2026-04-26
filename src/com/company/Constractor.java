package com.company;
import java.sql.SQLOutput;
import java.util.*;
class info {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



public class Constractor {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        info object = new info();

        String st = sc.nextLine();
        int i = sc.nextInt();

        object.name = st;
        object.id = i;

        //object.setName("Fagun");
        //object.setId(251030);

        System.out.println(object.getId());
        System.out.println(object.getName());



    }
}
