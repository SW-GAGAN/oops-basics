package com.prectice.basics;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int num = reader.nextInt();

        if(num % 4 == 0)
            System.out.println(num + " is leap year");
        else
            System.out.println(num + " is not leap year");
    }
}

