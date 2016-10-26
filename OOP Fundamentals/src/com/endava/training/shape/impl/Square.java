package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;

/**
 * Created by isirbu on 10/26/2016.
 */

public class Square implements Shape2D{

    public int latura;
    public double area;
    public int perimeter;

    public Square (int latura){

        this.latura = latura;

    }

    public void computeArea(){

        area = Math.pow(latura,2);

    }

    public void computePerimeter(){

        perimeter = 4 * latura;

    }
}
