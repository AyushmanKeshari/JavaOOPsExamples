package com.helloworld;

public class Main {

    static {
        System.out.println("Static Block is invoked - Run before main");
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("\nHello World");

        counter(); //Static Variable

        show(); //Static Method
        Main obj = new Main();
        obj.Show(); //Instance Method  Non-Static

        tryEncapsulation();

        tryInheritance();

        tryAbstraction();

        tryInterface();

        functionalInterface();

        markerInterface();

        tryPolymorphism();

        tryInnerClass();
    }

    static void show() {
        System.out.println("\nStatic");
    }

    void Show() {
        System.out.println("\nNon-static  Instance");
    }

    private static void counter() {
        System.out.println(StaticVarCounter.count); //Can be called from class, No object needed , because static
        StaticVarCounter c1 = new StaticVarCounter();
        StaticVarCounter c2 = new StaticVarCounter();
        c1.show();
        c2.show();
    }

    private static void tryEncapsulation() {    //Getter Setter with private variables for Data
        Encapsulation encapsulation = new Encapsulation(5);

        int j = encapsulation.getI();
        encapsulation.showI(j);

        encapsulation.setI(8);
        j = encapsulation.getI();
        encapsulation.showI(j);
    }

    private static void tryInheritance() {      //extends functionality of other class
        System.out.println("\nInheritance Example: ");
        InheritanceAdd obj = new InheritanceAdd();
        obj.i = 5;
        obj.j = 3;
        obj.add();

        //Single level Inheritance
        InheritanceAddSub obj1 = new InheritanceAddSub();
        obj1.i = 10;
        obj1.j = 3;
        obj1.sub();
        obj1.add();

        //Multi Level Inheritance
        InheritanceAddSubMul obj3 = new InheritanceAddSubMul();
        obj3.i = 15;
        obj3.j = 11;
        obj3.add();
        obj3.sub();
        obj3.mul();

        //Multiple inheritance is not possible,  Use Interfaces
        //extends a, b [NO]    implements a, b [YES]
    }

    private static void tryAbstraction() {      //Hiding implementation details
        System.out.println("\nAbstraction Example: ");
        //AbstractShape obj = new AbstractShape();    //Cannot instantiate Abstract Class
        AbstractShape obj = new AbstractCircle();
        obj.show();
        obj.nonAbstract();

        AbstractShape obj1 = new AbstractRectangle();
        obj1.show();
        obj1.area(5,3);

        showObject(obj);
        showObject(obj1);
    }

    private static void showObject(AbstractShape obj) {
        obj.show();
    }

    private static void tryInterface() {        //Used for 100% Abstraction,  Can be used for multiple inheritance
        System.out.println("\nInterface Example: ");
        //Bank obj = new Bank();  //Cannot create object of Interface, Similar to Abstract class
        Bank obj  = new InterfaceSBI();
        obj.rateOfInterest();

        Showable obj1 = new InterfaceSBI();
        obj1.show();

        InterfaceSBI obj2 = new InterfaceSBI();
        obj2.rateOfInterest();;
        obj2.show();

    }

    private static void functionalInterface() { //When only 1 method in an abstract class or interface
        System.out.println("\nFunctional Interface Example: SAM :  Single Abstract Method");

        Showable obj  = new Showable() {
            @Override
            public void show() {
                System.out.println("Anonymous Class");
            }
        };

        obj.show();

        Showable obj1 = () -> {
            System.out.println("Lambda Operation");
        };

        obj1.show();
    }

    private static void markerInterface() { //Interface with no methods :  Used to check if objects
        System.out.println("\nMarker Interface: ");

        DemoMarkerInterface obj = new DemoMarkerInterface();

        if(obj instanceof markerInterface) {
            obj.show();
        } else {
            System.out.println("No Permission");
        }
    }

    private static void tryPolymorphism() {
        System.out.println("\nPolymorphism Example: ");
        polyMorphism obj = new polyMorphism();
        obj.show();
        obj.show(5);

        polyMorphism obj1 = new polyMorphism((8));
        obj1.show();
        obj1.show(5);

        polymorphismOverriding obj2 = new polymorphismOverriding();
        obj2.show();
    }

    private static void tryInnerClass() {
        System.out.println("\nInner Class: ");
//        innerClass.B obj = new innerClass.B();        //Need B to be static

        //OR
        innerClass innerClass = new innerClass();
        innerClass.B obj1 = innerClass.new B();
        obj1.show();

//        B obj2 = new B() {
//          public static void showString() {
//              System.out.println("Anonymous Inner Class");
//          }
//        };
//
//        obj2.showString();

        
    }
}

