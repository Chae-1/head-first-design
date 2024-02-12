package factory.v4.chicago;

import factory.v4.Cheese;
import factory.v4.Dough;
import factory.v4.PizzaIngredientFactory;
import factory.v4.Sauce;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ChicagoDough();
    }

    @Override
    public Cheese createCheese() {
        return new ChicagoCheese();
    }

    @Override
    public Sauce createSauce() {
        return new ChicagoSauce();
    }
}
