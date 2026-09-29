package com.lcwd.withoutboot.Abstraction;

abstract class Animal {
   abstract void sound();
   void eat(){
       System.out.println("Animal is eating");
   }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog is Barks");
    }
}
public class Main{
   public static void main(String[] args) {
       Animal a=new Dog();
       a.sound();
       a.eat();
    }
}