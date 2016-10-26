package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;
import java.lang.Math;

/**
 * Created by isirbu on 10/26/2016.
 */

public class Triangle implements Shape2D{

    public int laturaAB;
    public int laturaAC;
    public int laturaBC;
    public double area;
    public int perimeter;

    public Triangle (int laturaAB, int laturaAC, int laturaBC ){

        this.laturaAB = laturaAB;
        this.laturaAC = laturaAC;
        this.laturaBC = laturaBC;

    }


    public void computeArea(){

        int semiPerimeter = (laturaAB + laturaBC + laturaAC) / 2;
        area = Math.sqrt(semiPerimeter * (semiPerimeter + laturaAB)
                * (semiPerimeter + laturaAC) * (semiPerimeter + laturaBC));
        area = Math.floor(area * 100) / 100;

    }

    public void computePerimeter(){

        perimeter = laturaAB + laturaBC + laturaAC;

    }
}
