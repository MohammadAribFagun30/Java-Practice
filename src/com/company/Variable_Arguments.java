package com.company;

public class Variable_Arguments {

    public static void number(int ...arr)
    {
        int sum = 0;
        for(int a : arr)
        {
            sum +=a;
        }
        System.out.println(sum);
    }

    public static void main(String[] args)
    {

        number(2);
        number(2,3);
        number(2,3,4);

    }

}
