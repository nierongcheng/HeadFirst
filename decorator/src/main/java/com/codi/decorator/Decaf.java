package com.codi.decorator;

/**
 * Created by Codi on 2015/7/15 0015.
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double coast() {
        return 1.05;
    }
}
