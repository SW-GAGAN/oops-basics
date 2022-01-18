package com.oops.inheritance;

public class Animal1 {
    void eat(){System.out.println("eating...");}
}
class cow extends Animal1{
    void shout(){System.out.println("shouting...");}
}
class Cat extends Animal1{
    void meow(){System.out.println("meowing...");}
}
class TestInheritance3{
    public static void main(String args[]){
        Cat c=new Cat();
        c.meow();
        c.eat();

    }
}

