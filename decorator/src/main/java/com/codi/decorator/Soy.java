package com.codi.decorator;

/**
 * Created by Codi on 2015/7/15 0015.
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double coast() {
        double extraCoast;
        if(size == -1) {
            extraCoast = 0.1;
        } else if(size == 0) {
            extraCoast = 0.15;
        } else {
            extraCoast = 0.2;
        }
        return 0.15 + extraCoast + beverage.coast();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
