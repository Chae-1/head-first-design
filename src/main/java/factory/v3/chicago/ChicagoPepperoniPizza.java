package factory.v3.chicago;

import factory.v3.Pizza;

public class ChicagoPepperoniPizza extends Pizza {
    public ChicagoPepperoniPizza() {
        this.name = "시카고 스타일 소스와 페퍼로니 피자";
        this.dough = "두꺼운 크러스트 도우";
        this.sauce = "토마토 소스";

        toppings.add("페퍼로니");
    }
}
