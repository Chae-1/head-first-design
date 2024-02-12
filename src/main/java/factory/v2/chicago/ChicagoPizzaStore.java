package factory.v2.chicago;

import factory.v2.Pizza;
import factory.v2.PizzaStore;
import factory.v2.ny.NYCheesePizza;
import factory.v2.ny.NYPepperoniPizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza makePizza(String type) {
        Pizza pizza = null;
        if (type.equals("pepperoni")) {
            pizza = new NYPepperoniPizza();
        } else if (type.equals("cheese")) {
            pizza = new NYCheesePizza();
        }
        return pizza;
    }
}
