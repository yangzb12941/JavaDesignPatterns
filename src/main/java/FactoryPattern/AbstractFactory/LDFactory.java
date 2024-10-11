package FactoryPattern.AbstractFactory;

import FactoryPattern.CheesePizza;
import FactoryPattern.PepperPizza;
import FactoryPattern.Pizza;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza CreatePizza(String ordertype) {
        Pizza pizza = null;
        if ("cheese".equals(ordertype)) {
            pizza = new CheesePizza();
        } else if ("pepper".equals(ordertype)) {
            pizza = new PepperPizza();
        }
        return pizza;
    }
}
