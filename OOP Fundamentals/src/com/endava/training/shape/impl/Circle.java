package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;
import java.lang.Math;

/**
 * Created by isirbu on 10/26/2016.
 */

public class Circle implements Shape2D {

    public int radius;
    public double area;
    public double perimeter;

    public Circle (int radius){

        this.radius = radius;

    }

    public void computeArea(){

        area = Math.PI * Math.pow(radius,2);
        area = Math.floor(area * 100) / 100;

    }

    public void computePerimeter(){

        perimeter = 2 * Math.PI * radius;
        perimeter = Math.floor(perimeter * 100) / 100;

    }
}
