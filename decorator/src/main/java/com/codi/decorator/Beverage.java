package com.codi.decorator;

/**
 * Created by Codi on 2015/7/15 0015.
 */
public abstract class Beverage {

    String description = "Unknown Beverage";
    int size = 0;

    public abstract double coast();

    public String getDescription() {
        return description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
