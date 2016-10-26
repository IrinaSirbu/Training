package com.endava.training;

import com.endava.training.shape.impl.Circle;
import com.endava.training.shape.impl.Square;
import com.endava.training.shape.impl.Triangle;

import com.endava.training.examples.A;
import com.endava.training.examples.B;
import com.endava.training.examples.C;

/**
 * Created by isirbu on 10/26/2016.
 */

public class Main {
    public static void main(String args[]){

        System.out.println("Hello OOP\n");

        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(60);

        Triangle triangle1 = new Triangle(3,4,5);
        Triangle triangle2 = new Triangle(5,5,10);
        Triangle triangle3 = new Triangle(6,9,15);

        Square square1 = new Square(5);
        Square square2 = new Square(9);
        Square square3 = new Square(20);

        circle1.computeArea();
        circle1.computePerimeter();
        circle2.computeArea();
        circle2.computePerimeter();
        circle3.computeArea();
        circle3.computePerimeter();

        triangle1.computeArea();
        triangle1.computePerimeter();
        triangle2.computeArea();
        triangle2.computePerimeter();
        triangle3.computeArea();
        triangle3.computePerimeter();

        square1.computeArea();
        square1.computePerimeter();
        square2.computeArea();
        square2.computePerimeter();
        square3.computeArea();
        square3.computePerimeter();

        System.out.println("First circle: perimeter = " + circle1.perimeter + " area = " + circle1.area);
        System.out.println("Second circle: perimeter = " + circle2.perimeter + " area = " + circle2.area);
        System.out.println("Third circle: perimeter = " + circle3.perimeter + " area = " + circle3.area);
        System.out.println("\n");

        System.out.println("First triangle: perimeter = " + triangle1.perimeter + " area = " + triangle1.area);
        System.out.println("Second triangle: perimeter = " + triangle2.perimeter + " area = " + triangle2.area);
        System.out.println("Third triangle: perimeter = " + triangle3.perimeter + " area = " + triangle3.area);
        System.out.println("\n");

        System.out.println("First square: perimeter = " + square1.perimeter + " area = " + square1.area);
        System.out.println("Second square: perimeter = " + square2.perimeter + " area = " + square2.area);
        System.out.println("Third square: perimeter = " + square3.perimeter + " area = " + square3.area);
        System.out.println("\n");

        A a = new B();
        a.f();

        B b = new C();
        b.f();

        A c = new C();
        c.f();

        A d = new A();
        d.f(1);

        B f = new C();
        f.f(1);

        A g = new C();
        g.f(1);




    }
}
