package com.codi.decorator;

/**
 * Created by Codi on 2015/7/15 0015.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double coast() {
        return 1.99;
    }
}
