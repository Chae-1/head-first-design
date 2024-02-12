package factory.v4;

public class BasicPizza extends Pizza {
    PizzaIngredientFactory factory;

    public BasicPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        this.cheese = factory.createCheese();
        this.dough = factory.createDough();
        this.sauce = factory.createSauce();
    }
}
