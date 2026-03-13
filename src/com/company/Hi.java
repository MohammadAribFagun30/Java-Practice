package com.company;
import java.util.*;
interface camera{
    void snap();
    void record();
}

interface wifi{
    String[] netWork();
     void connectToNetworks(String network);
}

class MyCellPhone2{
    void callNumber(int number)
    {
        System.out.println("Calling "+ number);
    }
    void pickCall()
    {
        System.out.println("Connecting..");
    }
}

 class MySmartPhone extends MyCellPhone2 implements camera,wifi
{
    public void snap()
    {
        System.out.println("Taking Snap...");
    }
    public void record()
    {
        System.out.println("Taking Video...");
    }

    public String[] netWork()
    {
        System.out.println("Getting Network..");
        String[] netWorkList = {"Fagun","Arib","Alif"};
        return netWorkList;
    }
    public void connectToNetworks(String network)
    {
        System.out.println("Connecting.. "+network);
    }
}



public class Hi {
  public   static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
MySmartPhone ob = new MySmartPhone();
String[] st = ob.netWork();
for(String x : st)
{
    System.out.print(x+" ");
}
      System.out.println();
ob.snap();
ob.record();
ob.connectToNetworks("Fagun");








}

    }
