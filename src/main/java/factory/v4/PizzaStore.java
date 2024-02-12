package factory.v4;



public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = makePizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza makePizza(String type);
}
