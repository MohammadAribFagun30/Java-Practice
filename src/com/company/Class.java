package com.company;
import java.util.*;
class information{
    int id;
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId()
    {
        return id;
    }
}
public class Class {
    public static void main(String[] args)
    {
        information object = new information();

        object.name = "Fagun";
        object.id = 251030;

        System.out.println(object.name);
        System.out.println(object.id);
    }
}
