package com.helloworld;

public class polyMorphism {
    int x = 0;
    public polyMorphism() {
        System.out.println("Empty Constructor");
    }

    public polyMorphism(int i) {
        x = i;
        System.out.println("Constructor Overloading");
    }

    public void show() {
        System.out.println("Simple show");
        System.out.println(x);
    }

    public void show(int i) {
        System.out.println("Method Overloading, Early Binding, Static Binding, Compile time polymorphism");
        System.out.println(i);
    }
}
