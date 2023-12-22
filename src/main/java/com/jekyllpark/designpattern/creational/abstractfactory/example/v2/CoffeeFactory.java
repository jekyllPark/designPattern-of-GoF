package com.jekyllpark.designpattern.creational.abstractfactory.example.v2;

public class CoffeeFactory implements BeverageFactory{
    @Override
    public Beverage makeBeverage(String name) {
        return new Coffee(name);
    }
}
