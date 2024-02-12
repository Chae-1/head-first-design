package factory.v3.chicago;

import factory.v3.Pizza;

public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        this.name = "시카고 스타일 소스와 치즈 피자";
        this.dough = "두꺼운 크러스트 도우";
        this.sauce = "토마토 소스";

        toppings.add("두껍게 썬 모짜렐라 치즈");
    }
}
