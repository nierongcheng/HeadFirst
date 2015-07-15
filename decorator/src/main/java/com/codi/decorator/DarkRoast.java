package com.codi.decorator;

/**
 * Created by Codi on 2015/7/15 0015.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double coast() {
        return 0.99;
    }
}
