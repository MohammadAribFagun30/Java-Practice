package com.company;
import java.util.*;
class MyRunnable implements Runnable
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    public void run()
    {
       for(int i=1; i<=n; i++)
       {
           System.out.println("Runnable Thread : "+i);
           try {
               Thread.sleep(1000);
           } catch (Exception x) {
               x.printStackTrace();
           }
       }

    }
}

public class Multithreading {
    public static void main(String[] args)
    {
        Thread t1 = new Thread((new MyRunnable()));
        t1.start();
    }
}
