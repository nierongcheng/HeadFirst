package com.codi.decorator;

/**
 * Created by Codi on 2015/7/15 0015.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double coast() {
        return 0.2 + beverage.coast();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
