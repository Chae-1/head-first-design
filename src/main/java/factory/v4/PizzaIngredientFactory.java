package factory.v4;

public interface PizzaIngredientFactory {
    Dough createDough();
    Cheese createCheese();
    Sauce createSauce();
}
