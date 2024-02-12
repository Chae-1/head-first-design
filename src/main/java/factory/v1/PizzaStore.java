package factory.v1;

public class PizzaStore {
    public Pizza pizza(String type) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        Pizza pizza = factory.makePizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
