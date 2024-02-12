package factory.v3;

import factory.v3.chicago.ChicagoCheesePizza;
import factory.v3.chicago.ChicagoPepperoniPizza;
import factory.v3.ny.NYCheesePizza;
import factory.v3.ny.NYPepperoniPizza;

public class PizzaStore {
    public Pizza orderPizza(String style, String type) {
        Pizza pizza = null;
        if (style.equals("ny")) {
            if (type.equals("cheese")) {
                pizza = new NYCheesePizza();
            } else if (type.equals("pepperoni")) {
                pizza = new NYPepperoniPizza();
            }
        } else if (style.equals("chicago")) {
            if (type.equals("cheese")) {
                pizza = new ChicagoCheesePizza();
            } else if (type.equals("pepperoni")) {
                pizza = new ChicagoPepperoniPizza();
            }
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
