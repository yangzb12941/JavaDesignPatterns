package FactoryPattern.AbstractFactory;

import FactoryPattern.Pizza;

public interface AbsFactory {
    Pizza CreatePizza(String ordertype) ;
}
