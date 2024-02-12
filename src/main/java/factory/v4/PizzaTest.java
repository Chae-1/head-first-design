package factory.v4;

import factory.v4.chicago.ChicagoPizzaStore;

public class PizzaTest {
    public static void main(String[] args) {
       PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
       Pizza basic = chicagoPizzaStore.orderPizza("basic");

    }
}
