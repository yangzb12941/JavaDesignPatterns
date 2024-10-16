package FactoryPattern.AbstractFactory;

import FactoryPattern.GreekPizza;
import FactoryPattern.Pizza;

public class NYFactory implements AbsFactory {
    @Override
    public Pizza CreatePizza(String ordertype) {
        Pizza pizza = null;
        if ("greek".equals(ordertype)) {
            pizza = new GreekPizza();
        }
        return pizza;
    }
}
