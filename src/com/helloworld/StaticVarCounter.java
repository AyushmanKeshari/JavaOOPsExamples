package com.helloworld;

public class StaticVarCounter {
    static int count = 0;       //Static get memory once,    if not static 1 1, if static then 1 2
    StaticVarCounter(){
//        count++;
        countBy2();
        System.out.println(count);
    }

    void show() {
        System.out.println("Show by obj : " + count);
    }

    void countBy2(){
        count = count+2;
    }
}
