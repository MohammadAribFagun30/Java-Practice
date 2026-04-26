package com.company;
import java.util.*;
class ing
{
    int id;
    String name;

     public ing(int id, String name)
     {
         this.id = id;
         this.name = name;
     }

     void display(){
         System.out.println("Id is : "+id);
         System.out.println("Name is : "+name);

    }
}

class child2 extends ing{
    int marks;

    public child2(int id,String name,int marks)
    {
        super(id,name);
        this.marks = marks;
    }
    void displayChild2()
    {
        display();
        System.out.println("Marks are : "+marks);
    }


}


public class Inheritance_type_2
{


    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.print("Give Id : ");

        int id = st.nextInt();
        st.nextLine();
        System.out.print("Name Please : ");
        String name = st.nextLine();
        System.out.print("Give Marks : ");
        int marks = st.nextInt();

        child2 obj = new child2(id,name,marks);
        obj.displayChild2();



















    }
}
