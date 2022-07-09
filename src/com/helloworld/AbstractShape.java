package com.helloworld;

public abstract class AbstractShape {   //Abstract Class
    public AbstractShape() {
        System.out.println("Abstract shape class is created");
    }

    public abstract void show();

    public abstract void area(int i, int j);

    public void nonAbstract() {
        System.out.println("Non Abstract method is showing");
    }
}
