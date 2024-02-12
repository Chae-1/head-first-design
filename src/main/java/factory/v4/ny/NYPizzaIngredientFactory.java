package factory.v4.ny;

import factory.v4.Cheese;
import factory.v4.Dough;
import factory.v4.PizzaIngredientFactory;
import factory.v4.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new NYDough();
    }

    @Override
    public Cheese createCheese() {
        return new NYCheese();
    }

    @Override
    public Sauce createSauce() {
        return new NYSauce();
    }
}
