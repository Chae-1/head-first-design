package factory.v4.chicago;

import factory.v4.Pizza;
import factory.v4.PizzaIngredientFactory;

@Deprecated
public class ChicagoBasicPizza extends Pizza {

    private PizzaIngredientFactory factory;
    public ChicagoBasicPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        this.dough = factory.createDough();
        this.cheese = factory.createCheese();
        this.sauce = factory.createSauce();
    }
}
