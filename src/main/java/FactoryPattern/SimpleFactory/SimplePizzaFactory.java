package FactoryPattern.SimpleFactory;

import FactoryPattern.CheesePizza;
import FactoryPattern.GreekPizza;
import FactoryPattern.PepperPizza;
import FactoryPattern.Pizza;

public class SimplePizzaFactory {
    public Pizza CreatePizza(String ordertype) {
        Pizza pizza = null;
        if (ordertype.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (ordertype.equals("greek")) {
            pizza = new GreekPizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new PepperPizza();
        }
        return pizza;
    }
}
