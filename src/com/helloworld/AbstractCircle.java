package com.helloworld;

public class AbstractCircle extends AbstractShape { //Concrete Class
    @Override
    public void show() {
        System.out.println("Showing Circle");
    }

    @Override
    public void area(int i, int j) {
        double res = i*j*3.14;
        System.out.println("Circle Area: " + res);
    }
}
