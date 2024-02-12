package factory.v4.chicago;

import factory.v4.BasicPizza;
import factory.v4.Pizza;
import factory.v4.PizzaIngredientFactory;
import factory.v4.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza makePizza(String type) {
        PizzaIngredientFactory factory = new ChicagoIngredientFactory();
        Pizza pizza = new BasicPizza(factory);
        return pizza;
    }
}
