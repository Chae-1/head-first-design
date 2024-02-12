package factory.v2.ny;

import factory.v2.Pizza;
import factory.v2.PizzaStore;

public class NYStylePizzaStore extends PizzaStore {
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
