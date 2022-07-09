package com.helloworld;

//public class InterfaceSBI implements  Bank, Showable{
//OR
public class InterfaceSBI implements Bank {
    float f = 0f;
    @Override
    public void rateOfInterest() {
        f = 9.15f;
    }

    @Override
    public void show() {
        System.out.println(f);
    }
}
