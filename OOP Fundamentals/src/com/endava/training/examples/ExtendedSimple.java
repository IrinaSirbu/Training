package com.endava.training.examples;

/**
 * Created by isirbu on 10/26/2016.
 */

public class ExtendedSimple extends Simple {

    ExtendedSimple(){

        super();
        System.out.println("Hello from constructor with 0 args");

    }

    ExtendedSimple(int x){

        super(x);
        System.out.println("Hello from constructor with 1 args");

    }

    ExtendedSimple(int x, int y){

        super(x,y);
        System.out.println("Hello from constructor with 2 args");

    }

}
