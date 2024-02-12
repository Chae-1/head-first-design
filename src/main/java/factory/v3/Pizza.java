package factory.v3;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();


    void prepare() {
        System.out.println("준비 중: " + name);
    }

    void bake() {
        System.out.println("175도에서 25분간 굽기");
    }

    void cut() {
        System.out.println("사선으로 자르기");
    }

    void box() {
        System.out.println("피자를 상자에 담기");
    }

    public String getName() {
        return name;
    }
}
