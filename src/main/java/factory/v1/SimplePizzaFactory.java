package factory.v1;

public class SimplePizzaFactory {
    public Pizza makePizza(String type) {
        Pizza pizza = null;

        // 구상 클래스를 선택하는 부분이 변경
        if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
