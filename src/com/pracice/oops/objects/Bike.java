package com.pracice.oops.objects;

public class Bike {
    static int wheels = 2;
    String color = "";

    static void breaking()
    {
        System.out.println("BIKE HALTS WHEN BREAK APPLAYED");
    }
    void mileage(int s)
    {
        System.out.println("mileage is" +s +"kmpl");

    }
    public static void main(String[] args) {
        Bike b1 = new Bike();
        Bike b2 = new Bike();
        Bike b3 = new Bike();
        b1.breaking();
        b2.breaking();
        b3.breaking();
        b1.mileage(35);
        b2.mileage(45);
        b3.mileage(56);


        System.out.println("no of wheels:B1=" + b1.wheels);
        System.out.println("no of wheels:B2="+ b2.wheels);
        System.out.println("no of wheels:B3=" + b3.wheels);
        b1.color = "black";
        b2.color = "red";
        b3.color = "blue";
        System.out.println("bike color: B1=" + b1.color);
        System.out.println("bike color:B2=" + b2.color);
        System.out.println("bike color:B3=" + b3.color);
    }
}
