package factory.v2.ny;

import factory.v2.Pizza;

public class NYPepperoniPizza extends Pizza {
    public NYPepperoniPizza() {
        this.name = "뉴옥 페퍼로니 피자";
        this.dough = "얇은 씬 크러스트";
        this.sauce = "크림 소스";

        this.toppings.add("레지아노 치즈");
    }
}
