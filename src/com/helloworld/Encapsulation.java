package com.helloworld;

public class Encapsulation {
    private int i;

    public Encapsulation(int x) {
        System.out.println("/nEncapsulation Example: ");
        i = x;
    }
    public int getI() {
        return i;
    }
    public void setI(int j) {
        i = j;
    }

    public void showI(int x) {
        System.out.println(x);
    }
}
