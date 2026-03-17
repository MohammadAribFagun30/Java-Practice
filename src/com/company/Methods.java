package com.company;
import java.util.*;
public class Methods {

    static int marks(int x, int y)
    {
       int sum = x+y;
        return sum;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);

        int result =  marks(3,5);
        System.out.println(result);

    }
}



