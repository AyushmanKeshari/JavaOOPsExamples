package com.helloworld;

public class AbstractRectangle extends AbstractShape{
    @Override
    public void show() {
        System.out.println("Showing Rectangle");
    }

    @Override
    public void area(int i, int j) {
        double res = i*j;
        System.out.println("Rectangle Area: " + res);
    }
}
