package com.company;
import java.util.*;
public class Array_List {
     static void main() {
      Scanner sc = new Scanner(System.in);

     ArrayList<Integer> array = new ArrayList<>();

     int size = sc.nextInt();
      for(int i=0; i<size; i++)
      {
          array.add(sc.nextInt());
      }
         System.out.println("Array List is : ");
         System.out.println(array);
}

    }
