package factory.v1;

public class Pizza {
    void prepare() {
        System.out.println("준비");
    }

    void bake() {
        System.out.println("굽기");
    }

    void cut() {
        System.out.println("자르기");
    }

    void box() {
        System.out.println("포장");
    }
}
