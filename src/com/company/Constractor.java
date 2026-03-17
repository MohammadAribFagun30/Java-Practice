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
                String st = sc.nextLine();
        int i = sc.nextInt();
        info object = new info();

        object.name = st;
        object.id = i;

        System.out.println(object.name);
        System.out.println(object.id);



    }
}
