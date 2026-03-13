package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class pract {
    public static void main(String[] args)

    {

Scanner sc = new Scanner(System.in);
// problem 1 :

int n = sc.nextInt();
int x = sc.nextInt();

if(x>=(n/2))
{
    System.out.println("Will Pass");
}
else {
    System.out.println("Will Not Pass");
}

// problem 2 :
int s = sc.nextInt();

if(s>=1 && s<=15)
{
    if(s>=1 && s<=10)
    {
        System.out.println("Upper Double");
    }
    else
    {
        System.out.println("Upper Single");
    }
}
else if(s>=16 && s<=30)
{
    if(s>=16 && s<=25)
    {
        System.out.println("Lower Double");
    }
    else {
        System.out.println("Lower Single");
    }
}



    }

}
