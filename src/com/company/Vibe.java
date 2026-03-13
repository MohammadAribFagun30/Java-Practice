package com.company;

import java.util.Scanner;

public class Vibe {
      static void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] st = new String[n];
        for(int i=0; i<n; i++)
        {
            st[i] = sc.nextLine();
        }

        for(int i=0; i<n; i++)
        {
            System.out.println(st[i]);
        }
    }
}
