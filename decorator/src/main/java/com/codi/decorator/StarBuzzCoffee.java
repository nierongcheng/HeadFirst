package com.codi.decorator;

/**
 * Created by Codi on 2015/7/15 0015.
 */
public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.coast());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Soy(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.coast());
    }

}
