package com.codi.decorator;

/**
 * Created by Codi on 2015/7/15 0015.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double coast() {
        return 0.89;
    }
}
