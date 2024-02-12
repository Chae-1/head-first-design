package factory.v4.ny;

import factory.v4.Pizza;
import factory.v4.PizzaIngredientFactory;

@Deprecated
public class NYBasicPizza extends Pizza {
    PizzaIngredientFactory factory;

    public NYBasicPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        this.cheese = factory.createCheese();
        this.dough = factory.createDough();
        this.sauce = factory.createSauce();
    }
}
