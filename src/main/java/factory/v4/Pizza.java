package factory.v4;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;

    public abstract void prepare();

    void bake() {
        System.out.println("175도에서 25분간 굽기");
    }

    void cut() {
        System.out.println("사선으로 자르기");
    }

    void box() {
        System.out.println("피자를 상자에 담기");
    }

}
