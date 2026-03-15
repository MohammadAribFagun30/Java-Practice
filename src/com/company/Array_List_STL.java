package com.company;
import java.util.*;

public class Array_List_STL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<>();

        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            array.add(sc.nextInt());
        }
        System.out.println("Array List is : ");
        System.out.println(array);


        // Sorting Array List -
        Collections.sort(array);
        System.out.println("After Sorting : ");
        System.out.println(array);

        // Inserting in Array List -
        array.add(3,9);
        System.out.println("After inserting in : ");
        System.out.println(array);

        // Searching -
        System.out.print("Search : ");
        int x = sc.nextInt();

        if(array.contains(x))
        {
            System.out.println("Found it");
        }
        else
        {
            System.out.println("Not Here !!");
        }

        // Push Back -
        array.add(8);
        System.out.println("After Push Back : ");
        System.out.println(array);

    }
}



