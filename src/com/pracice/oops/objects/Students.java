package com.pracice.oops.objects;

public class Students{
    int id;
    String name;
}

class TestStudent2{
    public static void main(String args[]){
        Students s1=new Students();
        s1.id=101;
        s1.name="Sonoo";
        System.out.println(s1.id+" "+s1.name);
    }
}